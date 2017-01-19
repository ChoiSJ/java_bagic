public class PrinterApp {
	public static void main(String[] args) {
		
		// 흑백 인쇄
		Printer p1 = new Printer();
		p1.print("이번 주 금요일 영타대회...");

		// 컬러 인쇄
		ColorPrinter p2 = new ColorPrinter();
		p2.print("일요일 찍은 사진");

		// 사진 인쇄
		PhotoPrinter p3 = new PhotoPrinter();
		p3.print("증명사진");
	}
}