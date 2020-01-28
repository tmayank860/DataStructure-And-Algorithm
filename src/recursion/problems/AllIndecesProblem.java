package recursion.problems;

import java.util.Arrays;

public class AllIndecesProblem {
    public static void main(String[] args) {
        int a[]={3,2,1,2,3};
        String s="";
        System.out.print((allIndecesProblem(0,5,a,3,s)));

    }
    public static String allIndecesProblem(int i,int n,int[] a,int m ,String s){

        if(i==n){
            return s;
        }
        if(a[i]==m){
            s=s+" "+Integer.toString(i);
        }
        return allIndecesProblem(i+1,n,a,m,s);

    }
}
