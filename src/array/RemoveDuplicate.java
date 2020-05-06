package array;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double D;
        int root1,root2;
        D=(b*b - 4*a*c);
        double v1 = (-b + sqrt(D)) / 2 * a;
        if(D>0){
            System.out.println("Real and Distinct");
            root1= (int) v1;
            root2= (int) ((-b - sqrt(D)) / 2 * a);
            System.out.println(root1+" "+root2);
        }
        else if(D==0){
            System.out.println("Real and equal");
            root1= (int) ((-b + sqrt(D)) / 2 * a);
            root2= (int) ((-b - sqrt(D)) / 2 * a);
            System.out.println(root1+" "+root2);
        }
        else {
            System.out.println("Imaginary");

        }


    }
}
