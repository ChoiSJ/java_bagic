public class ScoreApp1 {
	public static void main(String[] args) {
		Score s = new Score();

		s.name = "ȫ�浿";
		s.kor = 90;
		s.eng = 80;
		s.math = 100;
		
		int result1 = s.total();
		double result2 = s.average();

		System.out.println("����: " + result1);
		System.out.println("���: " + result2);
		
	}
}