import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
		// 임의의 두 자리 숫자를 입력받아서 그 숫자에 해당하는 한글로 변환하기
		// 예> 23 -> 이십삼
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자을 입력하세요:");
		int number = sc.nextInt();
		int zyu = number/10;
		int iti = number - zyu*10;
		String hangul = "";
		
		if (zyu == 1) {
			hangul = "십";
		} else if (zyu == 2) {
			hangul = "이십";
		} else if (zyu == 3) {
			hangul = "삼십";
		} else if (zyu == 4) {
			hangul = "사십";
		} else if (zyu == 5) {
			hangul = "오십";
		} else if (zyu == 6) {
			hangul = "육십";
		} else if (zyu == 7) {
			hangul = "칠십";
		} else if (zyu == 8) {
			hangul = "팔십";
		} else if (zyu == 9) {
			hangul = "구십";
		}

		if (iti == 1) {
			hangul += "일";
		} else if (iti == 2) {
			hangul += "이";
		} else if (iti == 3) {
			hangul += "삼";
		} else if (iti == 4) {
			hangul += "사";
		} else if (iti == 5) {
			hangul += "오";
		} else if (iti == 6) {
			hangul += "육";
		} else if (iti == 7) {
			hangul += "칠";
		} else if (iti == 8) {
			hangul += "팔";
		} else if (iti == 9) {
			hangul += "구";
		}
		
		System.out.println("숫자 한국어 표기(두자리): " + hangul);
	}
}