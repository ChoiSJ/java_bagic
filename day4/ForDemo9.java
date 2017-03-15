import java.util.Scanner;
import java.util.Random;

public class ForDemo9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// 1. 두 주사위의 합이 7이 되면 무인도행
		// 2. 무인도에 갇힌 경우, 같은 숫자 조합일 때만 무인도에서 탈출
		// 3. 무인도에 같인 경우, 주사위를 3번 굴렸다면 무인도에서 탈출
		// 4. 무인도에 갇히지 않은 경우엔, 주사위의 합만큼 칸을 이동
		for (int i=1; i<=10; i++) {
			
			int first = random.nextInt(6) + 1;
			int second = random.nextInt(6) + 1;
			System.out.printf("(%d, %d)\n", first, second);
		}
	}
}
