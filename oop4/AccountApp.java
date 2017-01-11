import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		
		for (;;) {
			System.out.println("1.등록, 2.조회 3.비번변경 4.입금 5.출금 6.종료\n");
			System.out.print("메뉴 선택>");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.print("이름을 입력하세요: ");
				acc.setName(sc.next());
				System.out.print("비밀번호를 입력하세요: ");
				acc.setPassword(sc.nextInt());
				System.out.print("입금할 금액을 입력하세요: ");
				acc.setBalance(sc.nextInt());

			} else if (menuNo == 2) {
				System.out.println("이    름: " + acc.getName());
				System.out.println("계좌번호: " + acc.getAccountNum());
				System.out.println("잔    액: " + acc.getBalance());
			} else if (menuNo == 3) {
				System.out.print("현재 비밀번호를 입력하세요: ");
				int password = sc.nextInt();

				if (acc.getPassword() == password) {
					System.out.print("새 비밀번호를 입력하세요: ");
					acc.setPassword(sc.nextInt());
				} else { 
					System.out.println("틀렸습니다. 다시 시도하세요.");
				}
			} else if (menuNo == 4) {
				System.out.print("입금할 금액을 입력하세요: ");
				int deposit = sc.nextInt();
				int result = acc.getBalance() + deposit;
				acc.setBalance(result);
			
			} else if (menuNo == 5) {
				System.out.print("비밀번호를 입력하세요 ");
				int password = sc.nextInt();

				if (acc.getPassword() == password) {
					System.out.print("출금할 금액을 입력하세요: ");
					int withdraw = sc.nextInt();
					int result = acc.getBalance() - withdraw;
					acc.setBalance(result);
				} else {
					System.out.println("틀렸습니다. 다시 시도하세요.");
				}
			} else if (menuNo == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		} 
	}
}