import java.io.*;
import java.text.DecimalFormat;

public class StudentApp2 {

	public static Student parse(String text) {
		Student stu = new Student();
		String[] stuArr = text.split(",");
		stu.setName(stuArr[0]);
		stu.setGrade(stuArr[1]);
		stu.setKor(Integer.parseInt(stuArr[2]));
		stu.setEng(Integer.parseInt(stuArr[3]));
		stu.setMath(Integer.parseInt(stuArr[4]));

		return stu;
	}

	public static void main(String[] args) throws Exception {
		
		Student[] stu = new Student[10];
		BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
		DecimalFormat df = new DecimalFormat("#.0");
		
		for (int i=0; i<stu.length; i++) {
			stu[i] = parse(reader.readLine());
		}

		System.out.println("이름 \t학년 \t국어 \t영어 \t수학 \t총점 \t평균");
		
		for (Student s : stu) {
			System.out.printf("%s \t%s \t%d점 \t%d점 \t%d점 \t%d점 \t%s점\n", 
							s.getName(), s.getGrade(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), df.format(s.getAvg()));
		}
	}
}
