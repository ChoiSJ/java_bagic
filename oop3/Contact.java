public class Contact {
	
	// ����ó ���� ���α׷�
	// ����ó�� ����� �� �ִ�.
	// ��ϵ� ����ó�� ��ȸ�� �� �ִ�.
	// 1. ����ó ����(��ȣ, �̸�, ��ȭ��ȣ, �̸���)�� ������ �� �ִ� ��ü�� ���赵 �����
	// 2. ������ ��� �����ϱ�
	//		- ���
	//			�迭�� Contact ��ü�� �����ϴ� �� �����ϱ�
	//	
	//		- ��ȸ
	//			�迭�� ����� ��� Contact ��ü�� ������ ǥ���ϴ� �� �����ϱ�
	
	private int no; 
	private String name;
	private String phone;
	private String email;

	// �⺻ ������
	public Contact() {
	
	}

	// getter/setter �޼ҵ�
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