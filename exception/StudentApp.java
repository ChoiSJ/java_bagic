import java.io.*;

public class StudentApp {

	public static void main(String[] args) throws Exception {
	
		BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
		String stu = reader.readLine();
		String[] stuArr = stu.split(",");
		int kor = Integer.parseInt(stuArr[2]);
		int eng = Integer.parseInt(stuArr[3]);
		int math = Integer.parseInt(stuArr[4]);

		Student stu1 = new Student(stuArr[0], stuArr[1], kor, eng, math);

		System.out.println("이    름:" + stu1.getName());
		System.out.println("학    년:" + stu1.getGrade());
		System.out.println("국어점수:" + stu1.getKor());
		System.out.println("영어점수:" + stu1.getEng());
		System.out.println("수학점수:" + stu1.getMath());
	}
}