package ifStatements;
import java.util.Scanner;
public class ifstatementsintro2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What's your age? ");
        int age = input.nextInt();
        if(age <= 0){
            System.out.print("Number has to be positive!");
        }else if(age >= 13 && age <=17){
            System.out.print("You are a teen!");
        }else if(age >= 18){
            System.out.print("You are an adult!");
        }
        else{
            System.out.print("You are a child!");
        }
    }
}

/* Chatgpt correction:
if (age <= 0) {
    System.out.println("Number has to be positive!");
} else if (age >= 18) {
    System.out.println("You are an adult!");
} else if (age >= 13) {
    System.out.println("You are a teen!");
} else {
    System.out.println("You are a child!");
} */
