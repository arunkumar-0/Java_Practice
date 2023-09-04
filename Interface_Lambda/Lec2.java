package Interface_Lambda;

//Innner class - A$B (B class in inside class A )
// three types of inner class - static  member and anonymous inner class 
class A {
    public void show() {
        System.out.println("in show");
    }

    class B {
        public void disp() {
            System.out.println("in display ");
        }

    }
}

public class Lec2 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.disp();
    }
}
