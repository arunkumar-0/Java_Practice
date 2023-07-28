public class Ternary {
    public static void main(String[] args) {
        int a = 90 ; 
        int b = 45 ; 
        int res = (a< b) ? a : b ;
        System.out.println(res);

        //nested terniary operator 
        int c = 30 ; 
        int num = (a< b) ? (a< c ? a : c) : b ; 
        System.out.println(num);

        //nested 
        int num2 = (a< b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println(num2);
    }
}
