package recursion;

public class PatternRec {
public static void main(String[] args) {
	ptrn(50, 1, 1);
}
public static void ptrn(int n,int row,int col) {
	if(row>n) {
		return;
	}
	if(col>row) {
		System.out.println();
		ptrn(n,row+1,1);
		return;
	}
	System.out.print("*");
	ptrn(n,row,col+1);
}
}
