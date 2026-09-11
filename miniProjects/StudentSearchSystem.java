package miniProjects;
import java.util.Scanner;
public class StudentSearchSystem {
    static class Student{
        String name;
        int grade;

        Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }

        void showInfo(){
            System.out.println("Name: " + this.name + " - Grade: "+ this.grade);
        }
    }
    static Student findStudentByName(Student[] students, String name){
        for(int i = 0; i < students.length; i++){
            if(students[i].name.equals(name)){
                return students[i];
            }
        }
        return null;
    }
    static int passingStudents(Student[] students){
        int passedCounter = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].grade >= 50){
                passedCounter++;
            }
        }
        return passedCounter;
    }
    static int countFailing(Student[] students){
        int failedCounter = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].grade < 50){
                failedCounter++;
            }
        }
        return failedCounter;
    }
    static Student findWorstStudent(Student[] students){
        int worstGrade = students[0].grade;
        Student worstStudent = students[0];
        for(int i = 0; i < students.length; i++){
            if(students[i].grade < worstGrade){
                worstGrade = students[i].grade;
                worstStudent = students[i];
            }
        }
        return worstStudent;
    }
        public static void main(String[] args) {
            Student[] students = new Student[4];
            students[0] = new Student("Alex", 89);
            students[1] = new Student("Felipe", 34);
            students[2] = new Student("Jon", 93);
            students[3] = new Student("Dennis", 62);
            Scanner input = new Scanner(System.in);
            System.out.print("Student's name: ");
            String nameInput = input.nextLine();
            Student found = findStudentByName(students, nameInput);
             if(found != null){
                found.showInfo();
            }else{
                System.out.print("Not found.");
            }

            System.out.println("Total students passed: " + passingStudents(students));
            System.out.println("Total students failed: " + countFailing(students));
            Student worst = findWorstStudent(students);
            System.out.println("Worst student is: " + worst.name);
           

        }
}
