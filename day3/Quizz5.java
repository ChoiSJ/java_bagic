import java.util.Scanner;

public class Quizz5 {
	public static void main(String[] args) {
		// ����, ����, ���� ������ �Է� �޾Ƽ�
		// ����, ���, ������ ����ϱ�
		// ������ 90�̻�:A, 80�̻�:B, 70�̻�:C, 60�̻�:D, �׿ܴ� F
		Scanner sc = new Scanner(System.in);

		System.out.print("������� �Է��ϼ���:");
		int kor = sc.nextInt();
		System.out.print("������� �Է��ϼ���:");
		int eng = sc.nextInt();
		System.out.print("���м����� �Է��ϼ���:");
		int math = sc.nextInt();

		int total = kor + eng + math;
		int avg = total/3;
		String score;

		if (avg >= 90) {
			score = "A";
		} else if (avg >= 80) {
			score = "B";
		} else if (avg >= 70) {
			score = "C";
		} else if (avg >= 60) {
			score = "D";
		} else {
			score = "F";
		}

		System.out.println("����: " + total + " ���: " + avg + " ����: " + score);
	}
}