package miniProjects.miniProjectsWithValidation;
import java.util.ArrayList;
import java.util.Scanner;
public class ProductManager {
    public static class Product{
        String name;
        double price;

        Product(String name, double price){
            this.name = name;
            this.price = price;
        }

        void printInfo(){
            System.out.println("Product: " + name + " - Price: " + price);
        }
    }
    public static boolean addProduct(ArrayList<Product> products, String name, double price){
                if(price > 0){
                    products.add(new Product(name, price));
                    return true;
                }else{
                    System.out.println("The price cannot be negative or zero.");
                }
                return false;
    }
    public static Product findProduct(ArrayList<Product> products, String nameToFind){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).name.equals(nameToFind)){
                return products.get(i);
            }
        }
        return null;
    }
    public static void removeProduct(ArrayList<Product> products, Product productToRemove){
        products.remove(productToRemove);
    }
    public static void updateProduct(Product productToUpdate, double newPriceOfProduct){
        productToUpdate.price = newPriceOfProduct;
    }
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        products.add(new Product("Pen", 1.20));
        products.add(new Product("White Board", 4.99));
        products.add(new Product("Chair", 79.99));
        products.add(new Product("Desk", 59.99));

        
        while(true){
            System.out.println("===== PRODUCT MANAGER =====");
            System.out.println("1. Show all products.");
            System.out.println("2. Add product.");
            System.out.println("3. Find product.");
            System.out.println("4. Remove product.");
            System.out.println("5. Update product price.");
            System.out.println("6. Exit.");

            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    for(Product product : products){
                        product.printInfo();
                    }
                    break;
                case "2":
                    System.out.print("Name of product: ");
                    String nameOfProduct = input.nextLine();
                    Product searchIfExists = findProduct(products, nameOfProduct);
                    if(searchIfExists != null){
                        System.out.println("This product already exists!");
                    }else{
                        boolean isValid = false;
                        while (!isValid) {
                            try {
                                System.out.print("Price of product: ");
                                double priceOfProduct = input.nextDouble();
                                input.nextLine();
                                if(priceOfProduct > 0 && priceOfProduct <= 10000){
                                    boolean added = addProduct(products, nameOfProduct, priceOfProduct);
                                    if(added){
                                    System.out.println("Product: " + nameOfProduct + " has been added successfully!");
                                    isValid = true;}
                                    }else{
                                    System.out.println("Price has to be a positive number and cannot exceed 10000.");
                                }  
                            } catch (Exception e) {
                                System.out.println("Invalid number! Try again.");
                                input.nextLine();
                            }
                        }
                    }
                    break;
                case "3":
                    System.out.print("Product name: ");
                    String productName = input.nextLine();
                    Product found = findProduct(products, productName);
                    if(found != null){
                        System.out.println("Product: " + found.name + " exists!");
                    }else{
                        System.out.println("This product does not exist!");
                    }
                    break;
                case "4":
                    System.out.print("Product name: ");
                    String productNameToRemove = input.nextLine();
                    Product existToRemove = findProduct(products, productNameToRemove);
                    if(existToRemove != null){
                        removeProduct(products, existToRemove);
                        System.out.println("Product: " + existToRemove.name + " has been removed successfully!");
                    }else{
                        System.out.println("This product does not exist!");
                    }
                    break;
                case "5":
                    System.out.print("Product name: ");
                    String productNameToUpdate = input.nextLine();
                    Product existsToUpdate = findProduct(products, productNameToUpdate);
                    if( existsToUpdate != null){
                        boolean isValid = false;
                        while(!isValid){
                            try{
                                System.out.print("Insert new price: ");
                                double newPrice = input.nextDouble();
                                input.nextLine();
                                if(newPrice > 0 && newPrice <= 10000){
                                updateProduct(existsToUpdate, newPrice);
                                System.out.println("Product: " + existsToUpdate.name + "'s price has been updated successfully!");
                                isValid = true;
                                }else{
                                System.out.println("Price has to be a positive number and cannot exceed 10000.");
                                }
                            }catch(Exception e){
                                System.out.println("Invalid input! Price has to be a number.");
                                input.nextLine();
                            }
                        }
                    }else{
                        System.out.println("This product does not exist!");
                    }
                    break;
                case "6":
                    System.out.println("Good bye!");
                    return;
                default:
                    break;
            }
        }

    }
}
