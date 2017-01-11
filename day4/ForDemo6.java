public class ForDemo6 {
	public static void main(String[] args) {
		
		// 1~100까지의 합을 계산하기
		// 단, 합계가 3000을 넘어가는 순간의 숫자를 알아내기
		int total = 0;
		int number = 0;

		for (int i=1; i<=100; i++) {
			total += i;
		}
		System.out.print(total + "\t");
		total = 0;
		
		for (int i=1; i<=100; i++) {
			total += i;
			if (total>=3000) {
				number = total;
				break;
			}
		}
		System.out.println(number);
	}
}