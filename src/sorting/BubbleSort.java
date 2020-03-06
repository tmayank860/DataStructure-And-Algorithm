package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[j])) {
                    Swap(arr, i, j);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void Swap(String[] arr, int a, int b) {
        String temp = "";
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
