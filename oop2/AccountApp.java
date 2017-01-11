public class AccountApp {
	public static void main(String[] args) {
	
		Account acc = new Account();
		acc.owner = "¿Õ°Ç";
		acc.accountNumber = "123-1234-1234";
		acc.password = 1234;
		acc.balance = 10000000;

		int sample1 = acc.withdraw(100000, 1234);
		acc.deposit(15000);
		//acc.info();
	}
}