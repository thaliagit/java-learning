package OOP.inheritance;

public class InheritancePractice {
    public static class Animal {
        String name;

        // constructor
        Animal(String name) {
            this.name = name;
        }

        void eats() {
            System.out.println("Animal is eating.");
        }
    }

    public static class Dog extends Animal {
        // constructor
        Dog(String name) {
            super(name);
        }

        void bark() {
            System.out.println("Dog is barking.");
        }

        void makeAnimalEat() {
            super.eats();
        }

        void showName() {
            System.out.println("Dog's name: " + name);
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeAnimalEat();
        dog.showName();
    }
}
