public class MethodDemo2 {

	public static void displayGugudan(int dan) {
		System.out.println(dan + "단");
		for (int num=1; num<=9; num++) {
			int result = 0;
			result = dan*num;
			System.out.println(dan + " * " + num + " = " + result);
		}
	}

	public static void main(String[] args) {
		displayGugudan(2);

		displayGugudan(19);
	}
}