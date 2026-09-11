package weekendTasks;
public class weekendtask7 {
    public static class Car{
        String brand;
        int year;

        Car(String brand, int year){
            this.brand = brand;
            this.year = year;
        }

        void showInfo(){
             System.out.println("Brand: " + brand + " - Year: " + year);
        }
    }
    public static void main(String[] args){
        Car[] cars = new Car[3];
        cars[0] = new Car("Toyota", 2014);
        cars[1] = new Car("Suzuki", 2020);
        cars[2] = new Car("Hyundai", 2007);

        for(int i = 0; i < cars.length; i++){
            cars[i].showInfo();
        }
    }
}
