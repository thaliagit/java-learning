//OOP Consolidation — Interfaces
package OOP.OOPTasks.Task9;

import java.util.ArrayList;

public class Task9 {
    interface Payment {
        void pay();
    }

    public static class CreditCard implements Payment {
        public void pay() {
            System.out.println("Payment completed with Credit Card.");
        }
    }

    public static class Paypal implements Payment {
        public void pay() {
            System.out.println("Paypal");
        }
    }

    public static void main(String[] args) {
        //Payment creditCard1 = new CreditCard();
        //creditCard1.pay();
        //Payment p1 = new CreditCard();
        //Payment p2 = new Paypal();

        //p1.pay();
        //p2.pay();

        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(new CreditCard());
        payments.add(new Paypal());

        for(Payment payment : payments){
            payment.pay();
        }
    }
}
