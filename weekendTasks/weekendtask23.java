package weekendTasks;

import java.util.ArrayList;

public class weekendtask23 {
    public static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        void showInfo() {
            System.out.println("Product: " + name + " - Price: " + price);
        }
    }

    public static void showMostExpensiveProduct(ArrayList<Product> products) {
        double mostExpensivePrice = products.get(0).price;
        Product mostExpensiveProduct = products.get(0);
        for (Product product : products) {
            if (product.price > mostExpensivePrice) {
                mostExpensivePrice = product.price;
                mostExpensiveProduct = product;
            }
        }
        System.out.println("Most expensive product ----> Product name: " + mostExpensiveProduct.name
                + " - Product price: " + mostExpensiveProduct.price);
    }

    public static void showCheapestProduct(ArrayList<Product> products) {
        double cheapestPrice = products.get(0).price;
        Product cheapestProduct = products.get(0);
        for (Product product : products) {
            if (cheapestPrice > product.price) {
                cheapestPrice = product.price;
                cheapestProduct = product;
            }
        }
        System.out.println("Cheapest product ----> Product name: " + cheapestProduct.name + " - Product price: "
                + cheapestProduct.price);
    }

    public static void showAveragePriceOfProducts(ArrayList<Product> products) {
        double productCount = 0;
        double productPriceTotal = 0;
        for (Product product : products) {
            productPriceTotal += product.price;
            productCount += 1;
        }
        double averagePriceOfProducts = productPriceTotal / productCount;

        System.out.println(
                "Average Price: " + String.format("%.2f", averagePriceOfProducts));
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Desk", 800));
        products.add(new Product("Chair", 1200));
        products.add(new Product("Keyboard", 900));
        // products.add(new Product("Pen", 1.99));
        // products.add(new Product("Basket", 14.99));

        showMostExpensiveProduct(products);
        showCheapestProduct(products);
        showAveragePriceOfProducts(products);

    }
}
