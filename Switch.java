public class Switch {
    public static void main(String[] args) {
        int num = 40;
        switch (num) {
            case 40:
                System.out.println("40");
            case 200:
                System.out.println("200");
            case 400:
                System.out.println("400");
        }

        // in the above ex all expressions will be executes cuz 1 statement matches with
        // it

        // break statement
        switch (num) {
            case 40:
                System.out.println("100");
                break;
            case 200:
                System.out.println("200");
                break;
            case 400:
                System.out.println("40");
                break;
        }

        // using default
        switch (num) {
            case 40:
                System.out.println("100");
                break;
            case 200:
                System.out.println("200");
                break;
            case 400:
                System.out.println("40");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}
