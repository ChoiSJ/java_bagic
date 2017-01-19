import java.util.*; // 같은 디렉토리에 있지 않는 설계도를 도입: java.util.Scanner; 도 가능

public class Quizz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // (System.in -> 키보드)의 입력을 스캔

		// 국어, 영어, 수학점수를 입력받아서 총합과 평균을 계산하기
		System.out.print("국어점수를 입력하세요:");
		int kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요:");
		int eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요:");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int avg = total/3;
		System.out.println("총점: " + total + "\t평균:" + avg);
		 
	}
}