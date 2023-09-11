package Collection;
//Maps - we store data in the form of key-value pair 

import java.util.HashMap;
import java.util.Hashtable;

//map helps us to achieve uniqueness as keys in maps are unique 
//Hashmap does not retain the order of insertion but linked hashMap do 
public class Lec5 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(7, "arun");
        hm.put(3, "rohit");
        hm.put(12, "punit");
        hm.put(23, "sagar");
        hm.put(null, "vansh");

        System.out.println(hm);

        Hashtable ht = new Hashtable();
        ht.put("arun", "arun");
        ht.put("rohit", "rohit");
        ht.put("dd", "dd");
        ht.put("yash", "yash");
        System.out.println(ht);
    }
}
