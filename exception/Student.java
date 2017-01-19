public class Student {

	private String name;
	private String grade;
	private int kor;
	private int eng;
	private int math;

	public Student() {}

	public Student(String name, String grade, int kor, int eng, int math) {
		this.name = name;
		this.grade = grade;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
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
		int result = kor + eng + math;
		return result;
	}
	public double getAvg() {
		double result = getTotal()/3.0;
		return result;
	}
}

/*
	score.txt 파일을 읽어서 성적정보를 읽어서 화면에 출력하는 프로그램
	1. 학생정보를 담는 Student 클래스 정의하기
	2. StudentApp 정의하기
		- FileReader 와 BufferedReader 를 사용해서 파일 내용 읽어오기
		- 읽어온 내용을 , 를 기준으로 자르기
		- 잘라낸 내용을 Student 객체를 생성해서 저장하기
		(점수는 숫자로 저장하기: int Integer.parseInt(글자))
		- Student 객체에 저장된 내용을 화면에 표시하기
*/