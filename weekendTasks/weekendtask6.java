package weekendTasks;
public class weekendtask6 {
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
        Car c1 = new Car("Suzuki", 2020);
        Car c2 = new Car("Toyota", 2014);
        Car c3 = new Car("Hyundai", 2007);

        c1.showInfo();
        c2.showInfo();
        c3.showInfo();
    }
}
