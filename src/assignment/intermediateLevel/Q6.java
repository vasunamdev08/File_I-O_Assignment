package assignment.intermediateLevel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q6 {
    public static void main(String[] args){
        try(BufferedReader reader = new BufferedReader(new FileReader("src/Assignment/files/paragraph.txt"))) {
            String line;
            int javaCount=0;
            while((line = reader.readLine())!=null){
                String [] words = line.split(" ");
                for(String word: words){
                    if(word.equalsIgnoreCase("java")){
                        javaCount++;
                    }
                }
            }
            System.out.println("The word 'java' appears " + javaCount + " times in the file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
