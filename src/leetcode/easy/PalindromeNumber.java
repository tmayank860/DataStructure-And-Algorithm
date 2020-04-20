package leetcode.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(-121));
        System.out.println(p.isPalindrome2(215));
    }

    //Method 1
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (x == rev) {
            return true;
        } else {
            return false;
        }
    }

    //Method 2
    public boolean isPalindrome2(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
}
