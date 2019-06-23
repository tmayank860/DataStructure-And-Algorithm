package recursion;

public class Power {
public static void main(String[] args) {
	System.out.println(pow(25,2));
}
public static int pow(int x,int n) {
//	int power=1;
//	while(x--!=0) {
//		power=n*power;
//	}
	if(n==0) {
		return 1;
	}
	int power=x*pow(x,n-1);
	return power;
}
}
