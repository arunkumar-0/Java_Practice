package Encapsulation;

import java.util.Scanner;

class Loan {
    int pa; // principle amount
    float td; // time duration
    static float ri; // rate interest & static cuz for everyone the ri will remain same
    float si; // simple interest

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the amount: ");
        pa = sc.nextInt();

        System.out.println("Please Enter the time duration: ");
        td = sc.nextFloat();

    }

    static {
        ri = 8f;
    }

    void compute() {
        si = (pa * td * ri) / 100f;
    }

    void display() {
        System.out.println("your simple interest is :" + si);
    }

}

public class LoanCalc {
    public static void main(String[] args) {
        Loan obj = new Loan();
        Loan obj1 = new Loan();

        obj.input();
        obj.compute();
        obj.display();

        obj1.input();
        obj1.compute();
        obj1.display();

    }
}
