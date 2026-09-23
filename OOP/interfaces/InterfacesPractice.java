package OOP.interfaces;
public class InterfacesPractice {
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
        Paypal transaction1 = new Paypal("Phil", "hehe2351");
        CreditCard transation2 = new CreditCard("Claire", "234552aaa");
        transaction1.pay();
        transation2.pay();
    }
}
