// two strings can be compared by == (comapre refrence ) and equal()(compare the content of the string)

public class CompareStrings {
    public static void main (String[]args){
        String name = "ARUN KUMAR";
        String name1 = new String("ARUN KUMAR");
        String name2 = "ARUN KUMAR";

        // if(name == name1){
        //     System.out.println("both strings are equal ==");
        // }else if (name.equals(name1)){
        //     System.out.println("both are equal()");
        // }else{
        //     System.out.println("both strings are different");
        // }
        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name.equals(name1));
        System.out.println(name.equals(name2));

    }
}
