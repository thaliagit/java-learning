package classes;
public class classesintro4constructortask {
    public static class Student{
        String name;
        int grade;
        
        Student(String n, int g){
            name = n;
            grade = g;
        }

        void showInfo(){
            System.out.println(name + " - Grade: " + grade);
        }
    }
    public static void main(String[] args){
        Student s1 = new Student("Alex", 100);
        s1.showInfo();
        Student s2 = new Student("Haley", 40);
        s2.showInfo();
    }
}
