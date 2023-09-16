package FileHandeling;

import java.io.*;

//we can use bufferedWrter and BudderedReader along with fileReader and FileWriter to increase efficienc and speed 
public class Lec2 {

    public static void main(String[] args) throws IOException {
        // chech weather there is a file or not
        File dir = new File("FileHandeling");
        // check the file inside directory
        File file = new File(dir, "arun");

        file.createNewFile();

        FileWriter fw = new FileWriter(file);

        fw.write("abc");
        fw.write(34); // it store in ascii form
        char ch[] = { 'a', 'r', 'u', 'n' };
        fw.write(ch);

        fw.close();

    }
}