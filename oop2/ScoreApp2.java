public class ScoreApp2 {
	public static void main(String[] args) {
		
		// ��ü ���� �� ȫ�浿 �л��� �������� ��ü�� �ʱ�ȭ�Ǿ���
		Score s = new Score();

		int result1 = s.total();
		double result2 = s.average();

		System.out.println("����: " + result1);
		System.out.println("���: " + result2);
	}
}