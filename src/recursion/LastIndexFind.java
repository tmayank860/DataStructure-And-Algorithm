package recursion;

import java.util.Scanner;

public class LastIndexFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int num=sc.nextInt();
			
			System.out.println(lIndex(arr, 0, num));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static int lIndex(int[] arr, int indx, int num) {
		if (indx == arr.length) {
			return -1;
		}
		int x = lIndex(arr, indx + 1, num);
		if (x == -1) {
			if (arr[indx] == num) {
				return indx;
			} else {
				return -1;
			}
		} else {
			return x;
		}
	}
}
