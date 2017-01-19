import java.io.*;

public class ExceptionDemo3 {

	public static void writing() throws HtaException {
		try {
			FileWriter writer = new FileWriter("sample.txt");
			String text = "12월 3일 볼빨간 사춘기 콘서트";

			writer.write(text);
			writer.flush();
		} catch(FileNotFoundException e) {
			throw new HtaException();
		} catch(IOException e) {
			throw new HtaException();
		}
	}

	public static void reading() throws HtaException {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			String text = reader.readLine();
			System.out.println("내용:" + text);
		} catch(FileNotFoundException e) {
			// FileNotFoundException 이 발생한 것을 가로채고, 대신 HtaException 을 생성해서 던지기
			throw new HtaException();
		} catch(IOException e) {
			throw new HtaException();
		}
	}

	public static void main(String[] args) {
		
		try {
			reading();
			writing();
		} catch(HtaException e) {
			System.out.println("프로그램 실행 중 오류가 발생하였습니다.");
		}  
	}
}