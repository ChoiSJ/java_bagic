import java.util.Scanner;
import java.util.Random;

public class Quizz5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// 1. 두 주사위의 합이 7이 되면 무인도행
		// 2. 무인도에 갇힌 경우, 같은 숫자 조합일 때만 무인도에서 탈출
		// 3. 무인도에 갇인 경우, 주사위를 3번 굴렸다면 무인도에서 탈출
		// 4. 무인도에 갇히지 않은 경우엔, 주사위의 합만큼 칸을 이동

		int island = 0; // 0이면 자유, 1이면 무인도
		int count = 3;

		for (;;) {
			System.out.println("------------------------------");
			System.out.println("1.주사위 굴리기		0.종료");
			System.out.println("------------------------------");

			System.out.print("선택하세요: ");
			int no = sc.nextInt();

			if (no == 1) {
				int first = random.nextInt(6) + 1;
				int second = random.nextInt(6) + 1;

				if (first + second == 7 && island == 0) {
					System.out.println("무인도에 표착하였습니다.");
					island = 1;
				} else if (first + second == 7 && island == 1) {
					System.out.println("집에 가자.");
				}
			} 
		}
	}
}