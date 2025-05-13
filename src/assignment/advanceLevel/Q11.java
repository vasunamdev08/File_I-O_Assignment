package assignment.advanceLevel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q11 {
    public static void main(String[] args) {
        String sourcePath = "src/Assignment/files/image.jpg";
        String destPath = "src/Assignment/files/image_copy.jpg";

        try (
                FileInputStream inputStream = new FileInputStream(sourcePath);
                FileOutputStream outputStream = new FileOutputStream(destPath)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from source and write to destination
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully to " + destPath);
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e);
        }
    }
}
