package OOP.composition;

public class CompositionPractice3 {
    public static class Car {
        Engine engine;
        String model;

        Car(Engine engine, String model) {
            this.engine = engine;
            this.model = model;
        }

        void drive() {
            System.out.println(model + " is driving.");
            engine.start();
        }
    }

    public static class Engine {
        void start() {
            System.out.println("Engine starts.");
        }
    }
    public static void main(String[] args){
        Engine engine1 = new Engine();
        Engine engine2 = new Engine();
        Car toyota = new Car(engine1, "Toyota");
        toyota.drive();
        Car bmw = new Car(engine2, "BMW");
        bmw.drive();
    }
}
