public class CarApp {
	public static void main(String[] args) {
		/*
			Car c
				Car ��� ���赵�� �̿��ؼ� ������ ��ü�� �ּҰ��� ��� ���� c�� �����.
				Car Ÿ��(Ŭ����Ÿ��, ����Ÿ��)�� ���� c(��������)�� �����.

			new Car();
				Car ���赵�� �ε��ؼ� ��ü�� �����ϰ�, ������ ��ü�� ������ �� �ִ� �ּҰ��� ��ȯ�ϴ� �ڵ��.

			Car c = new Car();
				Car ���赵�� �ε��ؼ� ��ü�� �����ϰ�, ������ ��ü�� ������ �� �ִ� �ּҰ��� Car Ÿ���� ���� c�� �����ض�.
		*/
		Car c = new Car();
		System.out.println(c);

		Car c2 = new Car();
		System.out.println(c2);

		System.out.println(c.speed);	// c�� �����ϴ� ��ü�� speed �Ӽ��� ��ȸ
		c.speed = 10;
		System.out.println(c.speed);
		c.speedUp();					// c�� �����ϴ� ��ü�� ���Ե� speedUp() ��� �����ϱ�
		System.out.println(c.speed);

		// ������ ��ü�� �ʵ�, ������ ��ü�� �޼ҵ带 ����ϱ�

	}
}