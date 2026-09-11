package ifStatements;
import java.util.Scanner;
public class ifstatementsintro {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What's your age? ");
        int age = input.nextInt();
        if(age <= 0){
            System.out.println("Wrong input. Age cannot be a negative number!");
        }else{
            if(age >= 18){
                System.out.println("You are an adult!");
            }else{
                System.out.println("You aren't an adult yet!");
            }
        }
    } 
}

/* Chatgpt correction:

if(age <= 0){
    System.out.println("Wrong input.");
} else if(age >= 18){
    System.out.println("You are an adult!");
} else {
    System.out.println("You aren't an adult yet!");
}*/