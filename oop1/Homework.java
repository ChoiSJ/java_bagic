public class Homework {
	// 배열을 전달받아서 그 배열에서 가장 큰 값을 반환하는 메소드
	int x;

	public int big(int a, int b, int c, int d) {
		
		int[] y = {a, b, c, d};
		for (int i=0; i<=3; i++) {
			if (y[i]>x) {
				x = y[i];
			}
		}
		
		return x;
	}
	
	// 배열과 숫자를 전달받아서 그 배열에 그 숫자가 포함되어 있는지 여부를 반환하는 메소드
	public boolean included(int a, int b, int c, int d, int e) {
		//int[] values
		boolean result = false;		// 불린은 숫자의 여부도 가능하다. 
		int[] y = {a, b, c, d};
		int z = e;
		for (int i=0; i<=3; i++) {
			if (y[i] == z) {
				result = true;
				break;				// 숫자가 하나만 맞으면 성공이므로 break 로 탈출하게 조정
			} else {
				result = false;
			}
		}

		return result;
	}
}