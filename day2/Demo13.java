public class Demo13 {
	public static void main(String[] args) {
		// �߰�������
		// ++ 1�� ����		-- 1�� ����
		int a = 3;
		a++;
		++a;
		System.out.println("a�� ��: " + a);

		a--;
		--a;
		--a;
		System.out.println("a�� ��: " + a);

		int x = 10;
		int y = 10;
		
		// ���������ڸ� �ٸ� �����ڿ� ȥ���ؼ� ����ϸ�
		// ������������ ��ġ�� �ٶ� �ٸ� ����� ����� �� �ֱ� ������
		// �����ϸ� �ٸ� �����ڿ� ȥ���ؼ� ������� ����.
		int m = x++;	// x�� ���� m�� �����ϰ� ����
		int n = ++y;	// y�� ���� �����ϰ� m�� ����

		System.out.println("m�� ��: " + m);
		System.out.println("m�� ��: " + n);
		System.out.println("m�� ��: " + x);
		System.out.println("m�� ��: " + y);

	}
}