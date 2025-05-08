package Assignment.BasicLevel;

import java.io.*;

public class Q5 {
    public static void main(String[] args) throws FileNotFoundException {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/Assignment/files/source.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/Assignment/files/backup.txt"))){
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
