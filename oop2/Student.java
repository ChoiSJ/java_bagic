public class Student {
	int no;			// �й�
	String name;
	int kor;
	int eng;
	int math;

	// �⺻ ������
	public Student() {
		no = 1;
		name = "";
		kor = 0;
		eng = 0;
		math = 0;
	}
	
	// ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	public Student(int nanba, String namae, int kokugo, int eigo, int sugaku) {
		no = nanba;
		name = namae;
		kor = kokugo;
		eng = eigo;
		math = sugaku;
	}

	// ������ ��ȯ�ϴ� ��� -> total
	public int total() {
		int result = kor + eng + math;
		return result;
	}

	// ����� ��ȯ�ϴ� ��� -> avg
	public double avg() {
		double result = total()/3.0;
		return result;
	}

	// �л� ������ ����ϴ� ���(������ ��յ� ����) - info
	public void info() {
		System.out.println("--------------------");
		System.out.println("�й�: " + no);
		System.out.println("�̸�: " + name);
		System.out.println("����: " + kor);
		System.out.println("����: " + eng);
		System.out.println("����: " + math);
		System.out.println("����: " + total());
		System.out.println("���: " + avg());
	}
}