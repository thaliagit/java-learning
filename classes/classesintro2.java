package classes;
public class classesintro2 {
    static class Car{
            String brand;
            int year;

            void displayInfo(){
                System.out.println(brand + " ("+ year + ")");
            }
        }
    public static void main(String[] args){
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.year = 2015;
        Car c2 = new Car();
        c2.brand = "BMW";
        c2.year = 2020;

        c1.displayInfo();
        c2.displayInfo();
    }
}
