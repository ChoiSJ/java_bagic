import java.util.*;

public class Quizz3 {
	public static void main(String[] args) {
		Random ran = new Random();
	

		/*
		// ������ ���� 3���� ������ �迭
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

		// ���ڸ� �ϳ��� ���� ������ ��
		// ���� ��� �ڸ��� �ٸ��� ���� ����, ������ ��Ʈ����ũ�� ����
		// �˻��� �� ��� �ڸ��� ���� �ϳ��� �˻�
		// 3�� ��Ʈ����ũ�� ��쿡�� ���� ����

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

		// ����ڰ� �Է��� ���� ������ �迭
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
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}