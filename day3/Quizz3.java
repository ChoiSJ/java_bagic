import java.util.Scanner;

public class Quizz3 {
	public static void main(String[] args) {
		// ������ ���ڸ� �Է¹޾Ƽ� �� ���� ¦������ Ȧ������
		// ���׿����ڸ� ����ؼ� ����� ǥ���ϱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���:");
		int number = sc.nextInt();
		
		String result = ((number%2) == 0) ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		System.out.println(result);
	}
}