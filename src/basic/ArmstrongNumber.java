package basic;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int len=Integer.toString(n).length();
        System.out.println(isArmstron(371,3));

    }
    public static boolean isArmstron(int n,int len){
        int x=n;
        int sum=0;
        while (n>0){
            int temp=n%10;
            sum= (int) (sum+Math.pow(temp,len));
            n=n/10;
        }
        if (sum==x){
            return true;
        }else {
            return false;
        }
    }
}
