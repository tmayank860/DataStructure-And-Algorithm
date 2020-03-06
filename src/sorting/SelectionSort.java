package sorting;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] intArray=new int[n];
        for (int i=0;i<n;i++){
            intArray[i]=sc.nextInt();
        }
        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex --) {

            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++) {

                if(intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            Swap(intArray, largest, lastUnsortedIndex);
        }

        for (int i=0;i<n;i++){
            System.out.println(intArray[i]);
        }

    }

    private static void Swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
