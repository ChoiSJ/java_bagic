public class Account {
	// �Ӽ��� ����ȭ ��Ű��
	private String owner;
	private String accountNumber;
	private int password;
	private int balance;

	public Account(String owner, String accountNumber, int password, int balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.password = password;
		this.balance = balance;
	}

	public String getOwner() {		// getter �޼ҵ�(��� �ִ� ����, �б�� ����������, ������ �� �� ���� �Ѵ�.)
		return owner;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	/*
	public String getPassword() {
		return "****";
	}
	*/

	// ����� �����ϱ�
	public void info() {
		System.out.printf("%s %s %d %d\n", owner, accountNumber, password, balance);
	}
}