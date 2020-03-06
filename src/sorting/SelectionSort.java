package sorting;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int minvalue=arr[0];
        int minindex=0;
        for (int i=minindex+1;i<n;i++){
            if(arr[i]<minvalue){
                minvalue=arr[i];
                minindex=i;
            }
        }
        for (int i=0;i<n;i++){
            Swap(arr,i,minindex);
        }

        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    private static void Swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
