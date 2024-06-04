import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();

        // Range for random number
        int min = 1;
        int max = 10;

        // Random number between min and max range
        int numberToGuess = rand.nextInt(max - min + 1) + min;

        int userGuess = 0;

        System.out.println("Let's play the Number Guessing Game!");
        System.out.println("I have chosen a number between " + min + " and " + max + ".");

        // Loop until user guesses correct number
        while (userGuess != numberToGuess) {
            System.out.println("Enter your guess: ");
            userGuess = userInput.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Your guess is too high!");
            } else {
                System.out.println("Your guess is correct!");
            }
        }
        userInput.close();
    }
}