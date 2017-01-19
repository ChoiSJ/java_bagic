public class MemberApp {
	public static void main(String[] args) {
		
		// 회원정보를 담기 위한 Member 객체를 생성하고
		// setter 를 사용해서 이름, 아이디, 비번, 나이 등의 데이터를 객체에 저장하기
		Member mem = new Member();
		mem.setName("왕건");
		mem.setId("wang_gun");
		mem.setPassword("1234");
		mem.setAge(35);

		// 생성된 Member 객체에 저장된 값을 화면에 getter 함수를 사용해서 화면에 출력하기
		System.out.println("회원이름:" + mem.getName());
		System.out.println("아 이 디:" + mem.getId());
		System.out.println("패스워드:" + mem.getPassword());
		System.out.println("연    령:" + mem.getAge());
	}
}