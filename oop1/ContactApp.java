public class ContactApp {
	public static void main(String[] args) {
		
		Contact c1 = new Contact();
		Contact c2 = new Contact();

		c1.no = 23;
		c1.name = "홍길동";
		c1.cellnum = "010-1234-5678";
		c1.email = "hong@gmail.com";

		c2.no = 25;
		c2.name = "김유신";
		c2.cellnum = "010-3939-3939";
		c2.email = "kim@gmail.com";

		c1.call();
		c2.call();

		c2.sendMail();
		
		Contact[] contact = new Contact[100];
		contact[0] = c1;
		contact[1] = c2;
	}
}