package classes;
public class classesarrayofobjects1 {
    public static class Car{
        String brand;
        int year;

        Car(String brand,int year){
            this.brand = brand;
            this.year = year;
        }

        void displayInfo(){
            System.out.println(brand + " (" + year + ")");
        }
    }

    public static void main(String[] args){
        Car[] cars = new Car[3];
        cars[0] = new Car("Toyota", 2015);
        cars[1] = new Car("BMW", 2020);
        cars[2] = new Car("Audi", 2023);

        for(int i = 0; i < cars.length; i++){
            cars[i].displayInfo();
        }
    }
}
