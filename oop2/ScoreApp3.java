public class ScoreApp3 {
	public static void main(String[] args) {
		
		Score s = new Score("김유신", 40, 50, 60);

		int result1 = s.total();
		System.out.println("총점: " + result1);

		double result2 = s.average();
		System.out.println("평균: " + result2);

	}
}