public class Quizz2 {
	public static void main(String[] args) {
		
		for (int a=1; a<=5; a++) {
			for (int b=1; b<=6-a; b++) { // a의 변화하는 값을 for구문 안의 for에 적용
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

x ? 5 = 1
x ? 4 = 2
x ? 3 = 3