package assignment.advanceLevel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q14 {
    public static void main(String[] args) {
        // Define source and destination file paths
        Path sourcePath = Paths.get("src/Assignment/files/source.txt");
        Path destinationPath = Paths.get("src/Assignment/files/destination.txt");

        try {
            // Read all bytes from the source file
            byte[] fileBytes = Files.readAllBytes(sourcePath);

            // Write all bytes to the destination file
            Files.write(destinationPath, fileBytes);

            System.out.println("File copied successfully from " + sourcePath + " to " + destinationPath);
        } catch (IOException e) {
            System.err.println("Error occurred during file copy: " + e.getMessage());
        }
    }
}
