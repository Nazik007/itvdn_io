package itvdn_homeworks.io.hw_3;

public class StringPrinter {
    public static void main(String[] args) {
        String str = "Java is a general-purpose, class-based, object-oriented programming language designed for having lesser implementation dependencies. It is a computing platform for application development. Java is fast, secure, and reliable, therefore. It is widely used for developing Java applications in laptops, data centers, game consoles, scientific supercomputers, cell phones, etc.";

        do {
            System.out.println(str.substring(0,(str.indexOf(".")+1)));
            str = str.substring((str.indexOf(".")+ 1),str.length());
            str = str.trim();
        }while (str.indexOf(".") != -1);
    }
}
