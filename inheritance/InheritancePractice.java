package inheritance;



public class InheritancePractice {
    public static class Animal{
        void eats(){
            System.out.println("Animal is eating.");
        }
    }
    public static class Dog extends Animal{
            void bark(){
                System.out.println("Dog is barking.");
            }
            void makeAnimalEat(){
                super.eats();
            }
        }
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.makeAnimalEat();
    }
}
