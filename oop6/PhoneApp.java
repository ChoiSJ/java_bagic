public class PhoneApp {
	public static void main(String[] args) {
		
		SmartPhone p = new SmartPhone();

		p.telNumber = "010-1234-5678";
		
		p.call("010-2222-2222");
		p.message("010-2222-2222", "-ㅁ-ㅁ-ㅁ-ㅁ-ㅁ-");
		
		p.ip = "210.11.123.152";
		p.email = "hong@gmail.com";

		p.web("http://www.daum.net");
		p.sendEmail("lee@gmail.com", "과제물", "주말 코딩과제입니다.");
		
		
		FeaturePhone f = new FeaturePhone();
		
		f.telNumber = "010-5678-1572";
		f.call("010-1111-1111");
		f.message("010-1111-1111", "7시에 교보문고 앞에서 만나.");
		f.keypad();
	} 
}