package Interface_Lambda;

//handeling vs ducking the exception
// ducking the exception means we do not resolve the exception where t has occured instead we throws it the mehtod or class which has called it 

//it is mainly used to handle multiple exceptions at one place when we have multiple methods    
class A1 {

    public void show() throws Exception {
        show1();
    }

    public void show1() throws Exception {
        int num1 = 5;
        int num2 = 0;
        int result = num1 / num2;
        System.out.println(result);
    }
}

public class Lec5 {
    public static void main(String[] args) {
        A1 a = new A1();
        try {
            a.show();
        } catch (Exception e) {
            System.out.println("error" + e);
            System.out.println("exception ducked");
        }
    }
}
