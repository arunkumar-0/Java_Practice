class Operators {

public static void main(String[] args) {
    // int num1 = 34 ; 
    // int num2 = 12 ; 
    // System.out.println(num1 + num2);

    int a = 5 ; 
    int b = a++ + ++a + ++a + a++ + --a + a-- ; 
    System.out.println(b);
    System.out.println(a);
    
}
}