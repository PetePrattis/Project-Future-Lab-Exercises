package gr.codehub.pf.labs.lab2.exercise3;

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        FileReader fl = new FileReader();

        List<String> file1Lines = new ArrayList<>();
        List<String> file2Lines = new ArrayList<>();

        file1Lines = fl.readFile("src/main/java/test2/Ergasia3/java_code_sample_invalid.txt");
        file2Lines = fl.readFile("src/main/java/test2/Ergasia3/java_code_sample_valid.txt");

        List<List<String>> files = new ArrayList<>();
        files.add(file1Lines);
        files.add(file2Lines);


        Map<Character, Character> allSymbols = new HashMap<>();
        allSymbols.put('[',']');
        allSymbols.put('{','}');
        allSymbols.put('(',')');


        Stack<Character> javaSymbols = new Stack<>();
        boolean valid;
        for(List<String> file : files){
            valid = true;
            javaSymbols.clear();
            for(String line : file){
                for (int i = 0; i < line.length(); i++){
                    char letter = line.charAt(i);
                    if(allSymbols.containsKey(letter)){
                        //System.out.println(letter);
                        javaSymbols.push(letter);
                    }
                    else if (allSymbols.containsValue(letter)){
                        //System.out.println(letter);
                        char s = javaSymbols.peek();
                        char expectedSymbol = allSymbols.get(s);
                        if(expectedSymbol != letter){
                            valid = false;
                            System.out.println("Error: expected: " + expectedSymbol + " instead got: " + letter);
                        }
                        else{
                            System.out.println("Good work: closed symbol: " + s + " using symbol: " + letter);
                            javaSymbols.pop();
                        }
                    }
                }
            }
            if (valid && javaSymbols.empty()){
                System.out.println("Code is valid");
            }
            else{
                if(!javaSymbols.empty()){
                    System.out.println("Error: expected to close symbol: " + javaSymbols.peek() + " the symbol: " + allSymbols.get(javaSymbols.peek()) + " is missing");
                }
                System.out.println("Code is not valid");
            }
        }

    }
}
