import java.util.*;

public class Quizz2 {
	public static void main(String[] args) {
		// 3�ڸ��� ������ �Է¹޾Ƽ� 
		// 100�� �ڸ� ����
		// 10�� �ڸ� ����
		// 1�� �ڸ� ���ڸ� ���� ����Ͻÿ�
		Scanner sc = new Scanner(System.in)
;		System.out.print("���ڸ� �Է��ϼ���:");
		int number = sc.nextInt();

		int a = number/100;
		int b = (number - (a*100))/10;
		int c = number - (a*100+b*10);
		System.out.print("���� �ڸ�: " + a + "\t���� �ڸ�: " + b + "\t���� �ڸ�: " + c + "\n");
	}
}