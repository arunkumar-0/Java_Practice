public class ConcatString {
    public static void main(String[] args) {
        String s1 = "PWjava ";
        String s2 = s1.concat("skill ");
        String s3 = new String("PWjava ");
        s3 = s3.concat("skill ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String str = "arun " + 99 + 87;
        System.out.println(str);
    }
}
