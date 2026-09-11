package errorHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPractice2 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isValid = false;
        while(!isValid){     
            try {
                System.out.print("Enter a number: ");
                int number = input.nextInt();
                System.out.println("Valid number: " + number);
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error message: " + e);
                System.out.println("Invalid number!");
                input.nextLine();
            }
        }
        
    }
}
