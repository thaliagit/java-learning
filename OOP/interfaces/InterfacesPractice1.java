package OOP.interfaces;

import java.util.ArrayList;

public class InterfacesPractice1 {
    interface Payment{
        void pay();
    }
    public static class Paypal implements Payment{
        String email, password;
        Paypal(String email, String password){
            this.email = email;
            this.password = password;
        }
        @Override 
        public void pay(){
            System.out.println("Paypal transaction has been completed.");
        }

    }
    public static class CreditCard implements Payment{
        String name, password;
        CreditCard(String name, String password){
            this.name = name;
            this.password = password;
        }
        @Override 
        public void pay(){
            System.out.println("Credit card transaction has been completed.");
        }
    }
    public static void main(String[] args){
        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(new Paypal("asjfasf", "241sfa"));
        payments.add(new Paypal("annasfha@email.com", "ahahsa241"));
        payments.add(new CreditCard("Jessie", "2315sas231"));
        payments.add(new CreditCard("Annie", "24144222asfaavm!"));
        for(Payment payment : payments){
            payment.pay();
        }
    }
}
