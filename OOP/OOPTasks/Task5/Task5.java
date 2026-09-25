package OOP.OOPTasks.Task5;

public class Task5 {
    public static class Animal {
        void eat() {
            System.out.println("Animal is eating.");
        }
    }

    public static class Dog extends Animal {
        @Override
        void eat() {
            System.out.println("Dog is eating.");
        }
    }

    public static class Cat extends Animal {
        @Override
        void eat() {
            System.out.println("Cat is eating.");
        }
    }
    public static void main(String[] args){
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.eat();
        animal2.eat();
    }
}
