 class Promotion {
    // public void Show(int b ){
    //     System.out.println("int: " + b);
    // }
    public void Show(long b ){
        System.out.println("long: " + b);
    }
    public void Show(double b ){
        System.out.println("double: " + b);
    }
    public void Show(byte b ){
        System.out.println("byte: " + b);
    }
    public void Show(short b ){
        System.out.println("short: " + b);
    }

}

public class PromotionOverloading {
    public static void main(String[] args) {
        Promotion show = new Promotion();
        show.Show(7);
    }
    
}
