public class BallMouse implements Mouse, Cleanable {

	public void wheel() {
		System.out.println("빙글... 빙글...");
	}
	public void click() {
		System.out.println("클릭... 클릭...");
	}
	public void move() {
		System.out.println("떼굴... 떼굴...");
	}

	public void clean() {
		System.out.println("Ball 의 먼지 제거 완료...");
	}
}