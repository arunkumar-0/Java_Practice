package Interface_Lambda;

//throw keyword and custom exception
//throw kryword is used to create an exception where we want that our code should behave as exception
//we can create custom exception by just inheriting the properties of exception class 
class MyException extends Exception {
    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
        // super method is called because we want parent class constructor method to
        // call passing a string we can not pass it directly

    }

}

public class Lec6 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;
        try {
            if (num2 < 0) {
                Exception e = new MyException("-ve number");
                throw e;
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            // during calling e it will call our custom message which is -ve number
            System.out.println("exception occured " + e);
        }

    }
}
