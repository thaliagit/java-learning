package OOP.abstraction;

public class AbstractionPractice {
    public static abstract class Employee{
        String name;
        Employee(String name){
            this.name = name;
        }
        void work(){
            System.out.println(name + " is working.");
        }
        abstract void calculateSalary();
    }
    public static class Developer extends Employee{
        Developer(String name){
            super(name);
        }
        @Override 
        void calculateSalary() {
            System.out.println("3000");
        }
    }
    public static class Designer extends Employee{
        Designer(String name){
            super(name);
        }
        @Override 
        void calculateSalary() {
            System.out.println("2500");
        }
    }
    public static void main(String[] args){
        Employee developer1 = new Developer("Anya");
        Employee developer2 = new Developer("Tom");
        Employee designer1 = new Designer("Sebastian");
        Employee designer2 = new Designer("Peper");

        developer1.calculateSalary();
        developer2.calculateSalary();
        designer1.calculateSalary();
        designer2.calculateSalary();

    }
}
