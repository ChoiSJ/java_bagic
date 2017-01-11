public class ArrayService {
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	// 배열 이동시키기
	// arr1 배열에서 지정된 번호를 제일 뒤로 하고 그 뒤의 자리를 한 자리씩 앞으로 당기기
	public int[] move(int no) {
		int[] result = new int[arr1.length];

		/*
		// 원본의 복사본을 만들자.
		int temp = arr1[no-1]
		int position = 0;

		for (int i=0; i<arr1.length; i++) {
			result[i] = arr[i];
		}
		
		// 제일 처음 덮혀쓰여질 값을 미리 보관해놓자.
		int number = arr1[no-1];
		
		// 배열의 값을 한 칸씩 앞으로 이동시키자.
		for (int i=no; i<arr1.length; i++) {
			result[i-1] = arr[i];
		}

		// 맨 마지막 칸에 아까 보관해두었던 값을 담자.
		result[result.length - 1] = number;

		System.out.println(java.util.Arrays.toString(result));

		return result;
		*/

		int index = 0;
		for (int i=no; i<arr1.length; i++) {
			arr1[i-1] = arr1[i];
		}
		arr1[arr1.length - 1] = no; 

		for (int x=0; x<arr1.length; x++) {
			result[index++] = arr1[x];
		}
		return result;
	}

	// 다 하면
	// arr4 (5, 2) 면, 5를 2칸 왼쪽으로 이동

	public int[] shift(int begin, int step) {
		int[] result = new int[10];
		int index = 0;
		
		for (int i=0; i<=step+1; i++) {
			
		}
		arr4[begin - 1 - step] = begin;

		for (int x=0; x<arr4.length; x++) {
			result[index] = arr4[x];
			index++;
		}

		return result;
	}

	// 배열 복사하기
	// arr2 배열을 지정된 위치부터 끝까지 복사한 배열을 반환하기
	public int[] copy(int begin) {
		int[] result = new int[arr2.length-begin+1];
		int index = 0;
		
		for (int i=begin-1; i<arr2.length; i++) {
			result[index++] = arr2[i];
		//	result[i-begin] = arr2[i];
		}
		return result;
	
	}

	// 배열 잘라내기
	// arr3 배열을 지정된 위치부터 지정된 위치까지 복사한 배열을 반환하기
	public int[] copy(int begin, int end) {
		int[] result = new int[(10-begin)-(10-end)+1];
		int index = 0;
		
		for (int i=begin-1; i<end; i++) {
			result[index++] = arr3[i]; 
		}
		return result;
		// return copy(begin, 9)
	}
}