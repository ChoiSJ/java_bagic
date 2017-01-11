import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int balance = 0;

		for (;;) {
			System.out.println("1.입금\t2.출금\t3.조회\t4.종료");
			System.out.print("번호를 선택하세요: ");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.print("\n입금할 금액의 액수를 입력하세요: ");
				int money = sc.nextInt();

				balance += money;
			} else if (select == 2) {
				System.out.print("\n출금할 금액의 액수를 입력하세요: ");
				int money = sc.nextInt();

				if (balance >= money) {
					balance -= money;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			} else if (select == 3) {
				System.out.println("\n현재 잔액: " + balance);
			} else if (select == 4) {
				System.out.println("\n프로그램을 종료합니다.");
				break;
			}
		//System.out.println();
		System.out.println("\n이용해주셔서 감사합니다.\n");
		} 
	}
}