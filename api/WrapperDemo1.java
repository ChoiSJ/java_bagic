public class WrapperDemo1 {
	public static void main(String[] args) {
	
		// ���� 23�� �����ϰ� �ִ� Integer ��ü�� �����ϴ� a
		//Integer a = new Integer(12345);			// <-- �ڽ�(Boxing)
		Integer a = new Integer("12345");
		// integer ��ü�� ������ �������� ��ȯ�ϴ� �޼ҵ�: int intValue()
		int x = a.intValue();					// <-- ��ڽ�(unBoxing)
		double y = a.doubleValue();
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);

		// ���� 23�� �����ϴ� b
		int b = 12345;
	}
}