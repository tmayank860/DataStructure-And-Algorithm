package InterviewCodingProblem;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

//            int t;
//            t = sc.nextInt();
//            while (t-- != 0) {
//                int n;
//                n = sc.nextInt();
                int[] arr = {7,10,4,3,20,15};
//                for (int i = 0; i < n; i++) {
//                    arr[i] = sc.nextInt();
//                }
//                int k = sc.nextInt();

                System.out.println(KthElement(arr,6,3));
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static int KthElement(int[] arr,int n,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }

        for(int i=k;i<n;i++){
            if(arr[i]<pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();


    }
}
