public class ScoreApp2 {
	public static void main(String[] args) {
		
		// 객체 생성 및 홍길동 학생의 성적으로 객체가 초기화되었음
		Score s = new Score();

		int result1 = s.total();
		double result2 = s.average();

		System.out.println("총점: " + result1);
		System.out.println("평균: " + result2);
	}
}