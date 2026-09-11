package miniProjects;
import java.util.ArrayList;

public class ArrayListPractice {
    public static class Student{
        String name;
        int grade;

        Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }

        void showInfo(){
            System.out.println("Student: " + name + " - Grade: " + grade);
        }
    }
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 95));
        students.add(new Student("Mike", 46));
        students.add(new Student("Claire", 82));

        
    }
}
