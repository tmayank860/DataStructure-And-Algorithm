package stackqueue.problems;

import java.util.Scanner;
import java.util.Stack;

public class PrateekAndCoding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder b = new StringBuilder();
        try {
            int n = sc.nextInt();

            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 2) {
                    st.push(sc.nextInt());
                } else {
                    b.append(st.pop() + "\n");
                }
            }
            System.out.println(b);
        }catch (Exception e){

        }
    }

}
