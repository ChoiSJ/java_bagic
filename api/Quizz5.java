import java.util.*;

public class Quizz5 {
	public static void main(String[] args) {
		
		String[] words = {"새끼", "놈", "년", "병신"};
		
		String text = "올해는 병신년입니다. 참으로 많은 일들이 있었네요.";

		// 위에서 나열한 금칙어가 포함되어 있는지 여부 확인하기
		boolean isContains = false;
		StringTokenizer st = new StringTokenizer(text);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			for (int i=0; i<words.length; i++ ) {
				if (token.contains(words[i])) {
					isContains = true;
					break;
				}
			}
		}
		System.out.println(isContains);

		for (String w : words) {
			boolean value = text.contains(w);
			if (value) {
				isContains = true;
			}
		}
	}
}