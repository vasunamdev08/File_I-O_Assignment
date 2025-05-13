package assignment.intermediateLevel;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Q7 {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/Assignment/files/log.txt", true))) {
            writer.write("Last updated on: " + java.time.LocalDateTime.now());
            writer.newLine();
            System.out.println("Data appended successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
