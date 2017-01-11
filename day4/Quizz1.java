public class Quizz1 {
	public static void main(String[] args) {
		// 중간값의 1~9 는 그 줄의 고정값이기에 처음 for 에 넣어서 고정시킨다.
		for (int a=1; a<=9; a++) {
			for (int b=2; b<=9; b++) {
				System.out.print(b + " * " + a + " = " + (a*b) + "\t");
			}
			System.out.println();
		}
	}
}