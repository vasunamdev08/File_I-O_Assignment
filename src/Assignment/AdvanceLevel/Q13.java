package Assignment.AdvanceLevel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q13 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/Assignment/files/server.log"))) {
            String line;
            int errorCount =0;
            while((line = reader.readLine())!=null){
                String [] words = line.split(" ");
                for(String word: words){
                    if(word.equalsIgnoreCase("ERROR")){
                        errorCount++;
                    }
                }
            }
            System.out.println("The word 'ERROR' appears " + errorCount + " times in the file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
