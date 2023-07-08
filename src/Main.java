// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int minRange = 1;
        int maxRange = 100;

        // Generate a random number
        Random random = new Random();
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        // Game loop
        while (true) {
            // Prompt the user for a guess
            String guessString = JOptionPane.showInputDialog(null, "Guess a number between " + minRange + " and " + maxRange + ":");

            // Convert the input to an integer
            int guess = Integer.parseInt(guessString);

            // Check if the guess is correct
            if (guess == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the correct number.");
                break; // Exit the loop if the guess is correct
            } else if (guess < randomNumber) {
                JOptionPane.showMessageDialog(null, "Too low! Try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Too high! Try again.");
            }
        }
    }
}