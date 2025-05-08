package Assignment.BasicLevel;

import java.io.*;

public class Q4 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/Assignment/files/data.txt"))){
            int lineCount =0;
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
            }
            System.out.println("Number of lines in the file: " + lineCount);
        }
    }
}
