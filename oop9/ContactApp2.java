import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		Contact con = new Contact();
		
		//Tel[] tel = new Tel[]
		
		for (;;) {
			System.out.println("1.�̸���� 2.��ȭ��ȣ��� 3.�ּҵ��/���� 4.��ȸ 5.����");
			System.out.print("�޴��� �����ϼ���:");
			int no = sc.nextInt();

			if (no == 1) {
				// �̸��� �Է¹޾Ƽ� Contact�� �����մϴ�.
				System.out.print("�̸��� �Է��ϼ���:");
				con.setName(sc.next());

			} else if (no == 2) {
				// ��ȭ��ȣ ������ �Է¹޾Ƽ� Contact�� �����մϴ�.
				// Tel ��ü ���� -> �� �Է¹޾Ƽ� ä���
				// -> Contact�� add(Tel tel)���� Tel ��ü �����ؼ� �迭�� ���
				Tel tel = new Tel();
				System.out.print("��ȣ������ �Է��ϼ���:");
				tel.setType(sc.next());
				System.out.print("��ȭ��ȣ�� �Է��ϼ���:");
				tel.setNumber(sc.next());

				con.addTel(tel);

			} else if (no == 3) {
				// �ּ� ������ �Է¹޾Ƽ� Contact�� �����մϴ�.
				// Address ��ü ���� -> �� �Է¹޾Ƽ� ä���, Contant�� setter �̿��ؼ� ����
				Address arr = new Address();
				System.out.print("�������� ��/���� �Է��ϼ���:");
				arr.setSido(sc.next());
				System.out.print("�������� ��/���� �Է��ϼ���:");
				arr.setGugun(sc.next());
				System.out.print("������ �ּҸ� �Է��ϼ���:");
				arr.setDetail(sc.next());
				
				con.setAddress(arr);

			} else if (no == 4) {
				// ����ó ������ ȭ�鿡 ǥ���մϴ�.
				con.getInfo();
				
			} else if (no == 5) {
				// ���α׷��� �����մϴ�.
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}

	}
}