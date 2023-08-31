package Inheritance;

import java.util.Scanner;

class Employee {
    int salary;
    String name;

    // this constructor will be called by manager class because there is a default
    // constructor when creating the object of a class nd that constructor hava a
    // super() method at his first line that will call the parent class constructor

    Employee() {
        System.out.println("this is parent class constructor");
    }

    Scanner scan = new Scanner(System.in);
    {
        System.out.println("Enter your salary :");
        salary = scan.nextInt();

        System.out.println("Enter your name :");
        name = scan.next();
    }
}

class Manaeger extends Employee {
    String department;
    Scanner sc = new Scanner(System.in);

    {
        System.out.println("Enter your department ");
        department = sc.next();
    }
}

public class Lec1 {
    public static void main(String[] args) {
        Manaeger obj = new Manaeger();
        System.out.println("your department is : " + obj.department);
        System.out.println("your name is : " + obj.name);
        System.out.println("your salary is : " + obj.salary);
    }
}
