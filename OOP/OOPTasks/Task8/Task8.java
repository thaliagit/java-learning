package OOP.OOPTasks.Task8;

public class Task8 {
    public static class Animal{
        String name;
        Animal(String name){
            this.name = name;
        }

        void eat(){
            System.out.println("Animal is eating.");
        }
    }
    public static class Dog extends Animal{
        Dog(String name){
            super(name);
        }
        @Override 
        void eat(){
            super.eat();
            System.out.println(name + " is eating like a dog.");
        }
    }
    public static void main(String[] args){
        Dog dog = new Dog("Buddy");
        dog.eat();
    }
}
