package API;

import java.lang.annotation.*;

//custom annotation 

@Retention(RetentionPolicy.RUNTIME) // power of annotaion like runtime or compile time
@Target({ ElementType.FIELD, ElementType.TYPE }) // target - means where we can use it with block , class or method
@interface player // defining
{
    String country() default "India";
}

@player
class newPlayer {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Annotation {
    public static void main(String[] args) {
        newPlayer np = new newPlayer();
        np.setAge(23);
        np.setName("akash");
        System.out.println(np.getAge());
        System.out.println(np.getName());

    }
}
