/*
	StudentService sms
		�л� ������ ����/��ȸ/����/�����ϴ� ����� �����ϴ� Ŭ������.
*/

public class StudentService {
	
	private Student[] db = new Student[5];
	
	public StudentService() {
		db[0] = new Student(23, 3, "ȫ�浿", "010-1111-1111");
		db[1] = new Student(25, 1, "������", "010-2121-1111");
		db[2] = new Student(27, 2, "������", "010-3333-1111");
		db[3] = new Student(28, 5, "�̼���", "010-4444-1111");
		db[4] = new Student(30, 3, "�Ƿ�", "010-3939-3939");
	}

	// �й��� ���޹޾Ƽ� �� �й��� �ش��ϴ� �л������� ��ȯ�ϴ� �޼ҵ�
	public Student getStudentByNo(int no) {
		Student result = null;
		for (Student stu : db) {
			if (stu.getNo() == no) {
				result = stu;
				break;
			}
		}
		return result;
	}
	
	// �г��� ���޹޾Ƽ� �� �г⿡ �ش��ϴ� �л������� ��ȯ�ϴ� �޼ҵ�
	public Student[] getStudentByGrade(int grade) {
		Student[] result = null;
		Student[] temp = new Student[db.length];
		int position = 0;
		
		for (Student stu : db) {
			if (stu.getGrade() == grade) {
				temp[position] = stu;
				position++;
			}
		}

		result = new Student[position];
		for (int i=0; i<position; i++) {
			result[i] = temp[i];
		}

		return result;
	}

	// �й��� �л������� ���޹޾Ƽ� �� �й��� �ش��ϴ� �л������� �����ϴ� �޼ҵ�
	public void change(Student student) {
		for (int i=0; i<db.length; i++) {
			if (db[i].getNo() == student.getNo()) {
				db[i] = student;
			}
		}
	}
}