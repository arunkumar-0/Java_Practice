package Generics;

import java.util.ArrayList;
import java.util.Collections;

//collections class - it is different from collection interface it has several inbuilt methods
public class Lec2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(23);
        al.add(31);
        al.add(59);
        al.add(6);
        al.add(56);

        Collections.sort(al);

        System.out.println(al);
        int index = Collections.binarySearch(al, 56);
        System.out.println("index of 56 is :" + index);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("amit");
        al2.add("sachin");
        al2.add("rohit");

        Collections.sort(al2);
        System.out.println(al2);
    }
}
