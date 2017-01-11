public class MemberService {
	
	// ������
	private Member member;
	
	// �α��� ����
	private boolean auth = false;

	public MemberService(Member member) {
		this.member = member;
	}
	/*
	// ���̵�� ��й�ȣ�� ���޹޾Ƽ� �α��� ���� ���θ� ��ȯ�ϴ� �޼ҵ�
	public boolean login(String id, String password) {
		boolean result = false;
		if (member.getId() == id && member.getPassword() == password) {
			result = true;
		} 
		return result;
	}
	
	// ���̵� ���޹޾Ƽ� �α׾ƿ������ �����ϴ� �޼ҵ�
	public void logout(String id) {
		System.out.println("[" + id + "] ���� �α׾ƿ� �Ǿ����ϴ�.");
	}
	*/

	public boolean isAuth() {
		return auth;
	}

	// ���̵�� ����� ���޹޾Ƽ� member�� ����� ���̵� ��й�ȣ�� ���ؼ�, auth�� ��Ƶα�
	public void login(String id, String password) {
		if (member.getId().equals(id) && member.getPassword().equals(password)) {
			auth = true;
		} 
	}

	// �α׾ƿ� ó���ϱ� (auth�� ���� false�� �ٲٱ�)
	public void logout() {
		if (auth) {
			auth = false;
		}
	}
}