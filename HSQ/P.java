package HSQ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.HashMap;
import java.util.HashSet;

public class P {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Vector<Integer> v = new Vector<>();
        LinkedList<String> ll = new LinkedList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        al.add(10);
        al.add(11);
        System.out.println(al);
        v.add(20);
        v.add(21);
        System.out.println(v);
        ll.add("abc");
        ll.add("def");
        System.out.println(ll);
        hm.put("ab", 1);
        hm.put("cd", 2);
        System.out.println(hm);
        hs.add(100);
        hs.add(101);
        System.out.println(hs);

        System.out.println(al.remove(1));
        System.out.println(v.remove(1));
        System.out.println(ll.remove("abc"));
        System.out.println(hm.remove("ab"));
        System.out.println(hs.remove(100));

    }
}
