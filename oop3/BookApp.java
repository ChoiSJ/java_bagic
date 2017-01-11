public class BookApp {
	public static void main(String[] args) {
		Book[] bookCart = new Book[5];

		bookCart[0] = new Book(1, "�̰��� �ڹٴ�", "ȫ�浿", "�Ѻ��̵��", 35000, "2015-10-10");
		bookCart[1] = new Book(2, "�ڹ� �� �׼�", "������", "�Ѻ��̵��", 3000, "2012-04-26");
		bookCart[2] = new Book(3, "������ �����ӿ�ũ", "������", "�Ѻ��̵��", 26000, "2016-02-14");
		bookCart[3] = new Book(5, "������ ��ť��Ƽ", "�̼���", "�Ѻ��̵��", 100000, "2007-03-09");
		bookCart[4] = new Book(7, "�ڹ� �� ���α׷���", "�Ƿ�", "�Ѻ��̵��", 1020000, "2004-08-03");

		// īƮ�� ����� ��� å���� ������ ǥ���ϱ�
		for (Book book : bookCart) {
			System.out.println(book.getTitle());
		}

		// īƮ�� ����� ��� å���� ���� ������ ǥ���ϱ�
		int totalPrice = 0;

		for (Book book : bookCart) {
			totalPrice += book.getPrice();
		}
		System.out.println("����: " + totalPrice);
		
		// īƮ�� ����� å �߿��� ���� ��� ������ å ����� ������ ǥ���ϱ�
		// ���ݰ� ������ ���� �׸��� for�� ���� �ƴ϶� �ٱ��� �����ؾ� �Ѵ�.
		// �ȿ� ������ �־�θ� for �� ȸ���ϸ鼭 �ʱⰪ���� ������ ���°� �ȴ�.
		int bestPrice = 0;
		String bestTitle = null;			// �����ϸ� String �� �ʱⰪ�� "" �� �ƴ϶� null ���� �ϴ� ���� ����.

		for (Book book : bookCart) {		// Ÿ���� ���� ��ü�� Ÿ��
			if (book.getPrice() > bestPrice) {
				bestPrice = book.getPrice();
				bestTitle = book.getTitle();
			}
		}

		// ���� Ÿ���� ��Ҹ� �� �⺻ Ÿ������ ��Ƴ���.
		
		System.out.println("######## ���� ��� å ########");
		System.out.println("����: " + bestTitle + ", ����: " +  bestPrice);
	}
}