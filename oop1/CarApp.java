public class CarApp {
	public static void main(String[] args) {
		/*
			Car c
				Car 라는 설계도를 이용해서 생성된 객체의 주소값을 담는 변수 c를 만든다.
				Car 타입(클래스타입, 참조타입)의 변수 c(참조변수)를 만든다.

			new Car();
				Car 설계도를 로드해서 객체를 생성하고, 생성된 객체를 참조할 수 있는 주소값을 반환하는 코드다.

			Car c = new Car();
				Car 설계도를 로드해서 객체가 생성하고, 생성된 객체를 참조할 수 있는 주소값을 Car 타입의 변수 c에 저장해라.
		*/
		Car c = new Car();
		System.out.println(c);

		Car c2 = new Car();
		System.out.println(c2);

		System.out.println(c.speed);	// c가 참조하는 객체의 speed 속성값 조회
		c.speed = 10;
		System.out.println(c.speed);
		c.speedUp();					// c가 참조하는 객체에 포함된 speedUp() 기능 실행하기
		System.out.println(c.speed);

		// 생성된 객체의 필드, 생성된 객체의 메소드를 사용하기

	}
}