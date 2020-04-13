package codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        System.out.println(splitResult("abcde"));
    }

    public static String[] splitResult(String s) {
        ArrayList<String> ar = new ArrayList<>();
        if (s.length() % 2 == 0) {
            int i = 0, j = 0;
            while (i < s.length()) {
                ar.add(s.substring(i, i + 2));
                i += 2;
            }
        } else {
            int i = 0, j = 0;
            while (i + 1 < s.length()) {
                ar.add(s.substring(i, i + 2));
                i += 2;

            }
            ar.add(s.substring(s.length() - 1) + "_");
        }

        String arr[] = new String[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            arr[i] = ar.get(i);
        }
        return arr;
    }

    public static String[] solution(String s) {
        //Write your code here
        if (s.length() % 2 == 1) s += "_";
        int n = s.length() / 2;


        String[] sub = new String[n];
        for (int i = 0; i < n; ++i)
            sub[i] = "" + s.charAt(i * 2) + s.charAt(1 + i * 2);

        return sub;
    }

    public static String[] solution2(String s) {
        s = (s.length() % 2 == 0) ? s : s + "_";
        return s.split("(?<=\\G.{2})");
    }

    static String[] solution3(String s) {
        return (s + (s.length() % 2 > 0 ? "_" : "")).split("(?<=\\G.{2})");
    }




    public static String[] solution4(String s) {
        String[] arr = s.split("(?<=\\G.{2})");

        if (s.length() % 2 == 1)
            arr[arr.length - 1] += "_";

        return arr;
    }



}
