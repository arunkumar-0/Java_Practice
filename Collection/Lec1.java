package Collection;

import java.util.*;

class Lec1 {
    public static void main(String[] args) {
        // Array List
        ArrayList al = new ArrayList();

        al.add(200);
        al.add("Arun Kumar");
        al.add(23.45);

        System.out.println(al);

        ArrayList al1 = new ArrayList();
        al1.add("abcd");
        al1.addAll(al);
        System.out.println(al1);

        al1.add(2, "3rd index");
        System.out.println(al1);

    }
}