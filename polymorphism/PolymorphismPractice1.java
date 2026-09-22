package polymorphism;

public class PolymorphismPractice1 {
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
            System.out.println("Dog is eating.");
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
            System.out.println("Cat is eating.");
        }
    }

    public static void main(String[] args) {
        Animal animal1 = new Dog("Bear");
        animal1.eats();
        Animal animal2 = new Cat("Luna");
        animal2.eats();
        
    }

}
