package Multithreading;

import java.util.*;

//creating thread by implementing the runnable interface
class calc implements Runnable {
    public void run() {
        System.out.println("calculation started");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1 = sc.nextInt();
        sc.close();

        System.out.println("enter 2nd number ");
        int num2 = sc.nextInt();

        int res = num1 + num2;
        System.out.println(res);
        System.out.println("calculation ended");
    }
}

class msg implements Runnable {
    public void run() {
        System.out.println("2nd thread started  ");
    }
}

public class Lec3 {
    public static void main(String[] args) {
        calc c = new calc();
        msg m = new msg();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(m);
        t1.start();
        t2.start();
    }
}
