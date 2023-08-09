package Encapsulation;
class Student {
    private String name;
    private int age ;
    public void setData(String b){
        name = b ; 
        
    }
    public void setData1(int a ){
         age = a; 
        
    }
    public void show(){
            System.out.println(name + "  " + age);
        }
}
public class PrivateMem {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setData("ARUN");
        obj1.setData("ROHAN");
        
        obj.show();
        obj1.show();

        
    }
}
