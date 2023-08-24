package Encapsulation;
class Demo {
    private int a ; 
    private int b ; 
   public Demo ()
    {
        System.out.println("0 parameter constructor");
    }
   public Demo(int a , int b){
        this.a = a ; 
        this.b = b ; 
    }
    void show()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Cnstr1 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();

        Demo obj1 = new Demo(10 , 15);
        obj1.show();
    }
}
