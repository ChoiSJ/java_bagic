import java.util.*;

public class Quizz2 {
	public static void main(String[] args) {
		// 3자리의 정수를 입력받아서 
		// 100의 자리 숫자
		// 10의 자리 숫자
		// 1의 자리 숫자를 각각 출력하시오
		Scanner sc = new Scanner(System.in)
;		System.out.print("숫자를 입력하세요:");
		int number = sc.nextInt();

		int a = number/100;
		int b = (number - (a*100))/10;
		int c = number - (a*100+b*10);
		System.out.print("백의 자리: " + a + "\t십의 자리: " + b + "\t일의 자리: " + c + "\n");
	}
}