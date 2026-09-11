package weekendTasks;
import java.util.ArrayList;
import java.util.Scanner;
public class weekendtask22 {
    public static class Product{
        String name;
        double price;

        Product(String name, double price){
            this.name = name;
            this.price = price;
        }

        void printInfo(){
            System.out.println("Product: " + name + " - price: " + price);
        }
    }
    public static ArrayList<Product> showMoreExpensiveProducts(ArrayList<Product> products, double priceInput){
        ArrayList<Product> moreExpensiveProducts = new ArrayList<>();
        for(Product product : products){
            if(product.price >= priceInput){
                moreExpensiveProducts.add(product);
            }
        }
        return moreExpensiveProducts;
    }
    public static ArrayList<Product> showCheaperProducts(ArrayList<Product> products, double priceInput){
        ArrayList<Product> cheaperProducts = new ArrayList<>();
        for(Product product : products){
            if(product.price < priceInput){
                cheaperProducts.add(product);
            }
        }
        return cheaperProducts;
    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int counterOver50 = 0;
            ArrayList<Product> products = new ArrayList<>();
            products.add(new Product("Laptop", 800));
            products.add(new Product("Table", 79.99));
            products.add(new Product("Blanket", 9.99));
            products.add(new Product("Vase", 4.99));
            products.add(new Product("Bike", 49.99));
            products.add(new Product("Pen", 1.99));

            System.out.print("Insert your price: ");
            double priceInp = input.nextDouble();
            input.nextLine();
            System.out.println("Products more expensive than inserted price: ");
            ArrayList<Product> moreExpensive = showMoreExpensiveProducts(products, priceInp);
            if(moreExpensive != null){
                for(Product product : moreExpensive){
                    product.printInfo();
                }
            }
            System.out.println("Products cheaper than inserted price: ");
            ArrayList<Product> cheapProducts = showCheaperProducts(products, priceInp);
            if(cheapProducts != null){
                for(Product product : cheapProducts){
                    product.printInfo();
                }
            }

            for(Product product : products){
                if(product.price >= 50){
                    counterOver50++;
                }
            }

            System.out.println("Products more expensive than 50: " + counterOver50);
        }
}
