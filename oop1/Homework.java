public class Homework {
	// �迭�� ���޹޾Ƽ� �� �迭���� ���� ū ���� ��ȯ�ϴ� �޼ҵ�
	int x;

	public int big(int a, int b, int c, int d) {
		
		int[] y = {a, b, c, d};
		for (int i=0; i<=3; i++) {
			if (y[i]>x) {
				x = y[i];
			}
		}
		
		return x;
	}
	
	// �迭�� ���ڸ� ���޹޾Ƽ� �� �迭�� �� ���ڰ� ���ԵǾ� �ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�
	public boolean included(int a, int b, int c, int d, int e) {
		//int[] values
		boolean result = false;		// �Ҹ��� ������ ���ε� �����ϴ�. 
		int[] y = {a, b, c, d};
		int z = e;
		for (int i=0; i<=3; i++) {
			if (y[i] == z) {
				result = true;
				break;				// ���ڰ� �ϳ��� ������ �����̹Ƿ� break �� Ż���ϰ� ����
			} else {
				result = false;
			}
		}

		return result;
	}
}