public class ProductApp {
	public static void main(String[] args) {
		
		// �Ӽ�
		// ��ǰ��ȣ, ��ǰ��, ������, ����, ������(�Ǽ�), �Ǹſ���
		// ��ǰ�� 5�� ��� �迭�� �����ϱ�

		Product[] pro = new Product[5];
		// �迭�� ��ǰ 5�� �����ϱ�

		pro[0] = new Product(1, "������7", "����", 10000, 10.5, true);
		pro[1] = new Product(2, "�ؼ���5X", "����(LG)", 5000, 30.9, true);
		pro[2] = new Product(3, "������7", "�Ｚ", 10000, 40.0, false);
		pro[3] = new Product(4, "����V20", "LG", 6000, 30.0, false);
		pro[4] = new Product(5, "�����丮��XZ", "�Ҵ�", 12000, 5.7, true);
		// �迭�� ����� ��ǰ �߿��� �Ǹ� ���� ��ǰ�� ǥ���ϱ�
		
		System.out.print("���� �Ǹ� ��: ");
		for (Product now : pro) {
			if (now.isSale == true) { 
				System.out.printf("%s ", now.name);
			}
		}
		System.out.println();
		// �迭�� ����� ��ǰ �߿��� ������ 10000�� �̻��� ��ǰ�� ǥ���ϱ�

		System.out.print("���� 1���� �̻�: ");
		for (Product now : pro) {
			if (now.price >= 10000) { 
				System.out.printf("%s ", now.name);
			}
		}
		System.out.println();
		// �迭�� ����� ��ǰ�� ��ü ������ ǥ���ϱ�
		
		System.out.println("��ǰ ��ü ���� ����Ʈ");
		for (Product now : pro) {
			System.out.print(now.name + " - ����: ");
			System.out.print(now.price + ", ���ΰ�: ");
			System.out.print(now.discountPrice() + "\n");
		}
	}
}