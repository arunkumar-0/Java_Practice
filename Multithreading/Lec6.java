package Multithreading;

//interrupt method in java 
class Example implements Runnable {
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Focus is important ");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("some exception occured");
            }
        }
    }
}

public class Lec6 {
    public static void main(String[] args) {
        Example e = new Example();
        Thread t = new Thread(e);
        t.start();
        t.interrupt();
    }
}
