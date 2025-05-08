package Assignment.BasicLevel;

import java.io.*;

public class Q2 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/Assignment/files/input.txt"))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
