public class ArrayDemo1 {
	public static void main(String[] args) {
		
		// 정수 5개를 가지고 있는 배열 만들기
		int[] numbers = {1, 5, 8, 10, 4, 45, 63, 36, 72, 35, 74, 25, 73, 74, 35, 89, 29, 95, 345, 69};

		// 배열의 크기를 알아내기
		// number.length
		int size = numbers.length;
		System.out.println("배열의 크기: " + size);

		// 배열에서 값 가져오기
		// number[인덱스번호]
		int x = numbers[0];
		int y = numbers[1];
		System.out.println("배열의 0번째 값: " + x);
		System.out.println("배열의 1번째 값: " + y);

		// 모든 숫자의 합을 구하기
		//int total = number[0] + number[1] + number[2] + number[3] + number[4];
		//System.out.println("합계: " + total);

		/*
		int total = 0;
		total += number[0];
		total += number[1];
		total += number[2];
		total += number[3];
		total += number[4];
		*/
		
		int total = 0;
		for (int z : numbers) {
			total += z;
		}
		System.out.println("합계: " + total);

		//int total = 0;
		//for (int i=0; i<size; i++) {
		//	total += numbers[i];
		//}
		//System.out.println("합계: " + total);
	}
}