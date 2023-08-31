package Inheritance;

// types of inheritance 
// single level  ; multi level ; hierarchial ; multiple inheritance (not allowed in jave )

// Types of methods in inheritance 
// 1. inherited  2. overridden  3. specialized 

class Aeroplane {
    void takeoff() {
        System.out.println("taking off");
    }

    public void fly() {
        System.out.println("aeroplane is flying");
    }

}

class Cargoplane extends Aeroplane {

    // overridden method and with increased visibility

    public void takeoff() {
        System.out.println("cargoplane is taking off");
    }

    // specialized method
    public void show() {
        System.out.println("cargoplane carry goods ");
    }
}

class PassengerPlane extends Aeroplane {
    // specialized method
    public void disp() {
        System.out.println("specialized methodS");
    }
}

public class Lec2 {
    public static void main(String[] args) {
        Cargoplane c = new Cargoplane();
        c.fly();
        c.takeoff();
        c.show();

        PassengerPlane pp = new PassengerPlane();
        pp.fly();
        pp.takeoff();
        pp.disp();

    }
}
