package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=1;i<n;i++){
            int key=arr[i];
            int j;
            for (j=i;j>0&&arr[j-1]>key;j--){
                arr[j]=arr[j-1];
            }
            arr[j]=key;
        }

        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

}