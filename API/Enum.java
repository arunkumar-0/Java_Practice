package API;

enum Week {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class Enum {
    public static void main(String[] args) {
        Week w = Week.MON;
        System.out.println(w);
        int index = Week.FRI.ordinal();
        System.out.println(index);

        Week wr[] = Week.values();
        for (Week w1 : wr) {
            System.out.println(w1);

        }
        ;
    }

}