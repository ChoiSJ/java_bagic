public class PhoneApp2 {
	public static void main(String[] args) {
		
		
		SmartPhone	 p1 = new SmartPhone();
		FeaturePhone p2 = new FeaturePhone();
		// p1 ���������� SmartPhone �� �����ϰ� �ֱ� ������
		// SmartPhone ��ü�� �ʵ�� �Ӽ��� ���ٰ����ϰ�,
		// Phone ��ü�� �ʵ�� �Ӽ��� ���ٰ����ϴ�.
		p1.ip = "192.168.0.1";					// SmartPhone �� ���ǵ� �ʵ�
		p1.web("www.google.co.jp");				// SmartPhone �� ���ǵ� �޼ҵ�
		p1.telNumber = "010-1234-5678";			// Phone �� ���ǵ� �ʵ�
		p1.call("010-1111-2222");				// Phone �� ���ǵ� �޼ҵ�

		
		// SmartPhone �� FeaturePhone �� Phone Ÿ���� ���������� ���
		// ��Ӱ��迡 �ִ� Ŭ������ ��� �θ�Ÿ���� ���������� �ڽ�Ŭ���� Ÿ���� ��ü�� ������ �� �ִ�.
		Phone		 p3 = new SmartPhone();
		Phone		 p4 = new FeaturePhone();
		
		p3.web("www.google.co.kr");
		p3.telNumber = "010-7894-4561";
		p3.call("010-1111-3333");

		//System.out.println(p2);
		//System.out.println(p3);
	}
}