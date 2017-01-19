import java.util.*;

public class StringTokenizerDemo {
	public static void main(String[] args) {
	
		String text = "현재 전국 대부분      지역의 미세먼지 농도가 높게 나타나고 있고요, 서울은 현재 미세먼지 농도는 세제곱미터당 112 마이크로그램으로, 평소보다 3배나 높습니다.";
		
		/*
		StringTokenizer st = new StringTokenizer(text);

		int length = st.countTokens();
		System.out.println("단어갯수:" + length);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			System.out.println("남은 토큰 갯수:" + st.countTokens());
		}
		*/

		// split 는 공백을 기준으로 자르기 때문에 공백만큼 갯수가 늘어난다.

		String[] tokens = text.split(" ");
		System.out.println("단어갯수:" + tokens.length);

		/*
			StringTokenizer
				- 문자열을 구분자를 기준으로 잘라서 토큰으로 만든다.
				- new StringTokenizer(텍스트);			// 구분자를 지정하지 않으면 공백이 구분자가 된다.
				- new StringTokenizer(텍스트, 구분자);

				- boolean hasMoreToken(): 다음 번에 꺼낼 토큰(문자열)이 존재하면 true 를 반환한다.
				- String nextToken()	: 토큰(문자열)을 꺼낸다.
		*/
	}
}