package stackqueue.problems;

import java.util.Scanner;
import java.util.Stack;

public class NextGreatestNumber {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             int[] arr=new int[n];
             for (int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
             }
            nextGreatest(arr,n);
        }catch (Exception e){

        }
    }
    public static void nextGreatest(int[] arr,int n){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        st.push(0);
        for (int i=0;i<n;i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        StringBuilder result=new StringBuilder();
        for (int i=0;i<ans.length;i++){
            result.append(ans[i]+" ");
        }
        System.out.println(result);
    }
}
