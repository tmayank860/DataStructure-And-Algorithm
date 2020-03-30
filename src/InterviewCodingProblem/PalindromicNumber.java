package InterviewCodingProblem;

import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long ans = palindromicSum(n);
        System.out.print(ans);
    }

    static boolean isPalindrome(String s)
    {
        if (s.contains("0")||Integer.parseInt(s)%9!=0){
            return false;
        }
        int left = 0, right = s.length() - 1;
        while (left <= right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    static long palindromicSum(int n)
    {

        int start = (int) Math.pow(10, n - 1);
        int end = (int) (Math.pow(10, n) - 1);
        long sum = 0;

        for (int i = start; i <= end; i++)
        {
            String s = String.valueOf(i);
            if (isPalindrome(s))
            {
                sum += i;
            }
        }

        return sum;
    }
}
