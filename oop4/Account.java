// banking program
// 1. ���µ�ϱ��: �̸�, ��й�ȣ, ���� �Աݾ��� �Է¹޾Ƽ� ���¸� �����Ѵ�.
// 2. ��ȸ���: �̸�, ���¹�ȣ, �ܾ��� ǥ���Ѵ�. 
// 3. ��й�ȣ������: ���� ��й�ȣ�� �� ��й�ȣ�� �Է¹޾Ƽ� ��й�ȣ�� �����Ѵ�.
// 4. �Աݱ��: �Աݾ��� �Է¹޾Ƽ� �ܾ��� ������Ų��.
// 6. ��ݱ��: ��ݾװ� ��й�ȣ�� �Է¹޾Ƽ� �ܾ��� ���ҽ�Ų��.
// 7. ����: ���α׷��� �����Ѵ�.
public class Account {
	private String name;
	private int password;
	private int balance;
	private String accountNum;
	
	public Account() {
		accountNum = "111-1111-1111"; 
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	} 
	public void setPassword(int password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountNum() {
		return accountNum;
	}
}