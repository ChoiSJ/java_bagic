public class ArrayDemo1 {
	public static void main(String[] args) {
		
		// ���� 5���� ������ �ִ� �迭 �����
		int[] numbers = {1, 5, 8, 10, 4, 45, 63, 36, 72, 35, 74, 25, 73, 74, 35, 89, 29, 95, 345, 69};

		// �迭�� ũ�⸦ �˾Ƴ���
		// number.length
		int size = numbers.length;
		System.out.println("�迭�� ũ��: " + size);

		// �迭���� �� ��������
		// number[�ε�����ȣ]
		int x = numbers[0];
		int y = numbers[1];
		System.out.println("�迭�� 0��° ��: " + x);
		System.out.println("�迭�� 1��° ��: " + y);

		// ��� ������ ���� ���ϱ�
		//int total = number[0] + number[1] + number[2] + number[3] + number[4];
		//System.out.println("�հ�: " + total);

		/*
		int total = 0;
		total += number[0];
		total += number[1];
		total += number[2];
		total += number[3];
		total += number[4];
		*/
		
		int total = 0;
		for (int z : numbers) {
			total += z;
		}
		System.out.println("�հ�: " + total);

		//int total = 0;
		//for (int i=0; i<size; i++) {
		//	total += numbers[i];
		//}
		//System.out.println("�հ�: " + total);
	}
}