import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int balance = 0;

		for (;;) {
			System.out.println("1.�Ա�\t2.���\t3.��ȸ\t4.����");
			System.out.print("��ȣ�� �����ϼ���: ");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.print("\n�Ա��� �ݾ��� �׼��� �Է��ϼ���: ");
				int money = sc.nextInt();

				balance += money;
			} else if (select == 2) {
				System.out.print("\n����� �ݾ��� �׼��� �Է��ϼ���: ");
				int money = sc.nextInt();

				if (balance >= money) {
					balance -= money;
				} else {
					System.out.println("�ܾ��� �����մϴ�.");
				}
			} else if (select == 3) {
				System.out.println("\n���� �ܾ�: " + balance);
			} else if (select == 4) {
				System.out.println("\n���α׷��� �����մϴ�.");
				break;
			}
		//System.out.println();
		System.out.println("\n�̿����ּż� �����մϴ�.\n");
		} 
	}
}