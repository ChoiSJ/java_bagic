public class StudentApp2 {
	public static void main(String[] args) {
		
		// �л����� ���� �� �����ϴ� �迭 �����
		// Student ��ü 5�� ���� �� �ִ� �迭�� �����ؼ� students ������ ��Ҵ�.
		Student[] students = new Student[3];

		students[0] = new Student(1, "����", 40, 80, 90);
		students[1] = new Student(5, "����", 80, 70, 70);
		students[2] = new Student(7, "�浿", 90, 10, 20);

		//students[0].info();			// �迭�� �־����� ȣ�⵵ �迭����
		//students[1].info();
		//students[2].info();

		//for (int i=0; i<students.length; i++) {
			//Student s = students[i];
			//s.info();
		//}
		
		System.out.println("�̸� ���� ���� ���� ���� ���");
		for (Student s : students) {	
			//s.info();
			//System.out.println(s.total());
			System.out.printf("%s %d %d %d %d %f\n",
							s.name, s.kor, s.eng, s.math, s.total(), s.avg());
		}
	}
}