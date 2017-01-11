public class ArrayDemo5 {
	public static void main(String[] args) {
		String[][] names = {{"홍길동", "김유신"}, {"강감찬", "이순신", "권률"}, {"을지문덕"}};

		// 배열의 크기
		System.out.println("배열의 크기: " + names.length);
		// 0번째 배열의 크기
		System.out.println("0번째 배열의 크기: " + names[0].length);
		// 1번째 배열의 크기
		System.out.println("1번째 배열의 크기: " + names[1].length);
		// 2번째 배열의 크기
		System.out.println("2번째 배열의 크기: " + names[2].length);


		for (int i=0; i<names.length; i++) {		// name.length <- 배열의 행의 갯수
		
			for (int j=0; j<names[i].length; j++) {	// name[i].length <- 각배열의 열의 갯수
			
			System.out.println(names[i][j]);
			}
		}
	}
}