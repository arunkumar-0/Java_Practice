package Multithreading;

//There is a in built class in java for threads - thread class 
public class Lec1 {
    public static void main(String[] args) {
        System.out.println("Main Thread ");
        String th = Thread.currentThread().getName();
        System.out.println(th);
        System.out.println(Thread.currentThread().getPriority());

        // changing the name and priority of main thread

        Thread t = Thread.currentThread();
        t.setName("arun");
        t.setPriority(1);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
}
