package collections;
import java.util.HashMap;
public class HashMapObjectsPractice {
    public static class Product{
        String name;
        double price;

        //constructor
        Product(String name, double price){
            this.name = name;
            this.price = price;
        }

        public void showInfo(){
            System.out.println("Product name: " + name + " | Product price: " + price);
        }

        public void setPrice(double newPrice){
            price = newPrice;
            System.out.println("New price: " + newPrice);
        }
    }
    public static void main(String[] args){
        HashMap<Integer, Product> products = new HashMap<>();
        products.put(101, new Product("Laptop", 1500));
        products.put(205, new Product("Keyboard", 75));
        products.put(317, new Product("Headphones", 120));

       // for(HashMap.Entry<Integer, Product> entry : products.entrySet()){
            //entry.getValue().showInfo();
        //}
        Product laptop = products.get(101);
        laptop.showInfo();
        laptop.setPrice(1700);
        laptop.showInfo();
    }
}
