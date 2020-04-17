package stack;

public class StackUsingArraysClient {
    public static void main(String[] args) throws Exception {
        StackUsingArrays st=new StackUsingArrays(5);
        st.push(5);
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        st.display();

    }
}
