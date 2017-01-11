public class EmployeeApp {
	public static void main(String[] args) {
	
		// 3���� ��������� �����ϱ�
		Employee[] employees = new Employee[3];
		
		// ��� ����
		Employee emp1 = new Employee();
		emp1.no = 23;
		emp1.name = "�ÿ�";

		// ������� ����
		Sales emp2 = new Sales();
		emp2.no = 25;
		emp2.name = "����";
		emp2.goal = 50;
		emp2.result = 37;
	
		// ���ߺλ�� ����
		Developer emp3 = new Developer();
		emp3.no = 27;
		emp3.name = "�հ�";
		emp3.todo = 10;
		emp3.completed = 4;

		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;

		// �� ����ϱ�
		//employee[0].print();
		//employee[1].print();
		//employee[2].print();
		//for (int i=0; i<employees.length; i++) {
		//	employees[i].print();
		//}
		for (Employee emp : employees) {
			//emp.print();

			//boolean value = emp instanceof Developer;
			//System.out.println(value);
			if (emp instanceof Sales) {
				((Sales) emp).drawGraph();	
			} else if (emp instanceof Developer) {
				((Developer) emp).develop();
			}
		}
	}
}