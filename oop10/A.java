public class A {
	public static void main(String[] args) {
	
		A a1 = new A();
		A a2 = new A();

		System.out.println(a1);

		System.out.println(a1.equals(a2));
		System.out.println(a1 == a2);

		String s1 = "샘플";
		String s2 = new String("샘플");
		String s3 = new String("샘플");

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);

		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println(obj1.equals(obj2));
	}
}