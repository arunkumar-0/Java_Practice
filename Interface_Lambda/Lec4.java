package Interface_Lambda;
//exception handeling - try catch block 

//exceptions are runtime error that are not because of syntax or logical mistake  

public class Lec4 {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 0;
        int result = 0;
        int values[] = { 10, 8, 2, 75 };

        try {
            result = num1 / num2;
            System.out.println(values[7]);
        } catch (ArithmeticException obj) {
            System.out.println("exception occured" + obj);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array no. inaccessible");
        }

        System.out.println(result);
        System.out.println("try catch block executed");
    }

}
