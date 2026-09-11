package classes;
public class classesarrayofobjects3 {
    public static class Product{
        String name;
        double price;

        Product(String name, int price){
            this.name = name;
            this.price = price;
        }

            double discountedPrice(){
                return price * 0.9;
            }
    }
    public static void main(String[] args){
        Product[] products = new Product[3];
        products[0] = new Product("Laptop", 1500);
        products[1] = new Product("Phone", 600);
        products[2] = new Product("Headphones", 150);

        for(int i = 0; i < products.length; i++){
            System.out.println("Price with discount: " + products[i].discountedPrice());
        }
    }
}
