import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {
		// ����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		// ������� �Է��� �о���� Scanner ��ü �����ϱ�
		Scanner sc = new Scanner(System.in);
	
		Contact[] contacts = new Contact[100];
		int currentPosition = 0;
	
		for (;;) {
			System.out.println("1:���	2:��ȸ	0:����");
			System.out.print("�޴� ��ȣ�� �Է��ϼ���:");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// �迭�� ����ϱ�
				// �迭�� currentPosition �� ����Ű�� ��ġ�� Contact �� �����ϰ�
				// currentPosition �� ���� 1 ������Ų��.
				contacts[currentPosition] = new Contact();			// ���� �迭�� �ϳ����� �ۼ��Ͽ� �� �������� ����

				System.out.print("��ȣ�� �Է��ϼ���:");
				contacts[currentPosition].setNo(sc.nextInt());
				//int no = sc.next();
				System.out.print("�̸��� �Է��ϼ���:");
				contacts[currentPosition].setName(sc.next());
				//String name = sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ���:");
				contacts[currentPosition].setPhone(sc.next());
				//String phone = sc.next();
				System.out.print("�̸����� �Է��ϼ���:");
				contacts[currentPosition].setEmail(sc.next());
				//String email = sc.next();
				currentPosition++;

				// Contact ��ü �����ϰ�, ���� ���
				//Contact contact = new Contact();
				//contact.setNo(no);
				//contact.setName(name);
				//contact.setPhone(phone);
				//contact.setEmail(email);

				// �迭�� �����ϱ�
				//contact[currentPosition] = contact;
				//currentPosition++;
				
			} else if (menuNo == 2) {
				// �迭�� ����� ��� ����ó ���� ǥ���ϱ�
				// <-- enhanced for�� ������� ���� ����
				// null �� ��� �극��ũ
				// �迭���� 0���� currentPosition �� ����Ű�� ��ġ �ձ��� �ݺ��ؼ� ���
				for (int i=0; i<currentPosition; i++) {
					//Contact c = contacts[i];
					//System.out.println("%d %s %s %s\n", c.getNo(), c.getName(), 
										//c.getPhone(), c.getEmail.());

					if (contacts[i] == null) {
						break;

						
					} else {
						System.out.println("��ȣ: " + contacts[i].getNo());
						System.out.println("�̸�: " + contacts[i].getName());
						System.out.println("��ȭ��ȣ: " + contacts[i].getPhone());
						System.out.println("�̸���: " + contacts[i].getEmail());
					}
				}

			} else if (menuNo == 0) {
				break;
			}
		}
	}
}