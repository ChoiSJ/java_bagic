import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
		// ����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		// ������� �Է��� �о���� Scanner ��ü �����ϱ�
		Scanner sc = new Scanner(System.in);
	
		Contact[] contacts = new Contact[100];
		ContactMgr mgr = new ContactMgr();

		for (;;) {
			System.out.println("1:���	2:��ȸ	0:����");
			System.out.print("�޴� ��ȣ�� �Է��ϼ���:");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// �迭�� ����ϱ�
				// mgr�� addContact(Contact contact) �޼ҵ忡 ����� Contact ��ü ����
				Contact con = new Contact();
				System.out.print("��ȣ�� �Է��ϼ���:");
				con.setNo(sc.nextInt());
				System.out.print("�̸��� �Է��ϼ���:");
				con.setName(sc.next());
				System.out.print("��ȭ��ȣ�� �Է��ϼ���:");
				con.setPhone(sc.next());
				System.out.print("�̸����� �Է��ϼ���:");
				con.setEmail(sc.next());
				mgr.addContact(con);

			} else if (menuNo == 2) {
				// �迭�� ����� ��� ����ó ���� ǥ���ϱ�
				// mgr�� displayContact()�� �����Ű��
				mgr.displayContact();
			} else if (menuNo == 0) {
				break;
			}
		}
	}
}