import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// �޴��̸��� �����ϴ� HashSet ��ü �����
		
		boolean r = false;
		HashSet<String> menuset = new HashSet<String>();
		r = menuset.add("û����");
		System.out.println("û����--->" + r);
		menuset.add("�����");
		menuset.add("�κ�����");
		menuset.add("�ѿ�������");
		menuset.add("Ȳ������");
		menuset.add("��������");
		menuset.add("��������");
		menuset.add("��������");
		r = menuset.add("��������");
		System.out.println("��������--->" + r);

		int len = menuset.size();
		System.out.println("����� ����:" + len);

		for (String menu : menuset) {
			System.out.println(menu);
		}
	}
}