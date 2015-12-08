

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.RateLimitStatus;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.Authorization;
import twitter4j.auth.OAuth2Authorization;
import twitter4j.auth.OAuth2Support;
import twitter4j.auth.OAuth2Token;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.conf.PropertyConfiguration;

public class Collect {
   static final int CONSUMER_KEY = 1,
			CONSUMER_SECRET = 2,	
			TOKEN = 4,
			TOKEN_TYPE = 8,
			ALL_KEYS = 15,
			MAX_COUNT = 100;
	String name = "Djh3250", userid = "djh_cs3250@yahoo.com", password = "djh3250djh3250",
			url = "https://api.twitter.com/1.1/search/tweets.json",
			filterUrl = "https://stream.twitter.com/1.1/statuses/filter.json",
			requestParam = "marvel, dc commics",
			consumerKey = "KPTU9UXuKAKm3TnS8Nuk4FPVn",
			consumerSecret = "U1eaVoBtJkQKDwo7L4FJMrluzCC4Dq8rUfnSarKEH8X5YD26zf",	
			token = "",
			tokenSecret = "",
			consumer = "oauth.consumerKey",
			consumerSec = "oauth.consumerSecret",
			aToken= "oauth.accessToken",
			aTokenSecret= "oauth.accessTokenSecret",
			app_only_authentication = "https://api.twitter.com/oauth2/token",
			request_token_URL = "https://api.twitter.com/oauth/request_token",
			authorize_URL = "https://api.twitter.com/oauth/authorize",
			access_token_URL = "https://api.twitter.com/oauth/access_token";
	OAuth2Token oAuth2Token; 
	Twitter twitter;

	TwitterStream twitterStream	;
	//TwitterStreamFactory twitFactory;
    File file; 
    InputStream inStream;
    OutputStream outStream;
    FileInputStream fis;
    FileOutputStream fr;
    URL twitUrl;
    RequestToken requestToken;
    OAuth2Authorization oAuth2;
    OAuthAuthorization oAuth;
    AccessToken accessToken;
    Properties properties;
    PropertyConfiguration propConf;
    ConfigurationBuilder configBuild;

    

	public Collect()
	{	
		boolean getacc = false;
		properties = new Properties();
	    file = new File("twitter.properties");
	//	System.out.println("value: "+ getProperties());
		propConf = new PropertyConfiguration(properties); 
//		oAuth2 = new OAuth2Authorization(propConf);
//		oAuth2.setOAuthConsumer(consumerKey, consumerSecret);

		oAuth = new OAuthAuthorization(propConf);
		oAuth.setOAuthConsumer(consumerKey, consumerSecret);
		//oAuth.
		getStream();
		//twitFactory = new TwitterStreamFactory(propConf);
		
	}
	
	
	
//    public static void main(String[] args) throws Exception {
//		
//		Collect col = new Collect();
//		col.query(col.requestParam);
//       //col.getAccess();
//        		//"https://twitter.com/search"
//        		//"https://api.twitter.com/1.1/search/tweets.json"
//        		//+ "?q=marvel"); //https://stream.twitter.com/1.1/statuses/filter.json
//     
//		if(col.getProperties())
//		{
//			col.connect();
//        System.out.println("open stream, token: " + col.token );
//        String inputLine = 
//		}
      // while ((inputLine = in.readLine()) != null)
        //    System.out.println(inputLine);
       // in.close();
    }
    
    int getProperties()
    {
    	
    	int read = 0;
    	String value = "";
    	if(file.exists())
    	{
    		try{ fis = new FileInputStream (file);
    			properties.load(fis);
    			if((consumerKey = properties.getProperty(consumer)) != null) read += CONSUMER_KEY;
    			if((consumerSecret = properties.getProperty(consumerSec)) != null) read += CONSUMER_SECRET;    			
    			if((token = properties.getProperty(aToken)) != null) read += TOKEN;
    			if((tokenSecret = properties.getProperty(aTokenSecret)) != null) read += TOKEN_TYPE;
    			//if(read == ALL_KEYS)
    			//	oAuth2Token = new OAuth2Token(tokenSecret, token);
  			}catch(Exception e)
    		{
  				e.printStackTrace();
    		}finally
    		{
    			try{
    			fis.close();
    			}catch(Exception ignore){}
    		}
    	}
    	return read;
    }
    
    
    
    public void getStream()
    {
    	try{
    		System.out.println("line 152 ");
    		//requestToken = oAuth.getOAuthRequestToken("oob");
//    		oAuth2Token = oAuth2.getOAuth2Token();
    		System.out.println("line 155:");// "+requestToken.toString());
//    		oAuth2.setOAuth2Token(oAuth2Token);
//	    	//twitter = new TwitterFactory(propConf).getInstance();
	    	twitterStream = new TwitterStreamFactory(propConf).getInstance();
	    	twitterStream.setOAuthConsumer(consumerKey, consumerSecret);
	    	accessToken = twitterStream.getOAuthAccessToken(name, password);
    		System.out.println("accessToken:"+ accessToken);//twitterStream.setOAuthAccessToken());
	    	//twitter.setOAuth2Token(oAuth2Token);
	    	//twitterStream = new TwitterStreamFactory().getInstance();
//	    	twitter.setOAuthConsumer(consumerKey, consumerSec);	   
//	    	//requestToken = twitter.;
//	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	        while (null == accessToken) {
//	            System.out.println("Open the following URL and grant access to your account:");
//	            System.out.println(requestToken.getAuthorizationURL());
//	            try {
//	                Desktop.getDesktop().browse(new URI(requestToken.getAuthorizationURL()));
//	            } catch (Exception e) {
//	                e.printStackTrace();
//	            }
//	            System.out.print("Enter the PIN(if available) and hit enter after you granted access.[PIN]:");
//	            String pin = br.readLine();
//	            try {
//	                if (pin.length() > 0) {
//	                    accessToken = twitter.getOAuthAccessToken(requestToken, pin);
//	                } else {
//	                    accessToken = twitter.getOAuthAccessToken(requestToken);
//	                }
//	            } catch (TwitterException te) {
//	                if (401 == te.getStatusCode()) {
//	                    System.out.println("Unable to get the access token.");
//	                } else {
//	                    te.printStackTrace();
//	                }
//	            }
//	        }
//	
//	        System.out.println("Got access token.");
//	        System.out.println("Access token: " + accessToken.getToken());
//	        System.out.println("Access token secret: " + accessToken.getTokenSecret());
//	
//	        try {
//	        	properties.setProperty("oauth.accessToken", accessToken.getToken());
//	        	properties.setProperty("oauth.accessTokenSecret", accessToken.getTokenSecret());
//	            outStream = new FileOutputStream(file);
//	            properties.store(outStream, "twitter4j.properties");
//	            outStream.close();
//	        } catch (IOException ioe) {
//	            ioe.printStackTrace();
//	            System.exit(-1);
//	        } finally {
//	            if (outStream != null) {
//	                try {
//	                	outStream.close();
//	                } catch (IOException ignore) {
//	                }
//	            }
//	        }
//	        System.out.println("Successfully stored access token to " + file.getAbsolutePath() + ".");
//	        System.exit(0);
	    } catch (TwitterException te) {
	        te.printStackTrace();
	        System.out.println("Failed to get accessToken: " + te.getMessage());
	        System.exit(-1);
	    } 
    

    }
    
    
 	public void writeProperties()
 	{
 		try{
 			properties.setProperty(consumer, consumerKey);
 			properties.setProperty(consumerSec, consumerSecret);
 			properties.setProperty(aToken, oAuth2Token.getAccessToken());
 			properties.setProperty(aTokenSecret, oAuth2Token.getTokenType());
 			fr = new FileOutputStream (file);
 			properties.store(fr, "twitter.properties");

		}catch(Exception e){
			e.printStackTrace();
		}finally
 		{
			try{
				fr.close();
			}catch(Exception ignore){}
						
 		}

 	}
 	
 	
    public void query(String terms){
    	Query qry = new Query(terms);
    	qry.setCount(MAX_COUNT);
    	try {
    		QueryResult result;
            do {
            	System.out.println("this is a test @");
                result = twitter.search(qry);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                }
            } while ((qry = result.nextQuery()) != null);
			//System.out.println("search results:\n"+twitter.search(qry).toString());
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    




}
    