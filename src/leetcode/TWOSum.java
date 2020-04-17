package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class TWOSum {
    public static void main(String[] args) {
        TWOSum ts=new TWOSum();
        int [] arr={3,2,3};
        System.out.println(Arrays.toString(ts.twoSum(arr, 6)));
    }
    public int[] twoSum(int[] nums, int target) {
        int[] r=new int[2];
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==target){
                    r[0]=i;
                    r[1]=j;
                }
                sum=sum-nums[j];
            }
        }
        return r;
    }

//    public String twoSumOptamised(int[] nums, int target) {
//        int[] r=new int[2];
//        int sum=0;
//        HashSet<Integer> hs=new HashSet<>();
//        Hashtable<Integer,Integer>
//        for(int i=0;i<nums.length;i++){
//            hs.add(nums[i]);
//        }
//
//
//        return hs.toString();
//    }

}
