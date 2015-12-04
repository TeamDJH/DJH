import java.io.*; 
import java.net.*;
import java.util.*;
import twitter4j.*;
import twitter4j.auth.*;

public class Collect {
	
	static String userid = "djh_cs3250@yahoo.com", password = "djh3250djh3250",
			url = "https://api.twitter.com/1.1/search/tweets.json",
			requestParamName = "track", 
			requestParamValue = "marvel,dc commics";
	Twitter twitter;
	HttpParameter[] parameters;// 
	HttpParameter hp1;
	BasicAuthorization ba;// 
	HttpRequest req;// 
	AuthorizationFactory authConf;
	Map<String,String> requestHeaders;

	public Collect()
	{

		//twitter = TwitterFactory.getSingleton();
		//authConf = new AuthorizationConfiguration();
		hp1 = new HttpParameter( requestParamName, requestParamValue);
		parameters = new HttpParameter[1];
		parameters[0] = hp1;
		ba = new BasicAuthorization(userid, password);
		//twitter.getAuthorization();
		req = new HttpRequest(RequestMethod.GET ,url , parameters, ba , requestHeaders);
		
	}
	
	
    public static void main(String[] args) throws Exception {
		
		Collect col = new Collect();
		
    /*    URL twitter = new URL(
        		//"https://twitter.com/search"
        		"https://api.twitter.com/1.1/search/tweets.json"
        		+ "?q=marvel"); //https://stream.twitter.com/1.1/statuses/filter.json
        BufferedReader in = new BufferedReader(
        new InputStreamReader(twitter.openStream()));*/
        
        System.out.println("open stream");
        String inputLine = col.connect(userid, password);
        
      // while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
       // in.close();
    }
    
    public String connect(String userid, String password){
    	Twitter twitter = TwitterFactory.getSingleton();
    	return ba.getAuthorizationHeader(req);
    	
    	
    }
    	
    
}
