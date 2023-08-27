package Encapsulation;

class Demo2 {
    static int a;
    static int b;

    int i;
    int j;

    // Static initialization block
    static {
        System.out.println("control in static block ");
        a = 90;
        b = 91;

    }

    {
        System.out.println("non static block");
        i = 20;
        j = 21;
    }

    static void disp() {
        System.out.println("value of static var a :" + a);
        System.out.println("value of static var b :" + b);
    }

    void disp2() {
        System.out.println("value of non static i is : " + i);
        System.out.println("value of non static j is : " + j);
    }

    public class StaticMem {
        public static void main(String[] args) {
            Demo2 obj = new Demo2();
            obj.disp2();

            // for calling static method there is no need for object of the class
            Demo2.disp();

        }
    }
}
