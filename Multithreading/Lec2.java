package Multithreading;

//creating custom thread 
class CustomThread extends Thread {
    public void run() {
        System.out.println("child thread");
    }
}

public class Lec2 {
    public static void main(String[] args) {
        CustomThread ct = new CustomThread();
        ct.start();
    }

}
