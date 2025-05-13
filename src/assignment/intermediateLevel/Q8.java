package assignment.intermediateLevel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q8 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/Assignment/files/employee.csv"))){
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line.toUpperCase());
            }
        }
    }
}
