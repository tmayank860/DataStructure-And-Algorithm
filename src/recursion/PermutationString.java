package recursion;

import java.util.ArrayList;

public class PermutationString {
    private char ch;

    public static void main(String[] args) {
        System.out.print(getPermutation("abc"));
    }


    public static ArrayList<String> getPermutation(String str) {
        if (str.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            
            return br;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);       //ros=Rest of the String

        ArrayList<String> recursiveResult = getPermutation(ros);
        ArrayList<String> result = new ArrayList<>();
        for (String rrs : recursiveResult) {
            for (int i = 0; i <= rrs.length(); i++) {
                String val = rrs.substring(0, i) + ch + rrs.substring(i);
                result.add(val);
            }
        }
        return result;
    }
}
