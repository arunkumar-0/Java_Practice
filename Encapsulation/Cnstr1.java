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

        // System.out.println(obj);
        Demo1 obj1 = new Demo1(10, 15);
        obj1.show();
        // if we print directly the obj1 then it will print the referance of that object
        // so , to use it directly there is a toString method inside the object class
        // which is parent class of every class we need to overrride that class in our
        // class
        // System.out.println(obj1);
    }
}
