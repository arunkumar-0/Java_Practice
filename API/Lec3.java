package API;

import java.util.*;
import java.util.stream.*;

public class Lec3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(20, 78, 2, 8, 1, 3);

        // for each method
        // list.forEach(n -> System.out.println(n));

        Stream<Integer> streamData = list.stream();

        Stream<Integer> filtered = streamData.filter(n -> n % 2 == 0);
        Stream<Integer> sorted = filtered.sorted();

        Stream<Integer> map = sorted.map(n -> n * 2);

        // or we can do method chaining

        // Stream<Integer> streamData = list.stream().filter(n->n%2 ==0 ).sorted();

        map.forEach(n -> System.out.println(n));

    }
}
