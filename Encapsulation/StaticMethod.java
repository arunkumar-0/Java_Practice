package Encapsulation;

class Beta {
    // for static method we need not to make object they can be directly called by
    // class name
    static void display1() {
        System.out.println("Static method");
    }

    void display2() {
        System.out.println("non static method");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Beta.display1();

        Beta obj = new Beta();
        obj.display2();
        obj.display1();
    }
}
