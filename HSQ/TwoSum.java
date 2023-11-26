package HSQ;

import java.util.HashMap;
import java.util.Scanner;

//input - 2 , 7 , 11, 15 and target = 9 
//output  = [0,1] as the sum of arr[0] + arr[1] = target 
public class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        int result[] = new int[2];
        result[0] = -1;
        result[1] = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target && map.containsKey(0)) {
                result[0] = i;
                result[1] = map.get(0);
                break;
            } else if (map.containsKey(target - arr[i])) {
                if (map.get(target - arr[i]) > i) {
                    result[0] = i;
                    result[1] = (map.get(target - arr[i]));
                    break;
                }

            } else {

                System.out.println("target element does no found");
                break;
            }
        }

        System.out.println("two sum index values are : " + result[0] + " " + result[1]);
        sc.close();
    }
}
