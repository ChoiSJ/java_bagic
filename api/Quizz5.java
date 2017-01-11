import java.util.*;

public class Quizz5 {
	public static void main(String[] args) {
		
		String[] words = {"����", "��", "��", "����"};
		
		String text = "���ش� ���ų��Դϴ�. ������ ���� �ϵ��� �־��׿�.";

		// ������ ������ ��Ģ� ���ԵǾ� �ִ��� ���� Ȯ���ϱ�
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