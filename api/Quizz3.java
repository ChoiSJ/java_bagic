public class Quizz3 {
	public static void main(String[] args) {
	
		String text = "Constructs a string tokenizer for the specified string. All characters in the delim argument are the delimiters for separating tokens.";
		text = text.toLowerCase();
		int[] arr = new int[26];
		/*
		for (int i=0; i<text.length(); i++) {
			int c = text.charAt(i);
			if (c-97>=0) {
				arr[c-97]++;				
			}
		}
		*/

		System.out.println(java.util.Arrays.toString(arr));

		for (int i=0; i<arr.length; i++) {
			System.out.println( (char)(i+97) + ":" + arr[i] );
		}
	}
}