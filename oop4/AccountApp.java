import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		
		for (;;) {
			System.out.println("1.���, 2.��ȸ 3.������� 4.�Ա� 5.��� 6.����\n");
			System.out.print("�޴� ����>");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.print("�̸��� �Է��ϼ���: ");
				acc.setName(sc.next());
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				acc.setPassword(sc.nextInt());
				System.out.print("�Ա��� �ݾ��� �Է��ϼ���: ");
				acc.setBalance(sc.nextInt());

			} else if (menuNo == 2) {
				System.out.println("��    ��: " + acc.getName());
				System.out.println("���¹�ȣ: " + acc.getAccountNum());
				System.out.println("��    ��: " + acc.getBalance());
			} else if (menuNo == 3) {
				System.out.print("���� ��й�ȣ�� �Է��ϼ���: ");
				int password = sc.nextInt();

				if (acc.getPassword() == password) {
					System.out.print("�� ��й�ȣ�� �Է��ϼ���: ");
					acc.setPassword(sc.nextInt());
				} else { 
					System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.");
				}
			} else if (menuNo == 4) {
				System.out.print("�Ա��� �ݾ��� �Է��ϼ���: ");
				int deposit = sc.nextInt();
				int result = acc.getBalance() + deposit;
				acc.setBalance(result);
			
			} else if (menuNo == 5) {
				System.out.print("��й�ȣ�� �Է��ϼ��� ");
				int password = sc.nextInt();

				if (acc.getPassword() == password) {
					System.out.print("����� �ݾ��� �Է��ϼ���: ");
					int withdraw = sc.nextInt();
					int result = acc.getBalance() - withdraw;
					acc.setBalance(result);
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.");
				}
			} else if (menuNo == 6) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		} 
	}
}