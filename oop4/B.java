public class B {
	int x;
	static int y;

	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}
	
	// static 메소드에서는 non-static 변수, this를 사용할 수 없다.
	public static void m2() {
		// x는 객체가 만들어지는 시점에 사용이 가능하므로 static 에서 값을 모르니 참조할 수가 없다.
		//System.out.println(x); // 컴파일 오류
		System.out.println(y);
	}

	public void m3() {
		m1();
		m2();
	}

	public static void m4() {
		//m1(); // 컴파일 오류
		m2();
	}
}