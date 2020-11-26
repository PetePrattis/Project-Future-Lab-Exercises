package lab1.exercise1;

public class Exercise1 {
    public static void main(String[] args){

        int number =2;
        int factorial = 2;
        int previousfact = 1;
        while(true){
            //if(factorial != previousfact*number){
            if(previousfact != factorial/number){

                break;
            }
            previousfact = previousfact * number;
            number++;
            factorial = factorial * number;

        }

        System.out.println("Max number " + (number-1));

    }
}
