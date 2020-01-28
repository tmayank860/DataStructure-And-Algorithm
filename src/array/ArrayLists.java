package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<String> ls=new ArrayList();
        ls.add("Mick");
        ls.add("KJK");
        ls.add("fknfk");
        System.out.println(ls.get(1));
        ls.add("fnk");
        ls.remove(1);
        for (String s : ls){
            System.out.println(s);

        }
        System.out.println(ls.size());

        Object[] array=ls.toArray();
        for (Object s:array){
            System.out.print(s+" ");
        }
    }
}
