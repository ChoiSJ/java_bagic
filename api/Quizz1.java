import java.util.Scanner;

public class Quizz1 {
	public static void main(String[] args) {
	
		// 이메일을 입력받아서 이메일에 포함된 아이디부분만 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일을 입력하세요:");
		String email = sc.next();

		/*
		System.out.print("이메일을 입력하세요:");
		String email = sc.next();
		int index = email.indexOf("@");
		String result = email.substring(0, index);
		System.out.println("이메일 앞:" + result);
		*/

		String[] arr = email.split("@");
		System.out.println("아이디:" + arr[0]);
	}
}