package Assignment.IntermediateLevel;

import java.io.File;

public class Q10 {
    public static void main(String[] args) {
        File file = new File("src/Assignment/files");
        String[] fileList = file.list();
        for (String fileName : fileList) {
                System.out.println(fileName);
        }
    }
}
