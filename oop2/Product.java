public class Product {
	// �Ӽ�
	// ��ǰ��ȣ, ��ǰ��, ������, ����, ������(�Ǽ�), �Ǹſ���
	int no;
	String name;
	String company;
	int price;
	double discount;
	boolean isSale;

	// ������
	//		�⺻������, �Ű����� �ִ� ������
	public Product() {
		no = 1;
		name = "";
		company = "";
		price = 0;
		discount = 0;
		isSale = false;
	}
	
	public Product(int nanba, String namae, String kaisya, int nedan, double waribiki, boolean hanbai) {
		no = nanba;
		name = namae;
		company = kaisya;
		price = nedan;
		discount = waribiki;
		isSale = hanbai;
	}

	// ���
	// ���ε� ����(���)�� ��ȯ�ϴ� �޼ҵ�
	public int discountPrice() {
		int result = 0;
		result = (int) (price - (price/100)*discount);		// ��ȣ ���� �� ��
		return result;
	}

	// ��ǰ������ ��� ����ϴ� �޼ҵ�(���ΰ� ����)
	public void info() {
		System.out.println("------------------------------");
		System.out.println("��ǰ��ȣ: " + no);
		System.out.println("��ǰ��: " + name);
		System.out.println("������: " + company);
		System.out.println("����: " + price);
		System.out.println("������: " + discount);
		System.out.println("���ΰ�: " + discountPrice());
		System.out.println("�Ǹſ���: " + isSale);
		System.out.println("------------------------------");
	}
}