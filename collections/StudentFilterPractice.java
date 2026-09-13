package collections;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentFilterPractice {
    public static class Student{
        String name;
        int grade;

        Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }
        void printInfo(){
            System.out.println("Student: " + name + " - Grade: " + grade);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student("Daenerys", 42));
        students.add(new Student("Alex", 96));
        students.add(new Student("Walter", 21));
        students.add(new Student("Aragorn", 73));

        System.out.print("Insert the grade filter: ");
        int gradeAndAbove = input.nextInt();
        System.out.println("Students above grade " + gradeAndAbove + ": ");
        for(Student student : students){
            Student studentAboveThisGrade = null;
            if(student.grade >= gradeAndAbove){
                studentAboveThisGrade = student;
                System.out.println(studentAboveThisGrade.name + " - " + studentAboveThisGrade.grade);
            }
        }
        //new concept (for each element)
        for(Student student : students){
            System.out.println("Student: " + student.name + " - Grade: " + student.grade);
        }
        System.out.println("PASSING STUDENTS: ");
        for(Student student : students){
            Student passingStudent = null;
            if(student.grade >= 50){
                passingStudent = student;
                
                System.out.println(passingStudent.name + " - " + passingStudent.grade);
            }  
        }
        int passingStudentsCounter = 0;
        for(Student student : students){
            if(student.grade >= 50){
                passingStudentsCounter++;
            }
        }
        System.out.println("Total Passing Students: " + passingStudentsCounter);
        int highestGrade = students.get(0).grade;
        for(Student student : students){
            if(student.grade > highestGrade){
                highestGrade = student.grade;
            }
        }
        System.out.println("Highest Grade: " + highestGrade);
        int lowestGrade = students.get(0).grade;
        for(Student student: students){
            if(lowestGrade > student.grade){
                lowestGrade = student.grade;
            }
        }
        System.out.println("Lowest Grade: " + lowestGrade);
        input.close();
    }
}
