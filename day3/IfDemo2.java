public class IfDemo2 {
	public static void main(String[] args) {
		
		int score = 68;
		if (score >= 60) {
			System.out.println("�հ��Դϴ�.");
			if (score > 95) {
			System.out.println("���б��� �����մϴ�."); // �ؿ� ���� if �� �ϳ� �� ���� �ͺ��� ȿ����
			}
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		// �ٱ��� if �� �ۼ��ϸ� ���༺�ɸ鿡�� ��������.
		/*
		if (score > 95) {
			System.out.println("���б��� �����մϴ�.");
		} 
		*/
	}
}