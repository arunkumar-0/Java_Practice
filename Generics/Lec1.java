package Generics;

import java.util.*;

class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    void disp() {
        System.out.println("The type of data is : " + obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }
}

// ensure type safety in collection
public class Lec1 {
    public static void main(String[] args) {
        Gen<Integer> gn = new Gen<Integer>(10);
        gn.disp();
        System.out.println(gn.getObj());

        ArrayList<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        Collection<String> list3 = new ArrayList<String>();
        Collection<Gen> list4 = new ArrayList<Gen>();
    }
}
