public class ForDemo4 {
	public static void main(String[] args) {
		
		/*
		int a = 10;
		System.out.println(a);
		
		// ���� �� �ȿ� �Ȱ��� ������ ������ �� �ȴ�
		int a = 20;
		System.out.println(a);
		int x = 4;

		// �� ������ ���� ���� �� �ȿ����� ��� ��� �ִ�.
		int a = x * 100; 
		if (x%2 == 0) {
			int a = x * 100;
		} else {
			int a = x * 2000000;
		}
		
		int a = 1;
		for (; a<=10; a++) {
		
		}
		
		// for (int a=1; a<=10; a++) {} <- �̷��� ���Ӱ� int ������ ������ ���� ����.
		
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
			System.out.println("����");
			
			for (int b=1; b<=10; b++) {
				if ((a+b)%3 == 0) {
					System.out.println("a�� ��:" + a + " b�� ��:" + b);
				}
			}		
		}
	}
}