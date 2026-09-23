package OOP.encapsulation;

public class EncapsulationChallenge {
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

        public double getPrice() {
            return price;
        }

        public void showInfo() {
            System.out.println("Product name: " + name + " | Product price: " + price);
        }

        public void setPrice(double newPrice) {
            //validation
            if (newPrice >= 0) {
                price = newPrice;
                System.out.println("New price: " + newPrice);
            } else {
                System.out.println("Invalid price.");
            }

        }

        public void setName(String newName) {
            //validation
            if (newName.trim().equals("")) {
                System.out.println("Invalid name.");
            } else {
                name = newName;
            }
        }
        public static class BankAccount{
            private String owner;
            private double balance;

            BankAccount(String owner, double balance){
                this.owner = owner;
                this.balance = balance;
            }

            public double getBalance(){
                return balance;
            }

            public void deposit(double amount){
                //validation
                if(amount > 0){
                    balance += amount;
                }else{
                    System.out.println("Invalid deposit.");
                }
            }

            public void withdraw(double amount){
                //validation
                if(amount > 0 && amount <= balance){
                    balance -= amount;
                }else{
                    System.out.println("Invalid Withdrawal.");
                }
            }
        }
    }
    public static void main(String[] args){

    }
}
