package FileHandeling;

import java.io.*;

//How to read data from a file 
public class Lec3 {
    public static void main(String[] args) throws IOException {
        File dir = new File("array");
        File file = new File(dir, "array.txt");

        FileReader fd = new FileReader(file);
        // int because all data is stored in the form of int
        int i = fd.read();
        // i = -1 means unit there is no data left
        while (i != -1) {
            System.out.print(i + "-->");
            System.out.println((char) i);
            i = fd.read();
        }

        // to read big file at one time
        // char ch[] = new char[(int) file.length()];

        // fd.read(ch);
        // for (char data : ch) {
        // System.out.println(data);
        // }
    }

}
