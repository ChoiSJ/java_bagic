import java.util.*;

public class Quizz3 {
	public static void main(String[] args) {
		Random ran = new Random();

		/*
		// 임의의 숫자 3개를 저장할 배열
		int[] numbers = new int[3];
		Set<Integer> set = new HashSet<Integer>();
		for (;;) {
			set.add(ran.nextInt(10));
			if (set.size() == 3) {
				break;
			}
		}
		int index = 0;
		for (int no : set) {
			number[index++] = no;
		}
		*/

		// 숫자를 하나씩 먼저 꺼내서 비교
		// 같을 경우 자리가 다르면 볼을 증가, 같으면 스트라이크를 증가
		// 검사할 때 모든 자리의 수를 하나씩 검사
		// 3번 스트라이크일 경우에는 게임 종료

		int[] numbers = new int[3];
		int position = 0;
		for (;;) {
			int number = ran.nextInt(10);
			boolean isExist = false;
			for (int i=0; i<=position; i++) {
				if (numbers[i] == number) {
					isExist = true;
				}
			}
			if (!isExist) {
			numbers[position] = number;
			position++;
			}
			if (position == 3) {
			break;
			}
		}

		System.out.println(Arrays.toString(numbers));

		// 사용자가 입력한 답을 저장할 배열
		int[] answer = new int[3];

		for (int a=1; a<=10; a++) {
			int ball = 0;
			int strike = 0;

			if () {
				isSuccess = true;
				break;
			}
		}
		
		if (isSuccess) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
}
