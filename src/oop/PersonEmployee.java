package oop;

public class PersonEmployee {
    public static void main(String[] args) {
        Person ps = new Person();
        System.out.println(ps.getName());
        System.out.println(ps.getAge());
        Person p2 = new Person();
        p2.setName("N");
        p2.setAge(34);
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
    }
}
