package composition;

public class CompositionPractice {
    public static class Car {
        Engine engine;

        Car(Engine engine) {
            this.engine = engine;
        }

        void drive() {
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
        Car toyota = new Car(engine1);
        toyota.drive();
    }
}
