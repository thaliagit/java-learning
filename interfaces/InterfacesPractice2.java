package interfaces;
import java.util.ArrayList;

public class InterfacesPractice2 {
    interface Payment{
        void pay();
    }
    interface Refund{
        void refund();
    }
    public static class Paypal implements Payment, Refund{
        String email, password;
        Paypal(String email, String password){
            this.email = email;
            this.password = password;
        }
        @Override 
        public void pay(){
            System.out.println("Paypal transaction has been completed.");
        }
        @Override 
        public void refund(){
            System.out.println("Refund completed. (Paypal)");
        }

    }
    public static class CreditCard implements Payment, Refund{
        String name, password;
        CreditCard(String name, String password){
            this.name = name;
            this.password = password;
        }
        @Override 
        public void pay(){
            System.out.println("Credit card transaction has been completed.");
        }
        @Override 
        public void refund(){
            System.out.println("Refund completed. (Credit Card)");
        }
    }
    public static void main(String[] args){
        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(new Paypal("asjfasf", "241sfa"));
        payments.add(new Paypal("annasfha@email.com", "ahahsa241"));
        payments.add(new CreditCard("Jessie", "2315sas231"));
        payments.add(new CreditCard("Annie", "24144222asfaavm!"));
        ArrayList<Refund> refunds = new ArrayList<>();
        refunds.add(new Paypal("asjfasf", "241sfa"));
        refunds.add(new Paypal("annasfha@email.com", "ahahsa241"));
        refunds.add(new CreditCard("Jessie", "2315sas231"));
        refunds.add(new CreditCard("Annie", "24144222asfaavm!"));
        for(Payment payment : payments){
            payment.pay();
        }
        for(Refund refund : refunds){
            refund.refund();
        }
    }
}
