package recursion.problems;

public class DuplicateCharacterFormatting {
    public static void main(String[] args) {
        System.out.print(charFormatting("Helloolmm"));

    }
    public static String charFormatting(String s){
        String str="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                str=str+s.charAt(i+1)+"*";
            }else {
                str=str+s.charAt(i)+"";
            }
        }
        return str+s.charAt(s.length()-1);
    }
}
