public class ForDemo6 {
	public static void main(String[] args) {
		
		// 1~100������ ���� ����ϱ�
		// ��, �հ谡 3000�� �Ѿ�� ������ ���ڸ� �˾Ƴ���
		int total = 0;
		int number = 0;

		for (int i=1; i<=100; i++) {
			total += i;
		}
		System.out.print(total + "\t");
		total = 0;
		
		for (int i=1; i<=100; i++) {
			total += i;
			if (total>=3000) {
				number = total;
				break;
			}
		}
		System.out.println(number);
	}
}