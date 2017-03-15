public class Quizz6 {
	public static void main(String[] args) {
		/*
			1.이름, 부서, 직위, 급여를 담을 수 있는 Employee 클래스 정의하기
			(필드 정의, 기본 생성자, getter/setter)

			2. ^를 기준으로 문자열 잘라서 배열에 담기
			3. 배열에 사원정보를 하나씩 추출해서 , 로 잘라서 배열에 담기
			4. Employee 객체를 만들어서 사원 정보의 각 데이터를 Employee 객체에 저장하기
			5. Employee 객체를 employees 배열에 저장하기
			
			6. Employee 배열에 저장된 정보 출력하기

			이중 for문 사용할 것
		*/

		String text = "홍길동,영업팁,과장,200^김유신,영업팀,부장,300^강감찬,총무부,대리,150^이순신,총무부,차장,250";

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
			System.out.println("이   름:" + employees[i].getName());
			System.out.println("부   서:" + employees[i].getDepartment());
			System.out.println("직   책:" + employees[i].getPosition());
			System.out.println("급   여:" + employees[i].getSalary());
			System.out.println("-------------------------");
		}
	}
}
