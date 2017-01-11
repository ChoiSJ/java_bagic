public class Student {
	int no;			// 학번
	String name;
	int kor;
	int eng;
	int math;

	// 기본 생성자
	public Student() {
		no = 1;
		name = "";
		kor = 0;
		eng = 0;
		math = 0;
	}
	
	// 모든 필드를 초기화하는 생성자
	public Student(int nanba, String namae, int kokugo, int eigo, int sugaku) {
		no = nanba;
		name = namae;
		kor = kokugo;
		eng = eigo;
		math = sugaku;
	}

	// 총점을 반환하는 기능 -> total
	public int total() {
		int result = kor + eng + math;
		return result;
	}

	// 평균을 반환하는 기능 -> avg
	public double avg() {
		double result = total()/3.0;
		return result;
	}

	// 학생 정보를 출력하는 기능(총점과 평균도 포함) - info
	public void info() {
		System.out.println("--------------------");
		System.out.println("학번: " + no);
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + total());
		System.out.println("평균: " + avg());
	}
}