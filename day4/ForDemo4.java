public class ForDemo4 {
	public static void main(String[] args) {
		
		/*
		int a = 10;
		System.out.println(a);
		
		// 같은 블럭 안에 똑같은 변수가 있으면 안 된다
		int a = 20;
		System.out.println(a);
		int x = 4;

		// 그 블럭에서 만든 블럭은 그 안에서는 계속 살아 있다.
		int a = x * 100; 
		if (x%2 == 0) {
			int a = x * 100;
		} else {
			int a = x * 2000000;
		}
		
		int a = 1;
		for (; a<=10; a++) {
		
		}
		
		// for (int a=1; a<=10; a++) {} <- 이렇게 새롭게 int 변수를 설정할 수는 없다.
		
		int a;
		int b = 30;
		if (b > 10) {
			a = 20;
		} else {
			a = 20;
		}

		System.out.println(a);
		*/

		for (int a=1; a<=5; a++) {
			System.out.println("실행");
			
			for (int b=1; b<=10; b++) {
				if ((a+b)%3 == 0) {
					System.out.println("a의 값:" + a + " b의 값:" + b);
				}
			}		
		}
	}
}