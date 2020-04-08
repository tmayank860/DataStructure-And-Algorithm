package recursion;

import array.ArrayLists;

import java.util.ArrayList;

public class SubSequenceString {
    public static void main(String[] args) {

        System.out.println(getSubSequenceWithASCII("abc"));

    }
    public static ArrayList<String> getSubSequence(String str){

        if(str.length()==0){
            ArrayList<String> baseResult=new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char cc=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> myResult=new ArrayList<>();
        ArrayList<String> recResult=getSubSequence(ros);
        for (int i=0;i<recResult.size();i++){
            myResult.add(recResult.get(i));
            myResult.add(cc+recResult.get(i));
        }
        return myResult;
    }

    public static ArrayList<String> getSubSequenceWithASCII(String str){
        if(str.length()==0){
            ArrayList<String> baseResult=new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char cc=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> myResult=new ArrayList<>();
        ArrayList<String> recResult=getSubSequence(ros);
        for (int i=0;i<recResult.size();i++){
            myResult.add(recResult.get(i));
            myResult.add(cc+recResult.get(i));
        }
        return myResult;

    }
}
