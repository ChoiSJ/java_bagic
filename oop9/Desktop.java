public class Desktop {

	private Mouse mouse;

	public Desktop() {}

	public Desktop(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public void running() {
		mouse.click();
	}
	
	public void painting() {
		mouse.move();
	}

	public void scrolling() {
		mouse.wheel();	
	}
	
	// 타입 변환이 가능한가 아닌가 instanceof 로 검사
	public void cleaning() {
		if (mouse instanceof Cleanable) {	// 해당 타입이 Cleanable 을 가지고 있는가 검사
			((Cleanable) mouse).clean();
		} else {
			System.out.println("청소기능을 지원하지 않습니다.");
		}
	}
}