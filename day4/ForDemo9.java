import java.util.Scanner;
import java.util.Random;

public class ForDemo9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// 1. �� �ֻ����� ���� 7�� �Ǹ� ���ε���
		// 2. ���ε��� ���� ���, ���� ���� ������ ���� ���ε����� Ż��
		// 3. ���ε��� ���� ���, �ֻ����� 3�� ���ȴٸ� ���ε����� Ż��
		// 4. ���ε��� ������ ���� ��쿣, �ֻ����� �ո�ŭ ĭ�� �̵�
		for (int i=1; i<=10; i++) {
			
			int first = random.nextInt(6) + 1;
			int second = random.nextInt(6) + 1;
			System.out.printf("(%d, %d)\n", first, second);
			


		}
	}
}