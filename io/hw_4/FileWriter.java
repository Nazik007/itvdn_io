package itvdn_homeworks.io.hw_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        String text = "Java Platform is a collection of programs that help programmers to develop and run Java programming applications efficiently. It includes an execution engine, a compiler, and a set of libraries in it. It is a set of computer software and specifications. James Gosling developed the Java platform at Sun Microsystems, and the Oracle Corporation later acquired it.";
        Path fileName = Path.of("/Users/nsovi/Desktop/itvdn_hw/src/itvdn_homeworks/io/hw_4/One.txt");
        Files.writeString(fileName, text);

        String fileContent = Files.readString(fileName);

        System.out.println(fileContent);
    }
}
