package recursion.problems;

public class StringtoInteger {
    public static void main(String[] args) {

        System.out.print(integerValue("12345"));

    }
    public static int integerValue(String s){
        if (s.length()==1){
            return s.charAt(0)-'0';
        }

        double x=integerValue(s.substring(1));
        double y=s.charAt(0)-'0';
        y=y*Math.pow(10,s.length()-1)+x;
        return (int)(y);
    }
}
