package algoexpert.io;

import java.util.Arrays;
import java.util.Hashtable;

public class TwoSumNumbers {
    public static void main(String[] args) {
    int arr[]={3,5,-4,8,11,1,-1,6};
    twoSumOptamized(arr,13);
    }


    //Brute fore O(n^2)
    public static int[] twoSum(int [] arr,int target){
        int[] t=new int[2];
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum=arr[i];
            for (int j=i+1;j<arr.length;j++){
                sum=sum+arr[j];
                if (sum==target){
                    t[0]=i;
                    t[1]=j;
                }
                    sum=sum-arr[j];

            }
        }
        return t;
    }

    // Optimized solution O(nlogn)
    public static void twoSumOptamized(int[] arr,int target){
        Arrays.sort(arr);
        int sum=0;
        int n=arr.length;
        int last=n-1,start=0;
       while (last>start){
            sum=arr[start]+arr[last];
            if(sum==target){
                System.out.println(arr[start]);
                System.out.println(arr[last]);
                break;
            }else if (sum<target){
                start++;
            }else if(sum>target) {
                last--;
            }
        }
    }
}
