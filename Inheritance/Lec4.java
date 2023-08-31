package Inheritance;
// Polymorphism - when one thing exists in more than one form 

// there are two types of polymorphism - static and dynamic
// static - compile time polymorphism ex : overloading 
// dynamic - runtime polymorphism ex : overriding 
class Animal1 {
    public void eat() {
        System.out.println("animals used to eat ");
    }

    public void sleep() {
        System.out.println("animals sleep ");
    }
}

class Tiger extends Animal1 {

    public void eat() {
        System.out.println("tiger eat flesh only");
    }

    public void sleep() {
        System.out.println("tier sleep");
    }
}

class Monkey extends Animal1 {
    public void eat() {
        System.out.println("monkey eats only fruits ");
    }

    public void sleep() {
        System.out.println("monkey sleep");
    }

}

class Donkey extends Animal1 {
    public void eat() {
        System.out.println("donkey eats grass ");
    }

    public void sleep() {
        System.out.println("donkey sleeps");
    }
}

class Poly {
    public void poly1(Animal1 an) {
        an.eat();
        an.sleep();
    }
}

public class Lec4 {
    public static void main(String[] args) {
        Tiger tg = new Tiger();
        Monkey mn = new Monkey();
        Donkey dn = new Donkey();

        // parent class refrence has ability to hold child class object address
        // runtime polymorphism
        // paaing the referance of the tg object in the parent class
        Poly pn = new Poly();
        pn.poly1(dn);
        pn.poly1(tg);
        pn.poly1(mn);

    }

}
