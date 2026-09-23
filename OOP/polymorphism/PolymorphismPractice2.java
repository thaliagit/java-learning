package OOP.polymorphism;
import java.util.ArrayList;

public class PolymorphismPractice2 {
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
        @Override 
        void eats(){
            System.out.println(name + " is eating.");
        }

        void showName() {
            System.out.println("Dog's name: " + name);
        }
    }
    public static class Cat extends Animal{
        Cat(String name){
            super(name);
        }

        void meow(){
            System.out.println(name + " meows!");
        }
        @Override 
        void eats(){
            System.out.println(name + " is eating.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Bear"));
        animals.add(new Cat("Luna"));
        animals.add(new Dog("Ramon"));

        for(Animal animal : animals){
            animal.eats();
        }
        
    }

}
