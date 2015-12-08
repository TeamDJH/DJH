
public class Clean {

	//This is the main method
	public static void main(String[] args) {

		// These are test string, one if the url is at the end of the string, and other is url in the middle of string.
		String original = "John Doe: @#marvel is lame! https:www.google.com/@ljlakj/search shows proof.";
		// String test = "John Doe: @#marvel is lame! https:www.google.com";
		
		// System.out.println("This is the original: " + original);
		
		// Getting rid of unnecessary characters "@, !, etc."
		String incoming = original.replaceAll("[@!]", "").trim();
		
		// System.out.println("Here is the copy: " + incoming);
		
		// This converts the string into a char array
		char[] charArray = incoming.toCharArray();
		int i = 0;
		int k = 0;
		int markerStart = 0;
		int markerEnd = 0;
		String passer = "";
		int temp = charArray.length - 1;
		
		// While looking through the array, and not find 'ê' or end of array
		// fix this, won't work if the url your replacing is not the at the end of the array
		// charArray[i] != 'e' &&
		while(charArray[i] != 'ê' && i != temp)
		{
			if(charArray[i] == 'h' && charArray[i+1] == 't' && charArray[i+2] == 't' && charArray[i+3] == 'p')
			{
				// This assigns the location of the index to a temp variable used in deleting urls.
				int j = i;
				markerStart = i;
				// This will erase contents of each element until it gets to a white space, or end of the array.
				while(charArray[j] != ' ' && j != temp)
				{
					charArray[j] = 'ê';
					j++;
				}
				// Move back the original index so the original while loop sees the first occurence of 'ê'
				i--;
				
				// If the url was not at the end of the string, we will try this if statement
				// Then we know that the url was not at the end of the string
				if(j != temp)
				{
					markerEnd = j;
					i = j;
				}
				// we know that the url was at the end of the string. 
				else
				{
					markerEnd = temp;
					i = temp - 1;
				}
			}
			// Debugging code
			// System.out.println("Testing: " + charArray[i] + " ");
			i++;
		}
		
		i = 0;
		
		// If the url was in the middle then the markers will show when the url starts and ends
		// this will allocate the array in accordance with that.
		if(markerEnd != temp)
		{
			int finalsize = 0;
			finalsize = (temp - markerEnd) + markerStart;
			char[] second = new char[finalsize];
			while(i != finalsize)
			{
				// ensures that the copy skips over the url and removes it for the final copy.
				if(i == markerStart)
				{
					k = markerEnd + 1;
				}
				second[i] = charArray[k];
				i++;
				k++;
			}
			
			 passer = String.valueOf(second);
			
			// Debugging code
			// for(i = 0; i <second.length; i++)
			// {
			//	System.out.println("Testing: " + passer);
			// }
		}
		// the url was at the end of the array, and therefore does not need the markers
		else
		{
			// create a new array that will clip off the unwanted 'ê's.
			char[] second = new char[markerStart];
			while(charArray[i] != 'ê')
			{
				second[i] = charArray[i];
				i++;
			}
			
			 passer = String.valueOf(second);
			
			// Debugging code
			// for(i = 0; i <second.length; i++)
			// {
			//	System.out.println("Testing: " + passer);
			// }
		}

	
		// This next part will convert the char array into a string then add that string
		// to a string array and then pass it to the Clustering.java
		
		// cluster(passer);
		
		
	}

}
