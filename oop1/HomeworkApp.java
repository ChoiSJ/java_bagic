public class HomeworkApp {
	public static void main(String[] args) {
		
		Homework ho1 = new Homework();
		Homework ho2 = new Homework();

		int result1 = ho1.big(15000, 2, 120, 10000);
		boolean result2 = ho2.included(1, 2, 3, 4, 1);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}