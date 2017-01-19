/*
	은행계좌를 표현하는 클래스
		-속성
			예금주
			계좌번호
			비밀번호
			잔액
		-기능
			출금기능 - 금액과 비밀번호를 전달받아서 
			           비밀번호가 개설시 입력한 비밀번호와 일치하면
					   금액만큼을 잔액에서 감소시키고
					   금액만큼의 돈을 반환하다.
			입금기능 - 금액을 전달받아서 그 금액만큼 잔액을 증가시키고
					   화면에 현재 잔액을 표시한다.
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
	
	// 출금기능
	public int withdraw2(int amount, int pwd) {
		if (password != pwd) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return 0;
		}

		if (balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}

		balance -= amount;
		System.out.println("출금 후 잔액: " + balance);
		return amount;
	}


	public int withdraw(int amount, int pwd) {
		// 비밀번호가 일치하는 경우
		if (pwd != password) {
			System.out.println("잘못된 비밀번호를 입력하셨습니다.");
			System.out.println("출금하신 금액: " + "0 원");
		} else {
			if (balance < amount) {
				System.out.println("잔액이 부족합니다.");
			} else {
				balance -= amount;
				System.out.println(amount + " 원이 출금되었습니다.");
				System.out.println("현재잔액: " + balance + " 원");
			}
		} 
		return amount;
	} 
	
	// 예금기능
	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + " 원이 입금되었습니다.");
		System.out.println("현재잔액: " + balance + " 원");
	}
	
	// 조회기능
	public void info() {
		System.out.println("###### 계좌 정보 ######");
		System.out.println("예금주: " + owner);
		System.out.println("계좌번호: " + accountNumber);
		System.out.println("잔액: " + balance + " 원");
	}
}