import java.util.*; // ���� ���丮�� ���� �ʴ� ���赵�� ����: java.util.Scanner; �� ����

public class Quizz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // (System.in -> Ű����)�� �Է��� ��ĵ

		// ����, ����, ���������� �Է¹޾Ƽ� ���հ� ����� ����ϱ�
		System.out.print("���������� �Է��ϼ���:");
		int kor = sc.nextInt();
		System.out.print("���������� �Է��ϼ���:");
		int eng = sc.nextInt();
		System.out.print("���������� �Է��ϼ���:");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int avg = total/3;
		System.out.println("����: " + total + "\t���:" + avg);
		 
	}
}