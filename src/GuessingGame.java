import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        // inistantiate scanner class
        Scanner keybd = new Scanner(System.in);
        //generate random number
        Random rand = new Random();
        int rand1 = rand.nextInt(10) + 1;

        int guess;
        String input;
        boolean cont = true;

        System.out.println("I have choosen a number between 1 and 10. Try to guess it.");

        while(cont == true){
        System.out.print("Your guess: ");

            input = keybd.nextLine();
            guess = Integer.parseInt(input);

            if(guess == rand1){
                System.out.println("That's right! You are a good guesser!");
                cont = false;
            }
            else{
                System.out.println("That is incorrect. Guess again.");
            }

        }

    }

}
