public class ContactApp {
	public static void main(String args) {
	
		// �ּҷ�����(�̸�, �������� ��ȭ��ȣ, �ּ�)�� �����ϴ� ��ü ����
		Contact contact = new Contact();
		
		String name = "ȫ�浿";
		contact.setName(name);
		
		// ��ȭ��ȣ ����
		Tel[] phone = new Tel[10];
		
		Tel tel1 = new Tel();
		tel1.setType("��");
		tel1.setNumber("080-3939-3939");
		phone[0] = tel1;

		Tel tel2 = new Tel();
		tel2.setType("����");
		tel2.setNumber("02-1234-5678");
		phone[1] = tel2;

		contact.setTels(phone);

		// �ּ����� ����(�ڵ�, �õ�, ����, ��)
		Address addr = new Address();

		addr.setSido("����Ư����");
		addr.setGugun("���α�");
		addr.setDetail("���͵� ��Ƹ����� 401ȣ");

		contact.setAddress(addr);
	}
}