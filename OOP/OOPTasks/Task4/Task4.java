package OOP.OOPTasks.Task4;

public class Task4 {
    public static class Animal{
        void eat(){
            System.out.println("Animal is eating.");
        }
    }
    public static class Dog extends Animal{
        @Override 
        void eat(){
            System.out.println("Dog is eating.");
        }
        void bark(){
            System.out.println("Dog is barking.");
        }
    }
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.bark();
    }
}
