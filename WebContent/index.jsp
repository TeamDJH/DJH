<%@ page import="djh.*" %>
<%@ page import="org.json.*" %>
<%
	Collect col = null;
	Cluster clu = null;
	JSONArray clusters = null;
	JSONObject stuff = null;
	String topicParam = request.getParameter("topic");
	if(topicParam == null) {
		topicParam = "";
	} else {
		col = new Collect(topicParam);
		clu = new Cluster(col.getList());
		stuff = clu.getClusters();
		JSONObject results = stuff.getJSONObject("results");
		clusters = results.getJSONArray("clusters");
	}

%>
<html>
	<head>
	<title>DJH</title>
	<link type="text/css"rel="stylesheet" href="styles.css">  
	</head>
	<body>
	<header>
	<h1>Welcome to Team DJH's Twitter Project!</h1>
	<form>Enter topic: <input name="topic" onkeypress="pressedKey(event)" value="<%=topicParam%>"></form>
	</header>
	<div id = "content">
	<div id="topics">
	<script>
		var clusters = [];
		var clusterMap = {};
		
		function pressedKey(event) {
			if(event.keyCode == 13) {
				var topic = document.forms[0].topic.value;
				window.location.href = "?topic=" + window.encodeURIComponent(topic);
			}
		}
		
		
		function displayTweets(topic) {
			
			var cluster = clusterMap[topic];
			var tweets = cluster.tweets;
			var html = "<h3>" + topic.toUpperCase() + "</h3>";
			
			for(var i=0; i<tweets.length; i++) {
				html += "<p>" + tweets[i] + "</p>";
			}
			
			document.getElementById('tweets').innerHTML = html;
		}
	</script>
	<% if(clusters != null) { %>
		<% for(int i = 0; i<clusters.length(); i++){
				JSONObject cluster = clusters.getJSONObject(i);
				JSONArray sentences = cluster.getJSONArray("clusteredSentences");
				String topic = cluster.getString("clusterTopics").replaceAll("\\[", "").replaceAll("\\]", "");
				int index = topic.indexOf(":");
				if(index > 0) {
					topic = topic.substring(0, index);
				}
				if(!topic.equals("sentences_with_no_cluster_membership")) {
		%>
		<script>
			var cluster = {};
			var tweets = [];
			<%
					for(int j = 0; j<sentences.length(); j++) {
			%>
			tweets.push('<%=((String)sentences.get(j)).replaceAll("'","\\'")%>');
			<%
					}
			%>
			cluster.topic = '<%=topic%>';
			cluster.tweets = tweets;
			clusters.push(cluster);
			clusterMap[cluster.topic] = cluster;
		</script>
		<h3><a href="javascript:void(0)" onClick="displayTweets('<%=topic%>')"><%=topic%> (<%=cluster.getInt("clusterSize")%>)</a></h3>
		<% }} %>
	</div>
	<div id="tweets">
	<h2>Tweets</h2>
	
	<script>
		displayTweets(clusters[0].topic);
	</script>
	</div>
	</div>
<h3 id="show" tabindex="0">Show XML</h3>
<div id="XML" >
<pre><%=clu.getXML().replaceAll("<","&lt;").replaceAll(">","&gt;")%></pre>
</div>
<% } %>
	</body>
</html>
