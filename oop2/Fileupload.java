public class Fileupload {
	
	long maxFileSize;
	int maxFileAmount;

	public Fileupload() {				// �⺻ �����ڷ� �����尪�� ����
		maxFileSize = 1024 * 1024 * 10; // 10M
		maxFileAmount = 10;
	}

	public Fileupload(long size) {
		maxFileSize = size;				// long �̻��� ����� �䱸�� �� ���� ����
		maxFileAmount = 10;
	}

	public Fileupload(int amount) {
		maxFileSize = 1024 * 1024 * 10;
		maxFileAmount = amount;			// 10�� �̻��� ���ε尡 �ʿ��� �� �ʿ� ��ġ�� ���� ����
	}

	public void upload() {
		System.out.println("���� ���ε� ���� ��...");
		System.out.println("�ִ� ���� ������: " + maxFileSize);
		System.out.println("�ִ� ���� ����: " + maxFileAmount);
	}
}