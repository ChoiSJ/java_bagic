public class MemberServiceApp {
	public static void main(String[] args) {
		
		/*
			이름:		"홍길동"
			아이디:		"hong"
			비밀번호:	"1234"
			나이:		"30"
			정보를 가진 Member 객체를 MemberService 객체 생성하기
		*/

		Member member = new Member();
		member.setName("홍길동");
		member.setId("hong");
		member.setPassword("1234");
		member.setAge(30);
		MemberService mem = new MemberService(member);
		
		// MemberService 에 정의된 login 기능 사용해보기
		mem.login("hong", "1234");
		System.out.println(mem.isAuth());

		mem.logout();
		System.out.println(mem.isAuth());

		// Member 객체를 불러와 필드값을 입력하고, 그 객체를 기능이 정의된 클래스 MemberService 로 보낸다.
		// 기능 클래스로 값을 보내 기능 클래스의 메소드를 이용해 값을 처리한다.
	}
}