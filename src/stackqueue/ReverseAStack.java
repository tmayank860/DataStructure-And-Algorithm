package stackqueue;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        Stack s=reverseStack(st);
        while (!s.isEmpty()) {
            System.out.print(s.pop()+"=>");
        }
        System.out.println("END");
    }

    public static Stack<Integer> reverseStack(Stack<Integer> st){
        Stack<Integer> helperStack=new Stack<>();
        while (!st.empty()){
            helperStack.push(st.pop());
        }
        return helperStack;
    }
}
