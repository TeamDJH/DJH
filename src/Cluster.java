import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Cluster {

	public static void main(String[] args[]) throws UnirestException {
		// FRk8NLuhbymshi1CWCbaejNQQqB4p1mtS9ojsnXUCGHYjxW6Nt
		// These code snippets use an open-source library.
		// http://unirest.io/java
		HttpResponse<JsonNode> response = Unirest.post("https://rxnlp-core.p.mashape.com/generateClusters")
				.header("X-Mashape-Key", "FRk8NLuhbymshi1CWCbaejNQQqB4p1mtS9ojsnXUCGHYjxW6Nt")
				.header("Content-Type", "application/json").header("Accept", "application/json")
				.body("{\"type\":\"pre-sentenced\",\"text\":[{\"sentence\":\": Welcome to Tanzania ! � Citibank Poor Credit Cards\"},{\"sentence\":\"@AdamCSmith good idea ! chase and citibank have been the worst blood suckers for me , and I will be done with them real soon !\"},{\"sentence\":\"Add your signature to #citibank sucks page :\"},{\"sentence\":\"Almost had a heart attack looking at my Citibank Student Loan account . Turns out it was a false alarm \"},{\"sentence\":\"Analysts Reports Show Continuing Concern About Bad Loans at Citibank ( NYSE : C ) , Bank of America Corp. ( NYSE : BAC ) , ...\"},{\"sentence\":\"And blow up and disappear to nothing . I 'm going to fucking chase ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !\"},{\"sentence\":\"Annoyed by citibank 's fees and lack of benefits .\"},{\"sentence\":\"Bad Credit Car Loans Related Article | Card Citibank Credit : Bad credit remortgage is the artefact for you if you ...\"},{\"sentence\":\"Bad Credit Car Loans Related Article | Card Citibank Credit : I am sure your quest for Bad Credit Car Loans has com ..\"},{\"sentence\":\"Bad Credit Cash Loans : Beat your Financial Crises | Card Citibank Bad Credit Cash Loans Online : Fast Cash in Need | Card Citibank Credit : Bad Credit Cash Loans Online : An Introduct ...\"},{\"sentence\":\"bad credit loans | Card Citibank Credit\"},{\"sentence\":\"Bad Credit Unsecured Personal Loans � Chase , Citi , Capital One But No Bank of ...\"},{\"sentence\":\"Bad Credit Unsecured Personal Loans � Chase , Citi , Capital One But No Bank of ... : Bad credit unsecured personal l ...\"},{\"sentence\":\"Bad news : Somebody in Hawaii charged porn to my credit card .\"},{\"sentence\":\"BAD PROFITS by Citibank \"},{\"sentence\":\"Bank of America approved my application ! See ya later , Citibank , you fucking crooks !\"},{\"sentence\":\"@BillMcCabe I 've been going rounds with Comcast and Verizon customer service reps all week . I 've heard bad things about Citibank too .\"},{\"sentence\":\"@blah_blah_idc smdh I 'm about to call Obama and tell him to tell Citibank stop with the fucking overdraft fees ! ! !\"},{\"sentence\":\"Bodo lah CITIBANK ! Your service is CRAP ! ! ! !\"},{\"sentence\":\"Breaking Now ! Terrible service : I HAD a Citibank supplementary credit card under my father 's name but I rarely use ...\"},{\"sentence\":\"But their systems are so archaic , that they are customer unfriendly .. #citibank #fail\"},{\"sentence\":\"calling citibank to check the balance on a gift card . this line really sucks \"},{\"sentence\":\"Can anyone confirm ? #Citibank #security #dataloss #fail #rumor #rumour\"},{\"sentence\":\"Car loan for the new and old � Citibank Poor Credit Cards\"},{\"sentence\":\"Car loan for the new and old � Citibank Poor Credit Cards : In India , auto loans for new cars , used cars and car pa ..\"},{\"sentence\":\"@charlestrippy The problem with Blippy reportedly impacts Citibank Mastercard holders , and no others . Still , a bad bug \"},{\"sentence\":\"christinagan What are you switching to ? CitiBank sucks but they did not even ask why I was closing just gave me my money \"},{\"sentence\":\"Citi card acct closed ; going through the last steps to close down Citi current acct ; then , I ' ll be free of the big bad bank .\"},{\"sentence\":\"Citibank , thank you for giving me wrong information so I walked all the way to the branch with all my change ...\"},{\"sentence\":\"Citibank , Thanks for letting me know you sent me a new card ( wrong address ) making the one in my wallet unusable  you know , fuck yourselves\"},{\"sentence\":\"Citibank : your customer service sucks .\"},{\"sentence\":\"Citibank , your student loan site is awful .\"},{\"sentence\":\"Citibank are ninjas at catching fraudulent charges .\"},{\"sentence\":\"Citibank bankers are accused of deceiving customers with the sale of Lehman Bros products \"},{\"sentence\":\"#citibank called me back after the tedious process I went thru to submit a complaint on that blardy rude call centre staff \"},{\"sentence\":\"citibank called to advise me to lower my credit limit , on a gold card I 've NEVER used , to protect me in tough econ times  from fraud #fail\"},{\"sentence\":\"Citibank charges a monthly fee on us poor people \"},{\"sentence\":\"Citibank credit card customer service sucks beyond belief \"},{\"sentence\":\"Citibank Credit Cards - What Weve Got Here is � Failure to Communicate \"},{\"sentence\":\"#citibank creditcard service sucks big time .\"},{\"sentence\":\"@citibank customer service poor\"},{\"sentence\":\"citibank #fail .... Worst customer experience ! ! ! !\"},{\"sentence\":\"Citibank Fraud detection absolutely sucks \"},{\"sentence\":\"@citibank has the absolute worst customer service .\"},{\"sentence\":\"citibank has the worst credit cards ever .\"},{\"sentence\":\"CitiBank Identity Theft Commercial � Citibank Poor Credit Cards\"},{\"sentence\":\"Citibank is my mortgage company . Well my past two pays were real crappy d/t taking care of family �\"},{\"sentence\":\"Citibank is such a terrible bank with terrible customer service .\"},{\"sentence\":\"Citibank MasterCard is the worst credit card I 've ever had Do not trust the bank that never sleeps Lack of sleep makes it grumpy Dump Citi\"},{\"sentence\":\"Citibank may be picking my pocket w/fees , but their fraud dept. is on the job . The bad news is I 'm out an ATM card until Saturday \"},{\"sentence\":\"CitiBank phone banking very slow ...\"},{\"sentence\":\"Citibank 's hotline is useless ..\"},{\"sentence\":\"Citibank 's internet banking is a usability disaster area \"},{\"sentence\":\"Citibank 's internet banking is a usability disaster area . Coincidentally , it 's also a functionality disaster area \"},{\"sentence\":\"Citibank sends me an annual Credit Card spending summary yet fails to list any of their \"},{\"sentence\":\"citibank site is getting on my nerves \"},{\"sentence\":\"#citibank telephone banking sucks\"},{\"sentence\":\"citibank_co_in does not allow you to login again , immediately after logout , unless you close your browser and restart it . #citibank #fail\"},{\"sentence\":\"Dear @citibank , thanks for blocking my card for my own safety . Be in another country without any fucking money is super safe\"},{\"sentence\":\"Dear #citibank , your website sucks because it does not allow me to view my statements on my mac because it will not detect acrobat reader\"},{\"sentence\":\"Do not ever take out any TJX credit card . It has the worst customer service .\"},{\"sentence\":\"ECR Citibank credit report information is reliable ? � Citibank Poor � : Citibank offers customers the opportunity t ...\"},{\"sentence\":\"Fraudulent Websites Alert - Citi Trust Bank Of Ghana\"},{\"sentence\":\"@fredlyfriendly #citibank has terrible customer service , high fees , and crappy management #MOVEYOURMONEY !\"},{\"sentence\":\"Free Credit Report ? Learn The Shocking Truth !\"},{\"sentence\":\"Fucking hate citibank and their fucking lying officers \"},{\"sentence\":\"Fucking hate citibank and their fucking lying officers . FUCKING LIARS \"},{\"sentence\":\"Got my euros ! : D but I 'm super disappointed with citibank !\"},{\"sentence\":\"GRRR ... Citibank has the most annoying customer service !\"},{\"sentence\":\"Hating Citibank ... they 've made some changes to their credit card systems and it is a nightmare of epic proportions .\"},{\"sentence\":\"Having a sunrise at c bean m Kiara . Cooling off after arguing w incompetent pol at citibank damansara perdana\"},{\"sentence\":\"Having nightmare with Citibank IVR system\"},{\"sentence\":\"heard a recording at work . great to know that citibank 's upper management are a bunch of rude pricks .\"},{\"sentence\":\"Hello credit union ... good bye fucking #citibank !\"},{\"sentence\":\"Home Loan - georgia bad credit home loan on Shine : georgia bad credit home loan citi bank home equity loan home lo .\"},{\"sentence\":\"Home Loan - georgia bad credit home loan on Shine : georgia bad credit home loan citi bank home equity loan home lo ...\"},{\"sentence\":\"hsbc #fail : inept customer service reps  NOT a &global& bank , intl wire transfers are a nightmare . poor boo \"},{\"sentence\":\"I have been trying to login since today evening .. #citibank #fail\"},{\"sentence\":\"I joined Twitter just so that I could tell people how UNHELPFUL AND TERRIBLE CITIBANK IS .\"},{\"sentence\":\"I love it when a company gives me awful service and then sends me a satisfaction survey \"},{\"sentence\":\"I really hate Citibank though we 've been their long-time client . Service is mediocre at best \"},{\"sentence\":\"I said wrong number and hung up . economy so bad , you hire dyslexics ?\"},{\"sentence\":\"I think Citibank Philippines has a lousy call center .\"},{\"sentence\":\"I think Citibank Philippines has a lousy call center . I always get unprofessional customer service reps when I call them \"},{\"sentence\":\"I 've been annoyed with citibank since e Annual Fees fiasco .\"},{\"sentence\":\"I 've just been a victim at Citibank . #customersrevice #fail\"},{\"sentence\":\"idiot from citibank called asking for CASTILA . I said wrong number and hung up \"},{\"sentence\":\"IndianOil Citibank Titanium Credit Card - #citibank can tell the criteria for applying credit card even before filling out online form #fail\"},{\"sentence\":\"interesting error msg from #citibank Am I logged in or logged out ? #ux #usability #fail\"},{\"sentence\":\"It would appear that somebody in France was using my credit card info . Luckily , CitiBank protects against fraudulent baguette charges \"},{\"sentence\":\"jesus , I may switch to chase sapphire simply bc citibank is annoying the hell out of me with not allowing me to skip to customer \"},{\"sentence\":\"JRL is Sheikh-ing an Indian translator to help communicate by phone with the incompetent fucks at Citibank before ' He throws the towel in ' \"},{\"sentence\":\"Just left Citibank Gold - Useless bunch .\"},{\"sentence\":\"@kellipoliska The worst Customer Service experience I ever received was definitely #Citibank\"},{\"sentence\":\"@libreriasjosue very bad service ... CITI bank is charging for everything , canceling credit lines , making people crazy !\"},{\"sentence\":\"Make sure you check your bill statement every month . They might add strange transactions to yr acct !\"},{\"sentence\":\"Make your opinion more visible and sign #citibank sucks page :\"},{\"sentence\":\"meetshriram Had worse experience with HSBC Bangalore and Citibank Bangalore during inward remittances ..\"},{\"sentence\":\"@meetshriram Had worse experience with HSBC Bangalore and Citibank Bangalore during inward remittances .. shifted to SBI Banks in India #fail\"},{\"sentence\":\"@Miss_PrisPris ... Had bad experinces with citi ..\"},{\"sentence\":\"my citibank account is all screwed up and my house was broken into over the weekend .\"},{\"sentence\":\"#news #mortgage Bad Credit Unsecured Personal Loans � Chase , Citi , Capital One But No Bank of America Offers in May �\"},{\"sentence\":\"Nice ! Customer service was useless .\"},{\"sentence\":\"Nice . Dumped Citibank cards after years for poor customer service .\"},{\"sentence\":\"No , I do not understand why a manager can not call me back . #citibank #fail\"},{\"sentence\":\"No customer service at Citibank . Lack of phone access to human .\"},{\"sentence\":\"no way to email or phone Citi 's techies to say their security cert on part of the web site has been failing for days - dbl #Citibank #fail\"},{\"sentence\":\"Not only does citibank fund more coal power plants than any other bank - they raise your interest rates  have terrible customer service .\"},{\"sentence\":\"Obama Sued Citibank Under CRA to Force it to Make Bad Loans : Do you remember how we told you that the Democrats an ...\"},{\"sentence\":\"Oh Citibank , why 'd you change the format of your website ? And whats up with these annoying advertisements sprinkled into my CC statement ? !\"},{\"sentence\":\"Old news but citibank 's customer service sucks ....\"},{\"sentence\":\"OMG Suzi Orman just confirmed . Citibank has the worst credit card percents \"},{\"sentence\":\"On the phone with Citi bank credit card customer service , horrible customer service , rude support person \"},{\"sentence\":\"one credit card balance paid off . take your exorbitant rates and shove them up your ass , citibank !\"},{\"sentence\":\"@OurDesignedLife honestly they are all shysters had bad expw/ hsbc - chase - boa - citibank - washmutual ...\"},{\"sentence\":\"Petron not so much . Whats annoying about shell : citibank credit card peddlers \"},{\"sentence\":\"plus w exon ! All I can say is that poor citibank trader : (\"},{\"sentence\":\"@poojster very bad citi bank ke employees se ab yeh kaam karate hai , clowns pathetic @mac_outlaws\"},{\"sentence\":\"&The bank [ #citi ] said it has no evidence of a bad trade but is investigating the situation& CNBC\"},{\"sentence\":\"Really upset with @citibank new fee policy \"},{\"sentence\":\"Received Citibank acknowledgment in envelope with Credit Card # in clear-text against my name in addressee window . Clear cut risk #citi #fail\"},{\"sentence\":\"RT @airplanetalk : @meetshriram Had worse experience with HSBC Bangalore and Citibank Bangalore during inward remittances ..\"},{\"sentence\":\"RT @airplanetalk : @meetshriram Had worse experience with HSBC Bangalore and Citibank Bangalore during inward remittances .. shifted to SBI Banks in India #fail\"},{\"sentence\":\"RT @FredlyFriendly : @fredlyfriendly #citibank has terrible customer service , high fees , and crappy management #MOVEYOURMONEY !\"},{\"sentence\":\"RT @harikrishnanc interesting error msg from #citibank Am I logged in or logged out ? #ux #usability #fail\"},{\"sentence\":\"RT @jeff_lamarche : Fucking citibank declined my iPad payment because it looked &suspicious& \"},{\"sentence\":\"SCAMS : Citibank Scam ! ! ! ! : Scam are not always the actions of some anonymous bad guy .\"},{\"sentence\":\"Site Warning : There is too much unnecessary information on this banking site Citibank_com\"},{\"sentence\":\"So Citibank enter an incorrect amt compared to my chq ; chq goes back , they ask me to pay online , which I do , then they represent that chq ? !\"},{\"sentence\":\"Some say &never piss off a writer.& CitiBank 's lack co-operation is proof why you should not . We ' ll write bad reviews then \"},{\"sentence\":\"Take a number , wait your fucking turn .\"},{\"sentence\":\"TAX-CREDITS gives &Real Estate investing& a FALSE sense of WEALTH.#Socialmedia #Nation #World #Digguser @slate #Icon #TPP #RS #Citibank #CSR\"},{\"sentence\":\"There is one benefit to Citibank 's TERRIBLE website \"},{\"sentence\":\"Time to shop for a bank . RT @sarahlynnpablo : Citibank : your customer service sucks .\"},{\"sentence\":\"@tiniestkitten dude sheer fucking luck and my coworker 's Citibank card .\"},{\"sentence\":\"Today I realized that Citibank sucks ! Their customer service is horrible .\"},{\"sentence\":\"Upset with Citibank 's credit protector program , what a SHAM !\"},{\"sentence\":\"Ver bad customer response by #Citibank #fail ! ! ! !\"},{\"sentence\":\"Welcome to Tanzania ! � Citibank Poor Credit Cards : Credit cards are accepted in hotels and restaurants , some very ..\"},{\"sentence\":\"Welcome to Tanzania ! � Citibank Poor Credit Cards : The city is divided into four different areas : the &center& is ..\"},{\"sentence\":\"went into the city just to avoid an annoying ATM fee \"},{\"sentence\":\"Whats wrong @ citibank .. charging $$ for checking a/c now .\"},{\"sentence\":\"where can I get a credit card with bad credit ?\"},{\"sentence\":\"Why did Professor Obama force Citi Bank to give bad loans to minorities ?\"},{\"sentence\":\"Why did Professor Obama sue Citi Bank to force them to give bad loans ?\"},{\"sentence\":\"Why do I need to verify my nric with the fucking telemarketer frm citibank to remove my mobile frm their calling list ? ? ?\"},{\"sentence\":\"Why do not citibank have their number on the ATM #fail\"},{\"sentence\":\"Why is Citi Bank even allowed traders exactly ? What a mess of a firm .\"},{\"sentence\":\"why is it so hard to get in touch with the Citibank customer service personnel ? or am I calling the wrong number ?\"},{\"sentence\":\"Worst experience with #Citibank service ...\"},{\"sentence\":\"Wow Citibank sure has the worst interest rates ever\"},{\"sentence\":\"Wtf ... #citibank playing FUCKING GAMES wit my interest ... !\"}]}")
				.asJson();
		System.out.println(response.getStatus());
	}
}