package OOP.OOPTasks.MiniProjectOOP;

public class test {
    public static class Animal {
        void eat() {
            System.out.println("Animal eats");
        }
    }

    public static class Dog extends Animal {
        @Override
        void eat() {
            System.out.println("Dog eats");
        }

        void bark() {
            System.out.println("Woof!");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
    }

}
