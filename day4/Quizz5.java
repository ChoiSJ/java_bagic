import java.util.Scanner;
import java.util.Random;

public class Quizz5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// 1. �� �ֻ����� ���� 7�� �Ǹ� ���ε���
		// 2. ���ε��� ���� ���, ���� ���� ������ ���� ���ε����� Ż��
		// 3. ���ε��� ���� ���, �ֻ����� 3�� ���ȴٸ� ���ε����� Ż��
		// 4. ���ε��� ������ ���� ��쿣, �ֻ����� �ո�ŭ ĭ�� �̵�

		int island = 0; // 0�̸� ����, 1�̸� ���ε�
		int count = 3;

		for (;;) {
			System.out.println("------------------------------");
			System.out.println("1.�ֻ��� ������		0.����");
			System.out.println("------------------------------");

			System.out.print("�����ϼ���: ");
			int no = sc.nextInt();

			if (no == 1) {
				int first = random.nextInt(6) + 1;
				int second = random.nextInt(6) + 1;

				if (first + second == 7 && island == 0) {
					System.out.println("���ε��� ǥ���Ͽ����ϴ�.");
					island = 1;
				} else if (first + second == 7 && island == 1) {
					System.out.println("���� ����.");
				}
			} 
		}
	}
}