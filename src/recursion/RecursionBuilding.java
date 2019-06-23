package recursion;

public class RecursionBuilding {
	public static void main(String[] args) {
		RB(5);
	}
	
	public static void RB(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		RB(n-1);
	}

}
