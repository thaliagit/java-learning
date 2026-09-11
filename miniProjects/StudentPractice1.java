package miniProjects;
import java.util.Scanner;

public class StudentPractice1 {
    static class Student{
        String name;
        int grade;

        Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }

        void showInfo(){
            System.out.println("Name: " + name + " - Grade: " + grade);
        }
        String getInfo(){
            return name + " - Grade: " + grade;
        }
    }
    
    // METHODS:

    static void studentReport(Student[] students){
        int passing = countPassing(students);
        int failing = students.length - passing;
        System.out.println("===== STUDENT REPORT =====");
        System.out.println("Total: " + students.length);
        System.out.println("Passing: " + passing);
        System.out.println("Failing: " + (failing));
        System.out.println("Average: " + calculateAverageGrade(students));
        System.out.println("Best: " + findBestStudent(students).getInfo());
        System.out.println("Worst: " + findWorstStudent(students).getInfo());
        System.out.println("==========================");
    }
    static void printSummary(Student[] students){
        int totalStudents = students.length;
        int passingStudents = countPassing(students);
        int failingStudents = totalStudents - passingStudents;
        System.out.println("~~~ Summary: ~~~");
        System.out.println("Total students: " + totalStudents);
        System.out.println("Total passing students: " + passingStudents);
        System.out.println("Total failing students: " + failingStudents);
        System.out.println("Average: " + calculateAverageGrade(students));
    }
    static Student findStudent(Student[] students, String name){
        for(int i = 0; i < students.length; i++){
            if(students[i].name.equals(name)){
                return students[i];
            }
        }
        return null;
    }
    static int countPassing(Student[] students){
        int counterPassing = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].grade >= 50){
                counterPassing++;
            }
        }
        return counterPassing;
    }
    static Student findBestStudent(Student[] students){
        Student bestStudent = students[0];
        for(int i = 1; i < students.length; i++){
            if(bestStudent.grade < students[i].grade){
                bestStudent = students[i];
            }
        }
        return bestStudent;
    }
    static Student findWorstStudent(Student[] students){
        Student worstStudent = students[0];
        for(int i = 1; i < students.length; i++){
            if(worstStudent.grade > students[i].grade){
                worstStudent = students[i];
            }
        }
        return worstStudent;
    }
    static double calculateAverageGrade(Student[] students){
        double gradeSum = 0;
        for(int i = 0; i < students.length; i++){
            gradeSum += students[i].grade;
        }
        return gradeSum / students.length;
    }
    public static void main(String[] args){
        //Scanner usage (Input):
        Scanner input = new Scanner(System.in);
        System.out.print("Student's name: ");
        String studentName = input.nextLine();

        Student[] students = new Student[4];
        students[0] = new Student("Lilly", 78);
        students[1] = new Student("Mike", 43);
        students[2] = new Student("Jenny", 22);
        students[3] = new Student("Jon", 63);
        Student found = findStudent(students, studentName);
        if(found != null){
            System.out.print("Student found: ");
            found.showInfo(); //why cant I use here found.showInfo();
            //System.out.println(found.getInfo());
            ///or use found.getInfo() directly
        }else{
            System.out.println("Student not found. ");
        }
        //System.out.println("Total students passed: " + countPassing(students));
        //printSummary(students);
        //String best = findBestStudent(students).getInfo();
        //System.out.println("Best student: " + best);

        studentReport(students);
        input.close();
    }
}
