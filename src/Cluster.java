import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Cluster {

	public static void main(String[] args[]) throws UnirestException {
		// These code snippets use an open-source library.
		// http://unirest.io/java
		@SuppressWarnings("unused")
		HttpResponse<JsonNode> response = Unirest.post("https://rxnlp-core.p.mashape.com/getTextFromHTML")
				.header("X-Mashape-Key", "ZppTyXiFjxmshlUgnw78pZBfmKVGp1v6lxNjsnEbt7jwxUoMKh")
				.header("Content-Type", "application/json").header("Accept", "application/json")
				.body("{\"input\":\"http://www.rxnlp.com\",\"keepLineBreak\":\"false\"}").asJson();
	}
}