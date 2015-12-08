
public class Clean {

	// This is the main method
	public static void main(String[] args) {

		String url = "(https?|http?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		String enter = "(\\r|\\n)";
		String randomSymbols = "[@!&*$<>;?']"; // Leaving # out of this because it precedes key words

		
		String original = "Jo!hn Doe: @#marvel is lam*e! https://www.google.com/search?q=hello&oq=hello&aqs=chrome.0.69i59j69i60j69i57j69i60j69i65j69i61.818j0j7&sourceid=chrome&es_sm=93&ie=UTF-8 search shows proof.";

		original = original.replaceAll(url,"");
		original = original.replaceAll(enter,"");
		original = original.replaceAll(randomSymbols,"");
		
		System.out.println(original);
	}

}
