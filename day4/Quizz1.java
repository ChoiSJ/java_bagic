public class Quizz1 {
	public static void main(String[] args) {
		// �߰����� 1~9 �� �� ���� �������̱⿡ ó�� for �� �־ ������Ų��.
		for (int a=1; a<=9; a++) {
			for (int b=2; b<=9; b++) {
				System.out.print(b + " * " + a + " = " + (a*b) + "\t");
			}
			System.out.println();
		}
	}
}