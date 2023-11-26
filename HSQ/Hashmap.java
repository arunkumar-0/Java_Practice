package HSQ;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "yash");
        hm.put(2, "naman");
        hm.put(4, "ritik");
        hm.put(6, "shivam");

        hm.remove(4);
        System.out.println(hm);

        System.out.println(hm.containsKey(2));
        System.out.println(hm.containsValue("shm"));
        System.out.println(hm.get(2));

        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
