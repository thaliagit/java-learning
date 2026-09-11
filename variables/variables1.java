package variables;
import java.util.Scanner;
public class variables1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Age: ");
        int age = input.nextInt();

        System.out.println("Hello, " + name + ".");
        System.out.print("You are only " + age + " !");
    }
}
