package composition;

public class CompositionPractice2 {
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
        Car toyota = new Car(engine1, "Toyota");
        toyota.drive();
    }
}
