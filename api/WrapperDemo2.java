public class WrapperDemo2 {
	public static void main(String[] args) {
	
		// Integer 의 정적메소드

		// 문자열을 int 값으로 변환하는 메소드: int parseInt(String text)
		int num1 = Integer.parseInt("123");

		int num2 = Integer.parseInt("1100", 2);
		System.out.println("num2:" + num2);

		int num3 = Integer.parseInt("a", 16);
		System.out.println("num3:" + num3);
		
		// 정수12를 2진수 문자열로 변환해서 반환한다.
		String str1 = Integer.toBinaryString(12);
		System.out.println("str1:" + str1);
		
		// 정수15345를 16진수 문자열로 변환해서 반환한다.
		String str2 = Integer.toHexString(15345);
		System.out.println("str2:" + str2);


		double num4 = Double.parseDouble("3.14");
		System.out.println(num4 * 2);
	}
}