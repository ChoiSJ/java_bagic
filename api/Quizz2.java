public class Quizz2 {
	public static void main(String[] args) {
	
		String text = "<lycorice@naver.com>,<kim@hanmail.net>,<kang@naver.com>,<yushin@daum.net>";

		String[] arr = text.split(",");
		for (String str : arr) {
			int index1 = str.indexOf("<");
			int index2 = str.indexOf(">");
			String result = str.substring(index1+1, index2);
			System.out.println(result);
		}

		/*
		for (String str : arr) {
			result = str.substring(1, str.length()-1);
			System.out.println(result)
		}
		*/

		for (String str : arr) {
			String result = str.replace("<", "").replace(">", "");
			System.out.println(result);
		}

	}
}