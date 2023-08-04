// two types of strings : mutable strings and immutable strings

class Stringz{
    public static void main(String[] args) {
        String name = "arun";     //immutable 
        System.out.println(name);

        StringBuilder name1 = new StringBuilder("arun kumar");  //mutable
        System.out.println(name1);
        name1.append(" kurukshetra");   
        System.out.println(name1);  
    }
}