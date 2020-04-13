package codewars;

import java.util.ArrayList;
import java.util.List;

public class Cd {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(73);
        ls.add(61);
        ls.add(34);
        System.out.println(gradingStudents(ls));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int x = grades.get(i);
            if (x % 5 >=3&&x>38) {
                ls.add(grades.get(i) + 5 -  x % 5);
            } else {
                ls.add(grades.get(i));
            }
        }
        return ls;
    }
}