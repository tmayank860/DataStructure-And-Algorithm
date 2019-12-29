package recursion.problems;

public class FoundAtLast {
    public static void main(String[] args) {
        int arr[]={5,-65,77,54,77};
        System.out.print(foundIndex(arr,0,77));
    }

    public static int foundIndex(int arr[],int i,int m){
        if(i==arr.length){
            return -1;
        }
        int indx=foundIndex(arr,i+1,m);

    if (indx==-1) {
        if (arr[i] == m) {
            return i;
        } else {
            return foundIndex(arr, i + 1, m);
        }
    }
        return indx;
    }
}
