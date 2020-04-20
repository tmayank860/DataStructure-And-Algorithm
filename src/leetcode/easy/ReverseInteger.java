package leetcode.easy;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger rv=new ReverseInteger();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(rv.reverse(2147483647));
    }
    public int reverse(int x) {
        int top_limit=Integer.MAX_VALUE/10;
        int bottom_lomit=Integer.MIN_VALUE/10;
        int rev=0;
        if (x>0){
            while (x!=0){
                if(rev > top_limit || rev< bottom_lomit) {
                    return 0;
                }
                rev=rev*10+x%10;
                x=x/10;
            }
        }else {
            x=-1*x;
            while (x!=0){
                if(rev > top_limit || rev< bottom_lomit) {
                    return 0;
                }
                rev=rev*10+x%10;
                x=x/10;
            }
            rev=-1*rev;
        }

            return (int) rev;

    }
}
