package array.problems;


//CodeWars - Write a function that takes in a string of one or more words, and returns the same string,
//        but with all five or more letter words reversed (Just like the name of this Kata).
//        Strings passed in will consist of only letters and spaces.
//        Spaces will be included only when more than one word is present.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SpinningMyWords {
    public static void main(String[] args) throws IOException {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String s = b.readLine();
        String[] str= s.split(" ");
        for (int i=0;i<str.length;i++){
            if(str[i].length()>=5){
                str[i]=reverse(str[i]);
            }
        }
        String string="";
        for (int i=0;i<str.length;i++){
            string=string+str[i]+" ";
        }
        String st=Arrays.toString(str);
        System.out.println(string);


    }
    static String reverse(String s)
    {
        String rev="";
        for(int j=s.length();j>0;--j)
        {
            rev=rev+(s.charAt(j-1));
        }
        return rev;
    }

}

