public class ScoreApp1 {
	public static void main(String[] args) {
		Score s = new Score();

		s.name = "홍길동";
		s.kor = 90;
		s.eng = 80;
		s.math = 100;
		
		int result1 = s.total();
		double result2 = s.average();

		System.out.println("총점: " + result1);
		System.out.println("평균: " + result2);
		
	}
}