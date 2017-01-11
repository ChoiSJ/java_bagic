public class PrinterApp3 {
	public static void main(String[] args) {
		
		Printer p1 = new ColorPrinter();

		// p1 참조변수는 ColorPrinter 객체와 함께 생성된 Printer 객체를 참조한다
		// p1 참조변수는 Printer 객체의 필드/메소드를 실행할 수 있다
		// p1 참조변수는 ColorPrinter 객체의 필드/메소드는 실행할 수 없다.
		// 단, ColorPrinter 객체와 Printer 객체에 재정의 관계에 있는 메소드가 있다면
		// p1 참조변수로 ColorPrinter 객체의 재정의된 메소드를 실행할 수 있다.

		p1.feed();					// Printer 에 정의된 메소드
		p1.print("인쇄합니다.");	// Printer 에 정의, ColorPrinter 에 재정의
									// ColorPrinter 의 Print(Strint text) 가 실행

		// 아래 코드의 오류 <-- p1 참조변수로는 접근 불가
		//p1.dpi = 600;				// ColorPrinter 에 정의된 필드
		//p1.chargeInk();			// ColorPrinter 에 정의된 필드

		// 객체의 강제 형변환
		ColorPrinter p2 = (ColorPrinter) p1;	// p1에서 ColorPrinter 객체쪽으로 옮겨간다.
												// ColorPrinter 객체의 참조값이 반환된다.
		p2.dpi = 600;
		p2.chargeInk();

		((ColorPrinter) p1).chargeInk();
	}	
}