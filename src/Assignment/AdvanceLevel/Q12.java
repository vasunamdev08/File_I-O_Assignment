package Assignment.AdvanceLevel;

import java.io.*;

public class Q12 {
    public static void main(String[] args) throws IOException {
        File files = new File("src/Assignment/files");
        String[] fileList = files.list();
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/Assignment/files/merged.txt", true));
        for (String fileName : fileList) {
            BufferedReader reader = new BufferedReader(new FileReader("src/Assignment/files/" + fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
        }
        writer.close();
        System.out.println("All files merged successfully into merged.txt");
    }
}
