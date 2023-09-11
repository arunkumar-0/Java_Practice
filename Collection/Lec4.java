package Collection;

import java.util.*;
//iterator and list iterator
//iterator is universal for and collection while the list iterator is available only for lists array list and linked list 
//iterator can traverse only in forward direction and list iterator can traverse in both direction

public class Lec4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(12);
        al.add(90);
        al.add(6);
        al.add(76);
        al.add(44);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Integer in = (Integer) itr.next();
            System.out.println(in);

        }
        ListIterator litr = al.listIterator(al.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }

}
