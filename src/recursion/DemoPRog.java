package recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoPRog {
    public static void main(String[] args) {
        int arr[]={2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

//        System.out.println(rotateArr(arr,10,3));
//        System.out.println(rotateArrMethod(arr,10,3));
//        rotateArrMethod(arr,10,3);
//        System.out.println(1%5);
        leftRotate(arr, 3, 10);
        printArray(arr, 10);
    }
    static String rotateArr(int arr[],int n,int r){
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=arr[(i+r)%n];
        }
        return Arrays.toString(ar);
    }
    static void rotateArrMethod(int arr[],int n,int r){
        int ar[]=new int[r];
        for(int i=0;i<r;i++){
            ar[i]=arr[i];
        }
        for(int i=0;i<n-r;i++){
            arr[i]=arr[i+r];
        }
      for (int i=0;i<n-r;i++){
          System.out.print(arr[i]+" ");
      }
      for (int i=0;i<r;i++){
          System.out.print(ar[i]+" ");
      }
//       return Arrays.toString(arr);
    }


    static void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

   static void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    /* utility function to print an array */
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
