package recursion;

public class Fibonacci {
	public static void main(String[] args) {

		System.out.println(fib(10));
		for(int i=0;i<10;i++){
			System.out.print(fib(i)+" ");
		}
	}

	public static int fib(int n) {
		if (n <=1) {
			return n;
		} else { 
			return fib(n - 1) + fib(n - 2);
		}

	}
}
