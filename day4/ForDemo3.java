public class ForDemo3 {
	public static void main(String[] args) {
		
		// 1 ~ 10������ ���� ����ϱ�
		int total = 0;

		/*
		total = total + 1;
		total = total + 2;
		total = total + 3;
		total = total + 4;
		total = total + 5;
		total = total + 6;
		total = total + 7;
		total = total + 8;
		total = total + 9;
		total = total + 10;
		*/

		for (int a=1; a<=10; a++) {
			total += a;
		}
		// for ������ ���� �������� a�� ���� 11�� �ǰ� �Ҹ�ȴ�.
		// ���� ���� int a = 0; �� �����ξ��ٸ� a�� ���� 11�� �ȴ�.

		System.out.println("1~10�� ��:" + total);
	}
}