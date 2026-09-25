package OOP.OOPTasks.Task3;

public class Task3 {
    public static class Animal{
        void eat(){
            System.out.println("Animal is eating.");
        }
    }
    public static class Dog extends Animal{
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
