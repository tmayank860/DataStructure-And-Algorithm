package recursion;

public class FirstIndexFind {
	public static void main(String[] args) {
		int[] arr= {5,7,9,7,4};
		System.out.println(fIndex(arr, 0, 5));;
	}
	public static int fIndex(int[] arr,int st,int num) {
		if(st==arr.length) {
			return -1;
		}
		if(arr[st]==num) {
			return st;
		}else {
			return fIndex(arr,st+1,num);
		}
	}
}
