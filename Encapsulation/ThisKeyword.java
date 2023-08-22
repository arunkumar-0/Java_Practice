package Encapsulation;



class Demo {
    private int age ;
    private String name ;

    public void setData (int age){
        this.age = age;
    }
    public void setData1 (String name){
      this.name = name ;
    }

    public void show (){
        System.out.println("your age and name is :" + age + name);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.setData(20);
        obj.setData1("arun ");
        obj.show();
    }
}
