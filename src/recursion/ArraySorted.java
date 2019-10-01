package recursion;

public class ArraySorted {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 9, 65 };
		System.out.println(sArray(arr, 0));

	}

	public static boolean sArray(int[] arr, int index) {
		if (index == arr.length - 1) {
			return true;
		}
		if (arr[index] > arr[index + 1]) {
			return false;
		} else {
			return (sArray(arr, index + 1));
		}
		
	}
}
