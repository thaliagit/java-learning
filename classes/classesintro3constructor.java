package classes;
public class classesintro3constructor {
    public static class Car{
        String brand;
        int year;

        Car(String a, int b){
            brand = a;
            year = b;
        }

        void displayInfo(){
            System.out.println(brand + " (" + year + ")");
        }
    }
    public static void main(String[] args){
        Car c1 = new Car("Toyota", 2015);
        c1.displayInfo();
        Car c2 = new Car("Suzuki", 2020);
        c2.displayInfo();
    }
}
