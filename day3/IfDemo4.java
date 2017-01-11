import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1: 커피(1500원) 2: 과일쥬스(2000)원 3: 이온음료(1000원)");

		System.out.print("금액을 입력하세요:");
		int money = sc.nextInt();
		System.out.print("음료번호를 입력하세요:");
		int no = sc.nextInt();

		int returnCoin = 0;
		
		if (no == 1) { 
			int result = money - 1500;
			System.out.println("커피를 받아가세요.");
			returnCoin = money - 1500;
		}
		
		if (no == 2) { 
			int result = money - 2000;
			System.out.println("과일쥬스를 받아가세요.");
			returnCoin = money - 2000;
		}
		
		if (no == 3) { 
			int result = money - 1000;
			System.out.println("이온음료를 받아가세요.");
			returnCoin = money - 1000;
		}

		System.out.println("거스름돈:" + returnCoin);
	}
}