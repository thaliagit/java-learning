package OOP.classes;
public class classesIntro {
    static class Car{
            String brand;
            int year;
        }
    public static void main(String[] args){
       Car c1 = new Car();
       c1.brand = "Toyota";
       c1.year = 2015;

       Car c2 = new Car();
       c2.brand = "BMW";
       c2.year = 2020;

       System.out.println(c1.brand + " " + c1.year);
       System.out.println(c2.brand + " " + c2.year);
    }
}
