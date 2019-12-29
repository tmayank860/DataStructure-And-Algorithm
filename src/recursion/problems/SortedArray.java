package recursion.problems;

public class SortedArray {
    public static void main(String[] args) {

        int arr[]={3,4,7,9};
        System.out.print(sorted(arr,0));
    }
    public static boolean sorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }else return sorted(arr,i+1);
    }
}
