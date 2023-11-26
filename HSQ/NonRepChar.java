package HSQ;

import java.util.HashMap;
import java.util.Scanner;

// find the first non repeating character in the string
public class NonRepChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        int result = -1;
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println("1st non repeating char is " + i);
                result = 1;
                break;
            }
        }
        if (result == -1) {
            System.out.println("all r repeating char");
        }
        sc.close();
    }
}
