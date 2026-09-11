package weekendTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class weekendtask26 {
    public static void addNumbers(int n1, int n2) {
        int addition = n1 + n2;
        System.out.println("Result of addition: " + addition);
    }

    public static void subtractNumbers(int n1, int n2) {
        int subtraction = n1 - n2;
        System.out.println("Result of subtraction: " + subtraction);
    }

    public static void multiplyNumbers(int n1, int n2) {
        int multiplication = n1 * n2;
        System.out.println("Result of multiplication: " + multiplication);
    }

    public static void divideNumbers(int n1, int n2) {
        int division = n1 / n2;
        System.out.println("Result of division: " + division);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        while (true) {
            try {
                System.out.print("Insert an integer number: ");
                num1 = input.nextInt();
                System.out.print("Insert a second integer number: ");
                num2 = input.nextInt();

                break;
            } catch (InputMismatchException e) {
                System.out.println("Something went wrong. " + e);
                input.nextLine();
            }
        }

        System.out.println("Options: ");
        System.out.println("1. Add ");
        System.out.println("2. Subtract ");
        System.out.println("3. Multiply ");
        System.out.println("4. Divide ");
        System.out.println("5. Insert new numbers ");
        System.out.println("6. Exit ");

        while (true) {
            System.out.print("Select your option: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    addNumbers(num1, num2);
                    break;
                case 2:
                    subtractNumbers(num1, num2);
                    break;
                case 3:
                    multiplyNumbers(num1, num2);
                    break;
                case 4:
                    if(num2 != 0){
                        divideNumbers(num1, num2);
                    }else{
                        System.out.println("Division cannot work because of value 0!");
                        break;
                    }
                    
                    break;
                case 5:
                    while (true) {
                        try {
                            System.out.print("Insert an integer number: ");
                            num1 = input.nextInt();
                            System.out.print("Insert a second integer number: ");
                            num2 = input.nextInt();

                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Something went wrong. " + e);
                            input.nextLine();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    break;
            }
        }

    }
}
