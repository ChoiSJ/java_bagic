public class MemberServiceApp {
	public static void main(String[] args) {
		
		/*
			�̸�:		"ȫ�浿"
			���̵�:		"hong"
			��й�ȣ:	"1234"
			����:		"30"
			������ ���� Member ��ü�� MemberService ��ü �����ϱ�
		*/

		Member member = new Member();
		member.setName("ȫ�浿");
		member.setId("hong");
		member.setPassword("1234");
		member.setAge(30);
		MemberService mem = new MemberService(member);
		
		// MemberService �� ���ǵ� login ��� ����غ���
		mem.login("hong", "1234");
		System.out.println(mem.isAuth());

		mem.logout();
		System.out.println(mem.isAuth());

		// Member ��ü�� �ҷ��� �ʵ尪�� �Է��ϰ�, �� ��ü�� ����� ���ǵ� Ŭ���� MemberService �� ������.
		// ��� Ŭ������ ���� ���� ��� Ŭ������ �޼ҵ带 �̿��� ���� ó���Ѵ�.
	}
}