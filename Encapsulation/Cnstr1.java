package Encapsulation;

class Demo1 {
    private int a;
    private int b;

    public Demo1() {
        System.out.println("0 parameter constructor");
    }

    public Demo1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void show() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Cnstr1 {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.show();

        Demo1 obj1 = new Demo1(10, 15);
        obj1.show();
    }
}
