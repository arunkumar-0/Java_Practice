package FileHandeling;

import java.io.*;

public class Lec1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("new.txt");
        System.out.println(file1.exists());

        // to create a new file
        file1.createNewFile();
        System.out.println(file1.exists());

        // check weather there is a directory of name arun
        File dir = new File("ARUN");
        // to make new directory
        dir.mkdirs();
    }
}
