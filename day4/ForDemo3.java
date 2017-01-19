public class ForDemo3 {
	public static void main(String[] args) {
		
		// 1 ~ 10까지의 합을 계산하기
		int total = 0;

		/*
		total = total + 1;
		total = total + 2;
		total = total + 3;
		total = total + 4;
		total = total + 5;
		total = total + 6;
		total = total + 7;
		total = total + 8;
		total = total + 9;
		total = total + 10;
		*/

		for (int a=1; a<=10; a++) {
			total += a;
		}
		// for 연산이 끝난 시점에서 a의 값은 11이 되고 소멸된다.
		// 따로 위에 int a = 0; 을 만들어두었다면 a의 값은 11이 된다.

		System.out.println("1~10의 합:" + total);
	}
}