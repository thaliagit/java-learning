package errorHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
    
public class TryCatchPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        try {
            int number = input.nextInt();
            System.out.println("Valid number: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error message: " + e);
            System.out.println("Invalid number!");
        }

        System.out.println("Program continues running.");
    }
}
