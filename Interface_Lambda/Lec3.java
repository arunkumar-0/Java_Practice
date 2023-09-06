package Interface_Lambda;

//Anonymous Inner class 
interface Car {
    void display();
}

// lamnda expression - it is used only in fuctional interface
// it helps in reducing the code
interface Truck {
    void seat();
}

public class Lec3 {
    public static void main(String[] args) {
        Car c = new Car() {
            public void display() {
                System.out.println("driving ...");
            }
        };
        c.display();
        // 0 parameter lambda expression
        Truck t = () -> System.out.println("truck has 2 seats");
        t.seat();
    }
}
