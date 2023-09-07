package Interface_Lambda;

//interface - it is similar to abstract class . inside interface the variables are public static final and methods are public and abstract 
//no object of interface can be made and no construct are made 
//in interface we create design and them we implement in different interfaces

interface Computer {
    void show();
}

class Laptop implements Computer {
    public void show() {
        System.out.println("you got an error on laptop");
    }
}

class Dekstop implements Computer {
    public void show() {
        System.out.println("you got an error on dekstop");
    }
}

class Developer {
    public void buildApp(Computer obj) {
        System.out.println("building app");
        obj.show();
    }
}

public class Lec1 {
    public static void main(String[] args) {
        Developer d = new Developer();
        Computer abc = new Dekstop();
        d.buildApp(abc);

    }
}
