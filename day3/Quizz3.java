import java.util.Scanner;

public class Quizz3 {
	public static void main(String[] args) {
		// 임의의 숫자를 입력받아서 그 수가 짝수인지 홀수인지
		// 삼항연산자를 사용해서 결과를 표시하기
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자을 입력하세요:");
		int number = sc.nextInt();
		
		String result = ((number%2) == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println(result);
	}
}