package Assignment.BasicLevel;

import java.io.File;

public class Q3 {
    public static void main(String[] args) {
        File file = new File("src/Assignment/files/report.pdf");
        if(file.exists()){
            System.out.println("File exists");
            System.out.println("File size: " + file.length() + " bytes");
        }else{
            System.out.println("File does not exist");
        }
    }
}
