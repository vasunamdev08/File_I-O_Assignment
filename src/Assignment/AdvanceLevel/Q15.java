package Assignment.AdvanceLevel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Q15 {
    public static void main(String[] args) {
        // Define the source and destination file paths
        String sourceFilePath = "src/Assignment/files/source.txt";
        String destinationFilePath = "src/Assignment/files/charCount.txt";
        Map<Character, Integer> charCountMap = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath))){
            String line;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
                }
            }

            // Write the character counts to the destination file
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
            Files.write(Paths.get(destinationFilePath), sb.toString().getBytes());
            System.out.println("Character count written to " + destinationFilePath);
        } catch (FileNotFoundException e) {
            System.err.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
