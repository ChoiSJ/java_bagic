/*
	������¸� ǥ���ϴ� Ŭ����
		-�Ӽ�
			������
			���¹�ȣ
			��й�ȣ
			�ܾ�
		-���
			��ݱ�� - �ݾװ� ��й�ȣ�� ���޹޾Ƽ� 
			           ��й�ȣ�� ������ �Է��� ��й�ȣ�� ��ġ�ϸ�
					   �ݾ׸�ŭ�� �ܾ׿��� ���ҽ�Ű��
					   �ݾ׸�ŭ�� ���� ��ȯ�ϴ�.
			�Աݱ�� - �ݾ��� ���޹޾Ƽ� �� �ݾ׸�ŭ �ܾ��� ������Ű��
					   ȭ�鿡 ���� �ܾ��� ǥ���Ѵ�.
*/

public class Account {
	
	String owner;
	String accountNumber;
	int password;
	int balance;

	/*
	public Account(String o, String n, int p, int b) {
		owner = o;
		accountNumber = n;
		password = p;
		balance = b;
	}
	*/
	
	// ��ݱ��
	public int withdraw2(int amount, int pwd) {
		if (password != pwd) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return 0;
		}

		if (balance < amount) {
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}

		balance -= amount;
		System.out.println("��� �� �ܾ�: " + balance);
		return amount;
	}


	public int withdraw(int amount, int pwd) {
		// ��й�ȣ�� ��ġ�ϴ� ���
		if (pwd != password) {
			System.out.println("�߸��� ��й�ȣ�� �Է��ϼ̽��ϴ�.");
			System.out.println("����Ͻ� �ݾ�: " + "0 ��");
		} else {
			if (balance < amount) {
				System.out.println("�ܾ��� �����մϴ�.");
			} else {
				balance -= amount;
				System.out.println(amount + " ���� ��ݵǾ����ϴ�.");
				System.out.println("�����ܾ�: " + balance + " ��");
			}
		} 
		return amount;
	} 
	
	// ���ݱ��
	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + " ���� �ԱݵǾ����ϴ�.");
		System.out.println("�����ܾ�: " + balance + " ��");
	}
	
	// ��ȸ���
	public void info() {
		System.out.println("###### ���� ���� ######");
		System.out.println("������: " + owner);
		System.out.println("���¹�ȣ: " + accountNumber);
		System.out.println("�ܾ�: " + balance + " ��");
	}
}