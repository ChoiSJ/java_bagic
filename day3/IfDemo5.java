import java.util.Scanner;

public class IfDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1: 커피(1500원) 2: 과일쥬스(2000)원 3: 이온음료(1000원)");

		System.out.print("금액을 입력하세요:");
		int money = sc.nextInt();
		System.out.print("음료번호를 입력하세요:");
		int no = sc.nextInt();
		
		int returnCoin = 0; // 잔돈 변수 생성
		
		// if를 이용해 1을 선택한 경우 입력금액에서 해당 품목의 금액 차감
		// 그리고 다시 그 안에서 if를 이용해 잔돈이 0원 미만일 경우 금액부족 메시지, 이상일 경우 else로 이동하게끔 설정
		// else if를 이용해 2와 3을 반복
		// else에 설정하지 않을 경우 메시지가 무조건 표시된다는 것 확인
		if (no == 1) { 
			returnCoin = money - 1500;
			if (returnCoin < 0) {
				System.out.println("금액이 부족합니다. 처음부터 다시 시도해주세요.");
			} else {
				System.out.println("이용해주셔서 감사합니다. 커피를 받아가세요.");
			}
		} else if (no == 2) {
			returnCoin = money - 2000;
			if (returnCoin < 0) {
				System.out.println("금액이 부족합니다. 처음부터 다시 시도해주세요.");
			} else {
				System.out.println("이용해주셔서 감사합니다. 과일쥬스를 받아가세요.");
			}
		} else if (no == 3) { 
			returnCoin = money - 1000;
			if (returnCoin < 0) {
				System.out.println("금액이 부족합니다. 처음부터 다시 시도해주세요.");
			} else {
				System.out.println("이용해주셔서 감사합니다. 이온음료를 받아가세요.");
			}
		} else {
			System.out.println("번호를 다시 입력하세요.");
		}
		
		// 잔돈 매수 생성: 원하는 자릿수의 돈을 얻기 위해 불필요한 금액을 다 빼버려야 한다.
		// 따라서 돈 단위가 진행될 수록 전의 변수의 값을 다시 곱해 빼면 원하는 금액이 나온다.
		// 더 편한 방법이 있을 것 같지만 현재는 이것으로 타협
		// 잔돈이 마이너스로 설정되었을 때 if를 어디에 놓아야 하는 것인가. 分からぬ。
		int itiman = returnCoin/10000;
		int gosen = (returnCoin - itiman*10000)/5000;
		int issen = (returnCoin - itiman*10000 - gosen*5000)/1000;
		int gohyaku = (returnCoin - itiman*10000 - gosen*5000 - issen*1000)/500;
		int hyaku = (returnCoin - itiman*10000 - gosen*5000 - issen*1000 - gohyaku*500)/100;
		int gozyu = (returnCoin - itiman*10000 - gosen*5000 - issen*1000 - gohyaku*500 - hyaku*100)/50;
		int zyu = (returnCoin - itiman*10000 - gosen*5000 - issen*1000 - gohyaku*500 - hyaku*100 - gozyu*50)/10;
		
		// System.out.print를 몇 번이고 치는 것이 깔끔하지 않는 듯하여 /n으로 대체
		System.out.println("거스름돈: " + returnCoin + "원");
		System.out.print("잔돈 만원: " + itiman + "장\n" +
						"잔돈 오천원: " + gosen + "장\n" +
						"잔돈 천원권: " + issen + "장\n" +
						"잔돈 오백원: " + gohyaku + "매\n" +
						"잔돈 백원: " + hyaku + "매\n" +
						"잔돈 오십원: " + gozyu + "매\n" +
						"잔돈 십원: " + zyu + "매\n");
	}
}