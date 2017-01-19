import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 숫자를 입력받아서 그 숫자들의 합과 평균을 계산해서 출력하기
		// 1. 학생 수를 입력받기
		// 2. 학생 수만큼의 크기를 가진 배열을 만들기
		// 3. 학생 수만큼 반복하면서 점수를 입력받고 배열에 담기
		// 4. 배열에 저장된 값으로 합계와 평균을 계산해서 출력하기

		System.out.print("국어 시험을 본 학생들의 수를 입력하세요: ");
		int size = sc.nextInt();	// 학생 수 == 배열의 크기
		// 학생 수만큼의 점수를 담을 배열을 생성
		int[] student = new int[size];
		int total = 0;
		
		// 배열에 국어점수를 저장하기
		for (int i=0; i<student.length; i++) {
			System.out.print("학생의 점수를 입력하세요: ");
			int korSize = sc.nextInt();
			student[i] += korSize;	// 0~student.length 번 돌면서 student[] 의 각 위치에 하나씩 입력시킨다.
		}
		
		// 총점과 평균 계산하기
		for (int a : student) {		// int a 에 student 배열의 각 데이터를 한 번씩 집어넣는다.
			total += a;
		}

		System.out.printf("총점:%s    평균:%s\n", total, total/size);
	}
}