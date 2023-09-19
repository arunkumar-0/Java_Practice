package API;

//switch case with enum
enum Res {
    PASS, FAIL, NR;
}

public class Enum1 {
    public static void main(String[] args) {
        Res r = Res.PASS;
        switch (r) {
            case PASS:
                System.out.println("passed");
                break;
            case FAIL:
                System.out.println("failed");
                break;
            case NR:
                System.out.println("no result");
                break;
        }
    }
}
