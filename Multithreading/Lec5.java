package Multithreading;

//isAlive() and join() method
class Printing implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("important note ");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println("problem occured");
        }
    }
}

public class Lec5 {
    public static void main(String[] args) throws Exception {
        System.out.println("main thread");
        Printing p = new Printing();
        Thread t = new Thread(p);
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive()); // a thread gets his life when the start() method is called
        t.join();
        System.out.println("main thread finished");
    }
}
