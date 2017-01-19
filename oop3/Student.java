import java.text.DecimalFormat;

public class Student {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;

	// 클래스 만들기
	// Student
			// 번호, 이름, 국어, 영어, 수학
			// getter, setter 메소드 정의
			// 총점, 평균을 반환하는 getter 메소드 정의

	// StudentApp
			// Student 객체 3개 담을 수 있는 배열 정의하기
			// 
	
	public Student() {
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public double getAvg() {
		return getTotal()/3.0;
	}

	public String getAverageForRound() {		// 소수점 두 자리를 남기고 반올림, 숫자가 아니라 문자이다.
		DecimalFormat df = new DecimalFormat("##.00");
		return df.format(getAvg());
	}
}