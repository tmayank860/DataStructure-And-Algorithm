package cb10dayscode;

import java.util.Scanner;

public class Trailingzero {
    public static void main (String args[]) {


        try{
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a=fact(n);
            System.out.println(a);
        }catch(Exception e){


        }
    }
    public static int fact(int n){
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }
}

