public class OOPS {
    int num ;  //instance variable  
    String name;//instance variable
        public static void main(String[] args) {
        //declare the variable 
        //create the object
        int a = 10 ; //primitive 
        OOPS obj = new OOPS();  //refrence
        OOPS obj2 = new OOPS();  //refrence

        obj2.name="arun";
        System.out.println(a);
        System.out.println(obj.name);
        System.out.println(obj2.name);

    }
}
