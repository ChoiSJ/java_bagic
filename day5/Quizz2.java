import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���ڸ� �Է¹޾Ƽ� �� ���ڵ��� �հ� ����� ����ؼ� ����ϱ�
		// 1. �л� ���� �Է¹ޱ�
		// 2. �л� ����ŭ�� ũ�⸦ ���� �迭�� �����
		// 3. �л� ����ŭ �ݺ��ϸ鼭 ������ �Է¹ް� �迭�� ���
		// 4. �迭�� ����� ������ �հ�� ����� ����ؼ� ����ϱ�

		System.out.print("���� ������ �� �л����� ���� �Է��ϼ���: ");
		int size = sc.nextInt();	// �л� �� == �迭�� ũ��
		// �л� ����ŭ�� ������ ���� �迭�� ����
		int[] student = new int[size];
		int total = 0;
		
		// �迭�� ���������� �����ϱ�
		for (int i=0; i<student.length; i++) {
			System.out.print("�л��� ������ �Է��ϼ���: ");
			int korSize = sc.nextInt();
			student[i] += korSize;	// 0~student.length �� ���鼭 student[] �� �� ��ġ�� �ϳ��� �Է½�Ų��.
		}
		
		// ������ ��� ����ϱ�
		for (int a : student) {		// int a �� student �迭�� �� �����͸� �� ���� ����ִ´�.
			total += a;
		}

		System.out.printf("����:%s    ���:%s\n", total, total/size);
	}
}