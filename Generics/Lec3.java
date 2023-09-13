package Generics;

import java.util.*;

//comparable vs comparator
class Student implements Comparable<Student> {
    int marks;
    int age;
    String name;

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Student(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return " " + marks + " - " + age + " - " + name;
    }

    public int compareTo(Student a) {
        if (this.age > a.age)
            return 1;
        else
            return -1;
    }
}

public class Lec3 {
    public static void main(String[] args) {
        Student st = new Student(89, 17, "Shivam");
        Student st1 = new Student(99, 19, "Arun");
        Student st2 = new Student(79, 21, "Sachin");

        List<Student> list = new ArrayList<>();
        list.add(st);
        list.add(st1);
        list.add(st2);

        // Comparator<Student> com = (Student a, Student b) -> {
        // if (a.marks > b.marks)
        // return 1;
        // else
        // return -1;
        // };
        // Collections.sort(list, com);
        Collections.sort(list);
        System.out.println(list);
    }
}
