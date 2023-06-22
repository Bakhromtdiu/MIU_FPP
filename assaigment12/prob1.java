
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreInputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        try {
            System.out.print("Enter the score (0-100): ");
            score = scanner.nextInt();

            if (score < 0 || score > 100) {
                throw new UnsupportedOperationException("Score must be between 0 and 100.");
            }

            System.out.println("Score entered: " + score);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer value.");
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
