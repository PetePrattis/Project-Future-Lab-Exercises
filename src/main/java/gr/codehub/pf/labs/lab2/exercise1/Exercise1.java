package gr.codehub.pf.labs.lab2.exercise1;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args){
        FileReader fl = new FileReader();

        List<String> fileLines = new ArrayList<>();
        Set<String> logs = new HashSet<>();
        fileLines = fl.readFile("src/main/java/test2/Ergasia1/sample.log");
        //System.out.println(fileLines);
        for(String line : fileLines){
            String[] words = line.split(" ");
            //System.out.println(words);
            for(String word : words){
                try {
                    System.out.println(word);
                    if (word.contains("[")) {
                        logs.add(word);
                    }
                }
                catch (StringIndexOutOfBoundsException exception){

                }

            }

        }
        System.out.println(logs);
    }
}
