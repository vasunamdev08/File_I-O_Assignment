package assignment.basicLevel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Q1 {
    public static void main(String[] args) throws FileNotFoundException {
        try(PrintWriter printWriter=new PrintWriter(new File("src/Assignment/files/notes.txt"))){
            printWriter.println("This is my first file in Java");
        }
    }
}
