// P O L Y M O R P H I S M ! ! !
package OOP.OOPTasks.Task6;
import java.util.ArrayList;

public class Task6 {
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

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        for(Animal animal : animals){
            animal.eat();
        }
    }
}
