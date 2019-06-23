package recursion;

public class RecCallBF {
	public static void main(String[] args) {
		PD(5);
	}
	
	public static void PD(int n) {
		if(n==0) {
			return;
		}
		if(n%2!=0) {
			System.out.println(n);
		}
		
		PD(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
		
	}
}
