import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        
        System.out.println("hiee buddie..! this is PRUTVIRAJ'S mode of Guessing Game");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        while (!hasGuessedCorrectly && attempts < 10) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == randomNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts! ");
            } else if (guess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            } 
        }
        
        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
        }
        
        scanner.close();
    }
}
