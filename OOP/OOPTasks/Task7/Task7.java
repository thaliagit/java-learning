package OOP.OOPTasks.Task7;
// s u p e r
public class Task7 {
    public static class Animal{
        void eat(){
            System.out.println("Animal is eating.");
        }
    }
    public static class Dog extends Animal{
        @Override 
        void eat(){
            super.eat();
            System.out.println("Dog is eating.");
        }
    }
    public static void main(String[] args){
        Animal dog1 = new Dog();
        dog1.eat();
    }
}
