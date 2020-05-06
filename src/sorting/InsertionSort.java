package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
        int n=5;
        int[] arr={2,4,6,8,3};

        for (int i=1;i<n;i++){
            int key=arr[i];
            int j;
            boolean check=false;
            for (j=i;j>0&&arr[j-1]>key;j--){
                check = true;
                arr[j]=arr[j-1];
                print(arr,n);
            }
            arr[j]=key;
            if (check) {
                print(arr, n);
            }
        }


    }
    public static void print(int[] arr,int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
