public class ArrayService {
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	// �迭 �̵���Ű��
	// arr1 �迭���� ������ ��ȣ�� ���� �ڷ� �ϰ� �� ���� �ڸ��� �� �ڸ��� ������ ����
	public int[] move(int no) {
		int[] result = new int[arr1.length];

		/*
		// ������ ���纻�� ������.
		int temp = arr1[no-1]
		int position = 0;

		for (int i=0; i<arr1.length; i++) {
			result[i] = arr[i];
		}
		
		// ���� ó�� ���������� ���� �̸� �����س���.
		int number = arr1[no-1];
		
		// �迭�� ���� �� ĭ�� ������ �̵���Ű��.
		for (int i=no; i<arr1.length; i++) {
			result[i-1] = arr[i];
		}

		// �� ������ ĭ�� �Ʊ� �����صξ��� ���� ����.
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

	// �� �ϸ�
	// arr4 (5, 2) ��, 5�� 2ĭ �������� �̵�

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

	// �迭 �����ϱ�
	// arr2 �迭�� ������ ��ġ���� ������ ������ �迭�� ��ȯ�ϱ�
	public int[] copy(int begin) {
		int[] result = new int[arr2.length-begin+1];
		int index = 0;
		
		for (int i=begin-1; i<arr2.length; i++) {
			result[index++] = arr2[i];
		//	result[i-begin] = arr2[i];
		}
		return result;
	
	}

	// �迭 �߶󳻱�
	// arr3 �迭�� ������ ��ġ���� ������ ��ġ���� ������ �迭�� ��ȯ�ϱ�
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