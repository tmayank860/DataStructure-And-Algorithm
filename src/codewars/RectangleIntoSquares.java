package codewars;

import java.util.ArrayList;
import java.util.List;

public class RectangleIntoSquares {
    public static void main(String[] args) {
        System.out.println(sqInRect(9,5));
        getXO("sdyhyy");

    }
    public static List<Integer> sqInRect(int lng, int wdth) {
        // your code
        if (lng==wdth){
            return null;
        }
        List<Integer> ls=new ArrayList<>();
         int r1=0,r2=0;
         if(lng>wdth){
             r1=wdth;
             ls.add(r1);
             r2=lng-r1;
             while(r2!=r1){
                 ls.add(r2);
                 r2=r1-r2;
             }
             while (r1-->0){
                 ls.add(r1);
             }

         }else{
             r1=lng;
             ls.add(r1);
             r2=wdth-r1;
             while(r2!=r1){
                 ls.add(r2);
                 r2=r1-r2;
             }
             while (r1-->1){
                 ls.add(1);
             }
         }
         return ls;
    }


    public static boolean getXO(String str) {
        int x = 0, o = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.toUpperCase().charAt(i) == 'O') o++;
            if(str.toUpperCase().charAt(i) == 'X') x++;
        }
        return x == o;
    }


}
