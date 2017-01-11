public class Employee {
	
	// 인적 정보를 저장하고 그 정보를 출력하는 기능이 구현된 설계도
	// 속성
	// 사원 번호, 이름, 전화번호, 소속부터, 직위, 급여
	int no;
	String name;
	String phone;
	String department;
	String position;
	int salary;

	// 기능
	// 연봉을 계산해서 반환하는 메소드
	// 사원의 모든 정보를 출력하는 메소드
	public int annual(int x) {
		int result = x*12;
		System.out.println("연봉은 " + result + " 만원 입니다.");

		return result;
	}

	public void personal() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
		System.out.println("부서: " + department);
		System.out.println("직책: " + position);
		System.out.println("급여: " + salary);
	}
}