// C o n s o l i d a t i o n   E x e r c i s e ! ! !
package OOP.OOPTasks.Task2;

public class Task2 {
    public static class Engine{
        void start(){
            System.out.println("Engine starts.");
        }
    }
    public static class Car{
        Engine engine;
        Car(Engine engine){
            this.engine = engine;
        }
        void drive(){
            engine.start();
        }
    }
    public static void main(String[] args){
        Engine engine1 = new Engine();
        Car car1 = new Car(engine1);

        car1.drive();
        
    }
}
