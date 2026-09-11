package weekendTasks;
import java.util.InputMismatchException;
import java.util.Scanner;

public class weekendtask24 {
    public static class Product{
        String name;
        double price;

        Product(String name, double price){
            this.name = name;
            this.price = price;
        }

        void printInfo(){
            System.out.println("Product name: " + name + " - Product price: " + price);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Product name: ");
            String nameOfProduct = input.nextLine();
            System.out.print("Product price: ");
            double priceOfProduct = input.nextDouble();
            if(priceOfProduct > 0 && priceOfProduct < 10000){
                Product userProduct = new Product(nameOfProduct, priceOfProduct);
                userProduct.printInfo();
            }else{
                System.out.println("Your price range should be within 1 and 10000!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Oops! Something went wrong...");
        }
    }
}
