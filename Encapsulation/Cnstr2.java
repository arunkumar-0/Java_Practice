package Encapsulation;

class Student1 {
    private String name;
    private int age;

    public Student1() {
        this("arun", 90);
        System.out.println("0 parameter constructor");
        name = "ARUN";
        age = 19;
    }

    public Student1(String name) {
        this.name = name;
        age = 20;
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Cnstr2 {
    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.show();

        Student1 obj1 = new Student1("arun");
        obj1.show();

        Student1 obj2 = new Student1("arun", 18);
        obj2.show();
    }

}
