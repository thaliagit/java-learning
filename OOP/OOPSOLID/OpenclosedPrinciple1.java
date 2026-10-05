package OOP.OOPSOLID;
// OCP: Open/Closed Principle
public class OpenclosedPrinciple1 {
    interface Notification {
        void send();
    }

    class EmailNotification implements Notification {
        public void send() {
            System.out.println("Email");
        }
    }

    class SMSNotification implements Notification {
        public void send() {
            System.out.println("SMS");
        }
    }
    class DiscordNotification implements Notification{
        public void send(){
            System.out.println("Discord");
        }
    }
}
