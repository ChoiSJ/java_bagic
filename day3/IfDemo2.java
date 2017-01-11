public class IfDemo2 {
	public static void main(String[] args) {
		
		int score = 68;
		if (score >= 60) {
			System.out.println("합격입니다.");
			if (score > 95) {
			System.out.println("장학금을 지급합니다."); // 밑에 따로 if 를 하나 더 적는 것보다 효율적
			}
		} else {
			System.out.println("불합격입니다.");
		}
		
		// 바깥에 if 를 작성하면 실행성능면에서 떨어진다.
		/*
		if (score > 95) {
			System.out.println("장학금을 지급합니다.");
		} 
		*/
	}
}