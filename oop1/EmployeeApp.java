public class EmployeeApp {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee es = new Employee();
		
		// 연봉계산기
		es.annual(300);
	
		e1.no = 1;
		e1.name = "장보고";
		e1.phone = "010-3939-3939";
		e1.department = "해군";
		e1.position = "소장";
		e1.salary = 1000;

		e2.no = 2;
		e2.name = "전봉준";
		e2.phone = "010-1234-9876";
		e2.department = "농림수산부";
		e2.position = "장관";
		e2.salary = 5000;
		
		e1.personal();
		e2.personal();
	}
}