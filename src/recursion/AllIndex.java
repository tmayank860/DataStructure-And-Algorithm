package recursion;

public class AllIndex {
	public static void main(String[] args) {

//		int [] arr= {8,5,8,3,6,8,6};
//		int[] ans=dataCount(arr,8,0,0);
//		for(int i=0;i<ans.length;i++)
//			System.out.println(ans[i]);
		String s = "";
//		System.out.println(rec(12345, s));
		System.out.println(sameChar("hello",6,s));

	}

	public static int[] dataCount(int[] arr, int item, int index, int count) {
		if (index == arr.length) {
			int carray[] = new int[count];
			return carray;
		}
		int indeces[] = null;
		if (arr[index] == item) {
			indeces = dataCount(arr, item, index + 1, count + 1);
		} else {
			indeces = dataCount(arr, item, index + 1, count);
		}
		if (arr[index] == item) {
			indeces[count] = index;
		}
		return indeces;
	}

	static String rec(int n, String str) {
//		String str="";
		if (n < 10) {
			return Integer.toString(n) + str;
		} else {

			str = Integer.toString(n % 10) + str;
			return rec(n / 10, str);

		}
	}
	
//	Same character in string
	static String sameChar(String s,int l,String str) {
//		for(int i=0;i<s.length()-1;i++) {
//			if(s.charAt(i)==s.charAt(i+1)) {
//				s=s.substring(0,i+1)+"*"+s.substring(i+1,s.length());
//			}
//		}
		
		if(l == 0) {
			return str; 
		}
		else {
			if((l>=2)&&(s.charAt(l-1)==s.charAt(l-2))) {
					str = s.charAt(l-1) +"*"+ s.charAt(l-2);
				}
					str = s.charAt(l-1) + str;
					return sameChar(s,l-1,str);
			}
	}

}
