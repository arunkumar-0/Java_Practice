package FileHandeling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//serialization and deserialization
class Demo implements Serializable {
    private String name;
    private int age;
    private int roll_no;

    public Demo(String name, int age, int roll_no) {
        this.age = age;
        this.name = name;
        this.roll_no = roll_no;
    }

    public void show() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }

}

public class Lec4 {
    public static void main(String[] args) throws Exception {

        // Serialization

        // Demo d = new Demo("Arun", 18, 25);

        // FileOutputStream fos = new FileOutputStream("Serializable.txt");
        // ObjectOutputStream oos = new ObjectOutputStream(fos);
        // oos.writeObject(d);
        // oos.flush();
        // oos.close();

        // in order to deserialize the object we need to have the same class which we
        // have in serialization

        // Deserialization
        FileInputStream fis = new FileInputStream("Serializable.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Demo d = (Demo) ois.readObject();
        d.show();
        ois.close();
    }
}