package djh;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Cluster {

	private JSONObject stuff;

	public Cluster(ArrayList<Tweet> list) {
		JSONObject body = new JSONObject();
		JSONArray text = new JSONArray();
		body.put("type", "pre-sentenced");
		body.put("text", text);
		for (Tweet tweet : list) {
			JSONObject candy = new JSONObject();
			candy.put("sentence", tweet.getText());
			text.put(candy);
		}
		HttpResponse<JsonNode> response = null;
		try {
			response = Unirest.post("https://rxnlp-core.p.mashape.com/generateClusters")
					.header("X-Mashape-Key", "FRk8NLuhbymshi1CWCbaejNQQqB4p1mtS9ojsnXUCGHYjxW6Nt")
					.header("Content-Type", "application/json").header("Accept", "application/json")
					.body(body.toString()).asJson();
		} catch (UnirestException e) {
			e.printStackTrace();
		}

		// retrieve the parsed JSONObject from the response
		stuff = response.getBody().getObject();
		JSONObject results = stuff.getJSONObject("results");
		JSONArray clusters = results.getJSONArray("clusters");

		for (int i = 0; i < clusters.length(); i++) {
			JSONObject cluster = clusters.getJSONObject(i);
			JSONArray sentences = cluster.getJSONArray("clusteredSentences");
			for (int j = 0; j < sentences.length(); j++) {
				String sentence = (String) sentences.get(j);
				int colonIndex = sentence.indexOf(":");
				String sequence = sentence.substring(0, colonIndex);
				int tweetIndex = Integer.parseInt(sequence);
				Tweet tweet = list.get(tweetIndex);
				sentence = tweet.getUsername() + " : " + tweet.getText();
				sentences.put(j, sentence);
			}
		}
	}

	public JSONObject getClusters() {
		return stuff;
	}

	public String getXML() {
		return toPrettyString(XML.toString(stuff), 4);
	}

	public static String toPrettyString(String xml, int indent) {
		try {
			// Turn xml string into a document
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(new InputSource(new ByteArrayInputStream(xml.getBytes("utf-8"))));

			// Remove whitespaces outside tags
			XPath xPath = XPathFactory.newInstance().newXPath();
			NodeList nodeList = (NodeList) xPath.evaluate("//text()[normalize-space()='']", document,
					XPathConstants.NODESET);

			for (int i = 0; i < nodeList.getLength(); ++i) {
				Node node = nodeList.item(i);
				node.getParentNode().removeChild(node);
			}

			// Setup pretty print options
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformerFactory.setAttribute("indent-number", indent);
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");

			// Return pretty print xml string
			StringWriter stringWriter = new StringWriter();
			transformer.transform(new DOMSource(document), new StreamResult(stringWriter));
			return stringWriter.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}