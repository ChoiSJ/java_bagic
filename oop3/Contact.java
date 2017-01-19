public class Contact {
	
	// 연락처 관리 프로그램
	// 연락처를 등록할 수 있다.
	// 등록된 연락처를 조회할 수 있다.
	// 1. 연락처 정보(번호, 이름, 전화번호, 이메일)를 저장할 수 있는 객체의 설계도 만들기
	// 2. 구현할 기능 선정하기
	//		- 등록
	//			배열에 Contact 객체를 저장하는 것 구현하기
	//	
	//		- 조회
	//			배열에 저장된 모든 Contact 객체의 정보를 표시하는 것 구현하기
	
	private int no; 
	private String name;
	private String phone;
	private String email;

	// 기본 생성가
	public Contact() {
	
	}

	// getter/setter 메소드
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}