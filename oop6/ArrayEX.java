public class ArrayEX {
	public static void main(String[] args) {
		
		ArrayService as = new ArrayService();
		
		int[] arr1 = as.move(6);
		int[] arr2 = as.copy(7);
		int[] arr3 = as.copy(4, 9);
		int[] arr4 = as.shift(2, 5);
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		for (int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		for (int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
	}
}