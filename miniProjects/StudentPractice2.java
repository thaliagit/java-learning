package miniProjects;
import java.util.Scanner;

public class StudentPractice2 {
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
        Student[] students = new Student[5];
        students[0] = new Student("Jessica", 55);
        students[1] = new Student("Mike", 89);
        students[2] = new Student("George", 32);
        students[3] = new Student("Alex", 98);
        students[4] = new Student("Hayley", 19);

        Scanner input = new Scanner(System.in);
       while(true){
        System.out.println("====== MENU ======");
        System.out.println("1. Show all students.");
        System.out.println("2. Find student.");
        System.out.println("3. Show report.");
        System.out.println("4. Show best student.");
        System.out.println("5. Exit.");

        int choice = input.nextInt();
        input.nextLine(); // important (clears buffer)
        switch (choice){
            case 1:
                for(int i = 0; i < students.length; i++){
                    students[i].showInfo();
                }
                break;
            case 2:
                System.out.print("Student's name: ");
                String nameOfStudent = input.nextLine();
                Student found = findStudent(students, nameOfStudent);
                if(found != null){
                    found.showInfo();
                }else{
                    System.out.println("Student not found.");
                }
                break;
            case 3:
                studentReport(students);
                break;
            case 4:
                Student best = findBestStudent(students);
                System.out.println("Best student is: " + best.getInfo());
                break;
            case 5:
                System.out.println("Goodbye!");
                return;
            default:
                System.out.println("Invalid choice");
        }
        input.close();
       }
    }
}
