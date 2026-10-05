package OOP.OOPSOLID;

public class DependencyInversionPrinciple {
    interface Payment{
        void pay();
    }
    class OrderService {
        Payment payment;
        OrderService(Payment payment){
            this.payment = payment;
        }
    }
    class CreditCard implements Payment{
        @Override 
         public void pay(){
            System.out.println("Credit Card payment.");
        }
    }
}
