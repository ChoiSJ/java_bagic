import java.util.Scanner;

public class IfDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1: Ŀ��(1500��) 2: �����꽺(2000)�� 3: �̿�����(1000��)");

		System.out.print("�ݾ��� �Է��ϼ���:");
		int money = sc.nextInt();
		System.out.print("�����ȣ�� �Է��ϼ���:");
		int no = sc.nextInt();
		
		int returnCoin = 0; // �ܵ� ���� ����
		
		// if�� �̿��� 1�� ������ ��� �Է±ݾ׿��� �ش� ǰ���� �ݾ� ����
		// �׸��� �ٽ� �� �ȿ��� if�� �̿��� �ܵ��� 0�� �̸��� ��� �ݾ׺��� �޽���, �̻��� ��� else�� �̵��ϰԲ� ����
		// else if�� �̿��� 2�� 3�� �ݺ�
		// else�� �������� ���� ��� �޽����� ������ ǥ�õȴٴ� �� Ȯ��
		if (no == 1) { 
			returnCoin = money - 1500;
			if (returnCoin < 0) {
				System.out.println("�ݾ��� �����մϴ�. ó������ �ٽ� �õ����ּ���.");
			} else {
				System.out.println("�̿����ּż� �����մϴ�. Ŀ�Ǹ� �޾ư�����.");
			}
		} else if (no == 2) {
			returnCoin = money - 2000;
			if (returnCoin < 0) {
				System.out.println("�ݾ��� �����մϴ�. ó������ �ٽ� �õ����ּ���.");
			} else {
				System.out.println("�̿����ּż� �����մϴ�. �����꽺�� �޾ư�����.");
			}
		} else if (no == 3) { 
			returnCoin = money - 1000;
			if (returnCoin < 0) {
				System.out.println("�ݾ��� �����մϴ�. ó������ �ٽ� �õ����ּ���.");
			} else {
				System.out.println("�̿����ּż� �����մϴ�. �̿����Ḧ �޾ư�����.");
			}
		} else {
			System.out.println("��ȣ�� �ٽ� �Է��ϼ���.");
		}
		
		// �ܵ� �ż� ����: ���ϴ� �ڸ����� ���� ��� ���� ���ʿ��� �ݾ��� �� �������� �Ѵ�.
		// ���� �� ������ ����� ���� ���� ������ ���� �ٽ� ���� ���� ���ϴ� �ݾ��� ���´�.
		// �� ���� ����� ���� �� ������ ����� �̰����� Ÿ��
		// �ܵ��� ���̳ʽ��� �����Ǿ��� �� if�� ��� ���ƾ� �ϴ� ���ΰ�. �ª���̡�
		int itiman = returnCoin/10000;
		int gosen = (returnCoin - itiman*10000)/5000;
		int issen = (returnCoin - itiman*10000 - gosen*5000)/1000;
		int gohyaku = (returnCoin - itiman*10000 - gosen*5000 - issen*1000)/500;
		int hyaku = (returnCoin - itiman*10000 - gosen*5000 - issen*1000 - gohyaku*500)/100;
		int gozyu = (returnCoin - itiman*10000 - gosen*5000 - issen*1000 - gohyaku*500 - hyaku*100)/50;
		int zyu = (returnCoin - itiman*10000 - gosen*5000 - issen*1000 - gohyaku*500 - hyaku*100 - gozyu*50)/10;
		
		// System.out.print�� �� ���̰� ġ�� ���� ������� �ʴ� ���Ͽ� /n���� ��ü
		System.out.println("�Ž�����: " + returnCoin + "��");
		System.out.print("�ܵ� ����: " + itiman + "��\n" +
						"�ܵ� ��õ��: " + gosen + "��\n" +
						"�ܵ� õ����: " + issen + "��\n" +
						"�ܵ� �����: " + gohyaku + "��\n" +
						"�ܵ� ���: " + hyaku + "��\n" +
						"�ܵ� ���ʿ�: " + gozyu + "��\n" +
						"�ܵ� �ʿ�: " + zyu + "��\n");
	}
}