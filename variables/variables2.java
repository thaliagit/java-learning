package variables;
import java.util.Scanner;
public class variables2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What's your age? ");
        int age = input.nextInt();
        age += 1;
        System.out.print("You will be " + age + " next year!");
    }
}
/*Instead of changing age, better style is:

int nextYearAge = age + 1;
System.out.println("You will be " + -!-> nextYearAge <--! + " next year!");

You keep original data safe
easier for bigger programs later*/