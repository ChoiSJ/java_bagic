public class Contact {
	// �Ӽ� �����ϱ�

	// ����
	// �̸�
	// ����ó
	// �̸���

	int no;
	String name;
	String cellnum;
	String email;

	// ��� �����ϱ�
	// ��ȭ�ϱ�		call
	public void call() {
		System.out.println(cellnum + " ���� ��ȭ�� �õ��մϴ�.");
	}

	// ���ں�����	sendMessage()
	public void sendMessage() {
		System.out.println(name + " ���� �޽����� �����ϴ�.");
	}

	// ���Ϻ�����	sendMail()
	public void sendMail() {
		System.out.println(email + " �� ������ �����մϴ�.");
	}
}