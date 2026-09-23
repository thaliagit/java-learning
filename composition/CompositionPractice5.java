package composition;

public class CompositionPractice5 {
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
        int horsepower;
        Engine(int horsepower){
            this.horsepower = horsepower;
        }
        void start() {
            System.out.println("Engine with " + horsepower + " HP starts.");
        }
    }
    public static void main(String[] args){
        Engine engine1 = new Engine(500);
        Car toyota = new Car(engine1, "Toyota");
        toyota.drive();
        Car bmw = new Car(engine1, "BMW");
        bmw.drive();
    }
}
