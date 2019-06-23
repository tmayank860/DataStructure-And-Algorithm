package recursion;

public class AllIndex {
	public static void main(String[] args) {
		
		int [] arr= {8,5,8,3,6,8,6};
		int[] ans=dataCount(arr,8,0,0);
		for(int i=0;i<ans.length;i++)
			System.out.println(ans[i]);
		
	}
	public static int[] dataCount(int[] arr,int item,int index,int count) {
		if(index==arr.length) {
			int carray[]=new int[count];
			return carray;
		}
		int indeces[]=null;
		if(arr[index]==item) {
			indeces= dataCount(arr, item,index+1,count+1);
		}else {
			indeces= dataCount(arr, item,index+1,count);
		}
		if(arr[index]==item) {
			indeces[count]=index;
		}
		return indeces;
	}
}
