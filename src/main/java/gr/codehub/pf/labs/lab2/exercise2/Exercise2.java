package gr.codehub.pf.labs.lab2.exercise2;


import java.util.*;

public class Exercise2 {
       public static void main(String[] args) {
        FileReader fl = new FileReader();

        List<String> fileLine = new ArrayList<>();
        fileLine = fl.readFile("src/main/java/test2/Ergasia2/Secret text.txt");
        System.out.println("The encrypted text is: ");
        System.out.println(fileLine);

        List<String> alphabet = new ArrayList<>();
        for (char ch = 'A'; ch <= 'Z'; ++ch){
            alphabet.add(String.valueOf(ch));
        }

        List<String> referenceWords = new ArrayList<>();
        referenceWords.add("I");
        referenceWords.add("THE");
        referenceWords.add("WE");
        referenceWords.add("OF");
        referenceWords.add("AT");
        referenceWords.add("TO");

        int maxMatches = 0;
        int matches;
        int bestShift = 0;
        String[] words = String.valueOf(fileLine).split(" ");
        for(int shift = 0; shift <= 25; shift++){
            matches = 0;
            for(String word : words){
                String newWord = "";
                for (int i = 0; i < word.length(); i++){
                    char letter = word.charAt(i);
                    if(alphabet.contains(String.valueOf(letter))){
                        newWord = newWord + (char)(((int) letter + shift - 65) % 26 + 65);
                    }
                }
                if(referenceWords.contains(newWord)){
                    matches += 1;
                }

            }
            if(matches > maxMatches){
                maxMatches = matches;
                bestShift = shift;
            }
        }

        System.out.println("Best shift is " + bestShift + " and the decrypted text is: ");

           for(String word : words){
               String newWord = "";
               for (int i = 0; i < word.length(); i++){
                   char letter = word.charAt(i);
                   if(alphabet.contains(String.valueOf(letter))){
                       newWord = newWord + (char)(((int) letter + bestShift - 65) % 26 + 65);
                   }
                   else{
                       newWord = newWord + letter;
                   }
               }
               System.out.print(newWord + " ");

           }

    }
}
