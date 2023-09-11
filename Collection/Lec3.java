package Collection;

import java.util.*;
//Hashset and Linked Hashset 

public class Lec3 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(23);
        hs.add(893);
        hs.add(1);
        System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(23);
        lhs.add(13);
        lhs.add(78);
        lhs.add(9);
        lhs.add(71);
        System.out.println(lhs);

    }
}
