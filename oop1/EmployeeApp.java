public class EmployeeApp {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee es = new Employee();
		
		// ��������
		es.annual(300);
	
		e1.no = 1;
		e1.name = "�庸��";
		e1.phone = "010-3939-3939";
		e1.department = "�ر�";
		e1.position = "����";
		e1.salary = 1000;

		e2.no = 2;
		e2.name = "������";
		e2.phone = "010-1234-9876";
		e2.department = "�󸲼����";
		e2.position = "���";
		e2.salary = 5000;
		
		e1.personal();
		e2.personal();
	}
}