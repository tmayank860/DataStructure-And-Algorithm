package recursion;

public class NumberList {
    public static void main(String[] args) {
    System.out.println("Hello");
    PI(5);
    }
    public static void PD(int n){
        if (n==0){
            return;
        }

        System.out.println(n);
        PD(n-1);
    }
    public static void PI(int n){
        if (n==0){
            return;
        }

        PI(n-1);
        System.out.println(n);
    }

}
