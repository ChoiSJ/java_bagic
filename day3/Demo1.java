public class Demo1 {
	public static void main(String[] args) {
		// 논리 연산자
		int x = 10;
		int y = 10;
		
		// &&는 좌변이 false 이면 우변을 평가하지 않고 바로 전체 결과를 false 로 판정.
		boolean result1 = false && x++ > 10;
		// &는 좌변이 false 여도 우변을 평가한다.
		boolean result2 = false & y++ > 10;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("x: " + x);	// x는 10이 출력됨
		System.out.println("x: " + y);	// y는 11이 출력됨
	}
}