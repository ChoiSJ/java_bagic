public class ForDemo5 {
	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
			if (i == 5) {
				break; // 가장 가까운 for문 에서 탈출
			}
		}
	} 
}