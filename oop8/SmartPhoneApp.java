public class SmartPhoneApp {
	public static void main(String[] args) {
	
		SmartPhone smart1 = new SmartPhone();

		smart1.setTelNumber("010-3939-3939");
		smart1.setCompany("LG");
		smart1.setIp("192.168.10.681\n");

		smart1.displayInfo();

		SmartPhone smart2 = new SmartPhone("080-3939-9797", "au", "192.168.23.568");

		smart2.displayInfo();
	}
}