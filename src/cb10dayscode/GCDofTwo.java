package cb10dayscode;

import java.util.Scanner;

public class GCDofTwo {
    public static void main(String args[]) {
        try{
//            Scanner sc=new Scanner(System.in);
//            int n1=sc.nextInt();
//            int n2=sc.nextInt();
            int a=gcd(16,24);
            System.out.println(a);
        }catch(Exception e){


        }

    }

    public static int gcd(int n1,int n2){

        if (n2 == 0)
            return n1;
        return gcd(n2, n1 % n2);
    }
}
