package polymorphism;

import java.util.ArrayList;

public class PolymorphismChallenge {
    public static class Animal{
        String name;
        Animal(String name){
            this.name = name;
        }
        void eats(){
            System.out.println("Animal is eating.");
        }
    }
    public static class Dog extends Animal{
        Dog(String name){
            super(name);
        }
        @Override 
        void eats(){
            System.out.println("Dog is eating.");
        }
        void barks(){
            System.out.println("Dog is barking.");
        }
    }
    public static class Cat extends Animal{
        Cat(String name){
            super(name);
        }
        @Override 
        void eats(){
            System.out.println("Cat is eating.");
        }
        void meow(){
            System.out.println("Cat is meowing.");
        }
    }
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Bear"));
        animals.add(new Dog("Ramon"));
        animals.add(new Cat("Luna"));
        animals.add(new Cat("Sebastian"));

        for(Animal animal : animals){
            animal.eats();
        }
    }
}
