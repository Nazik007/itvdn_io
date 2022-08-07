package itvdn_homeworks.io.hw_2;

import java.io.*;

public class FileReader {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("itvdn.io.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("itvdn.io.txt")))) {
            out.writeUTF("Java is a general-purpose, class-based, object-oriented programming language designed for having lesser implementation dependencies." +
                    "\nIt is a computing platform for application development. Java is fast, secure, and reliable, therefore.\nIt is widely used for developing Java applications in laptops, data centers, game consoles, scientific supercomputers, cell phones, etc.");
            out.flush();

            System.out.println(in.readUTF());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
