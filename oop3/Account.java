public class Account {
	// 속성을 은닉화 시키기
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

	public String getOwner() {		// getter 메소드(담아 있는 값을, 읽기는 가능하지만, 변경을 할 수 없게 한다.)
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

	// 기능을 공개하기
	public void info() {
		System.out.printf("%s %s %d %d\n", owner, accountNumber, password, balance);
	}
}