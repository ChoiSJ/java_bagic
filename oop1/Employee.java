public class Employee {
	
	// ���� ������ �����ϰ� �� ������ ����ϴ� ����� ������ ���赵
	// �Ӽ�
	// ��� ��ȣ, �̸�, ��ȭ��ȣ, �ҼӺ���, ����, �޿�
	int no;
	String name;
	String phone;
	String department;
	String position;
	int salary;

	// ���
	// ������ ����ؼ� ��ȯ�ϴ� �޼ҵ�
	// ����� ��� ������ ����ϴ� �޼ҵ�
	public int annual(int x) {
		int result = x*12;
		System.out.println("������ " + result + " ���� �Դϴ�.");

		return result;
	}

	public void personal() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phone);
		System.out.println("�μ�: " + department);
		System.out.println("��å: " + position);
		System.out.println("�޿�: " + salary);
	}
}