import java.util.*;

public class StringTokenizerDemo {
	public static void main(String[] args) {
	
		String text = "���� ���� ��κ�      ������ �̼����� �󵵰� ���� ��Ÿ���� �ְ��, ������ ���� �̼����� �󵵴� ���������ʹ� 112 ����ũ�α׷�����, ��Һ��� 3�質 �����ϴ�.";
		
		/*
		StringTokenizer st = new StringTokenizer(text);

		int length = st.countTokens();
		System.out.println("�ܾ��:" + length);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			System.out.println("���� ��ū ����:" + st.countTokens());
		}
		*/

		// split �� ������ �������� �ڸ��� ������ ���鸸ŭ ������ �þ��.

		String[] tokens = text.split(" ");
		System.out.println("�ܾ��:" + tokens.length);

		/*
			StringTokenizer
				- ���ڿ��� �����ڸ� �������� �߶� ��ū���� �����.
				- new StringTokenizer(�ؽ�Ʈ);			// �����ڸ� �������� ������ ������ �����ڰ� �ȴ�.
				- new StringTokenizer(�ؽ�Ʈ, ������);

				- boolean hasMoreToken(): ���� ���� ���� ��ū(���ڿ�)�� �����ϸ� true �� ��ȯ�Ѵ�.
				- String nextToken()	: ��ū(���ڿ�)�� ������.
		*/
	}
}