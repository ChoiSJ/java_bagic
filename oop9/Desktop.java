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
	
	// Ÿ�� ��ȯ�� �����Ѱ� �ƴѰ� instanceof �� �˻�
	public void cleaning() {
		if (mouse instanceof Cleanable) {	// �ش� Ÿ���� Cleanable �� ������ �ִ°� �˻�
			((Cleanable) mouse).clean();
		} else {
			System.out.println("û�ұ���� �������� �ʽ��ϴ�.");
		}
	}
}