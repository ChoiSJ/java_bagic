public class Quizz6 {
	public static void main(String[] args) {
		/*
			1.�̸�, �μ�, ����, �޿��� ���� �� �ִ� Employee Ŭ���� �����ϱ�
			(�ʵ� ����, �⺻ ������, getter/setter)

			2. ^�� �������� ���ڿ� �߶� �迭�� ���
			3. �迭�� ��������� �ϳ��� �����ؼ� , �� �߶� �迭�� ���
			4. Employee ��ü�� ���� ��� ������ �� �����͸� Employee ��ü�� �����ϱ�
			5. Employee ��ü�� employees �迭�� �����ϱ�
			
			6. Employee �迭�� ����� ���� ����ϱ�

			���� for�� ����� ��
		*/

		String text = "ȫ�浿,������,����,200^������,������,����,300^������,�ѹ���,�븮,150^�̼���,�ѹ���,����,250";

		Employee[] employees = new Employee[4];
		//int position = 0;
		
		String[] totyu = text.split("\\^");
		
		for (int i=0; i<totyu.length; i++) {
			String[] arr = totyu[i].split(",");
			Employee emp = new Employee();
			
			emp.setName(arr[0]);
			emp.setDepartment(arr[1]);
			emp.setPosition(arr[2]);
			// int salary = Integer.parseInt(arr[3]);
			// emp.setSalary(salary);
			emp.setSalary(arr[3]);
			
			employees[i] = emp;
		}	
		
		for (int i=0; i<employees.length; i++) {
			System.out.println("-------------------------");
			System.out.println("��   ��:" + employees[i].getName());
			System.out.println("��   ��:" + employees[i].getDepartment());
			System.out.println("��   å:" + employees[i].getPosition());
			System.out.println("��   ��:" + employees[i].getSalary());
			System.out.println("-------------------------");
		}
		
	}
}