public class MemberApp {
	public static void main(String[] args) {
		
		// ȸ�������� ��� ���� Member ��ü�� �����ϰ�
		// setter �� ����ؼ� �̸�, ���̵�, ���, ���� ���� �����͸� ��ü�� �����ϱ�
		Member mem = new Member();
		mem.setName("�հ�");
		mem.setId("wang_gun");
		mem.setPassword("1234");
		mem.setAge(35);

		// ������ Member ��ü�� ����� ���� ȭ�鿡 getter �Լ��� ����ؼ� ȭ�鿡 ����ϱ�
		System.out.println("ȸ���̸�:" + mem.getName());
		System.out.println("�� �� ��:" + mem.getId());
		System.out.println("�н�����:" + mem.getPassword());
		System.out.println("��    ��:" + mem.getAge());
	}
}