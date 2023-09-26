package Multithreading;

import java.util.*;

//multiple task with single run() method
class NewThread extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("calc")) {
            calc();
        } else {
            imp();
        }
    }

    public void calc() {
        System.out.println("Enter Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println("entered number is :" + num);

    }

    public void imp() {
        System.out.println("important message");
    }
}

public class Lec4 {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        NewThread nt1 = new NewThread();

        nt.setName("calc");
        nt1.setName("Important");

        nt.start();
        nt1.start();
    }
}
