package Inheritance;

// How constructor works in inheritance 
class Demo1 {
    int a, b;

    Demo1() {
        System.out.println("default constructor of demo1 ");
    }

    Demo1(int x, int y) {
        System.out.println("paramertized constructor of demo1");
        a = x;
        b = y;
        System.out.println(x + " " + y);
    }
}

class Demo2 extends Demo1 {
    int i, j;

    Demo2() {
        super(10, 20);

        System.out.println("default constructor of demo2 class ");
    }

    Demo2(int x, int y) {
        System.out.println("parameterized constructor of demo2 class ");
        i = x;
        j = y;
        System.out.println(x + " " + y);
    }
}

public class Lec3 {
    public static void main(String[] args) {
        Demo2 dd = new Demo2();

    }
}
