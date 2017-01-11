// 인터페이스: 명세, 규약, 표준, 스펙
// 모든 마우스 객체가 반드시 구현해야 하는 기능을 정의한 것
public interface Mouse {
	// 인터페이스 자체가 추상메소드만을 가질 수 있기에 abstract 를 굳이 입력하지 않아도 된다.
	void wheel();
	public abstract void click();
	public abstract void move();
}