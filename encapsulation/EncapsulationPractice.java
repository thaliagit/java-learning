package encapsulation;
import java.util.HashMap;

public class EncapsulationPractice {
    public static class Product {
        private String name;
        private double price;

        // constructor
        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }
        public double getPrice(){
            return price;
        }

        public void showInfo() {
            System.out.println("Product name: " + name + " | Product price: " + price);
        }

        public void setPrice(double newPrice) {
            if(newPrice >= 0){
                price = newPrice;
                System.out.println("New price: " + newPrice);
            }else{
                System.out.println("Invalid price.");
            }
            
        }
        public void setName(String newName){
            if(newName.trim().equals("")){
                System.out.println("Invalid name.");
            }else{
                name = newName;
            }
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, Product> products = new HashMap<>();
        products.put(101, new Product("Laptop", 1500));
        products.put(205, new Product("Keyboard", 75));
        products.put(317, new Product("Headphones", 120));
        products.put(450, new Product("Mouse", 35));
        products.put(520, new Product("Monitor", 300));

        // products.get(205).price = 100;
        // products.get(317).price = 150;
        // products.get(101).price = 1700;

        // products.get(205).setPrice(100);
        // products.get(317).setPrice(150);
        // products.get(101).setPrice(1700);
        products.get(205).setPrice(-500);
        products.get(205).showInfo();
        products.get(205).setName("");
        products.get(205).showInfo();
        boolean exists450 = products.containsKey(450);
        if (exists450) {
            // products.get(450).setPrice(50);
        } else {
            System.out.println("Product not found.");
        }

        for (HashMap.Entry<Integer, Product> entry : products.entrySet()) {
            System.out.println("Product name: " + entry.getValue().getName());
            // entry.getValue().showInfo();
        }
    }
}
