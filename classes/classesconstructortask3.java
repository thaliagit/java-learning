package classes;
public class classesconstructortask3 {
    public static class Person{
        String name;
        int age;

        Person(String n, int a){
            name = n;
            age = a;
        }

        void show(){
            System.out.println(name + " (" + age + ")");
        }
    }

    public static class Book{
        String title;
        int pages;

        Book(String t, int p){
            title = t;
            pages = p;
        }

        public int getPages() {
            return pages;
        }
    }

    public static class Product{
        String name;
        double price;

        Product(String n, double p){
            name = n;
            price = p;
        }

        void showPrice(){
            System.out.println(name + " costs: " + price + " $");
        }
    }

    public static class Circle{
        double radius;
        Circle(double r){
            radius = r;
        }

        double area(){
            return (radius* radius) * 3.14;
        }
    }

    public static class Student{
        String name;
        int grade;

        Student(String n, int g){
            name = n;
            grade = g;
        }

        boolean isPassing(){
            if(grade>50){
                return true;
            }else{
                System.out.println(name + " is not passing.");
                return false;
            }
        }
    }
    public static void main(String[] args){
        Person p1 = new Person("Alex", 25);
        p1.show();

        Book b1 = new Book("Harry Potter", 300);
        System.out.println(b1.getPages());

        Circle c1 = new Circle(5.12);
        System.out.println(c1.area());

        Student s1 = new Student("Alex", 90);
        s1.isPassing();
        Student s2 = new Student("Haley", 48);
        s2.isPassing();
    }
}
