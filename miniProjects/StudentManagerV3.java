package miniProjects;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagerV3 {
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
    public static Student findStudent(ArrayList<Student> students, String studentNameToFind){
        for(Student student : students){
            if(student.name.equals(studentNameToFind)){
                return student;
            }
        }
        return null;
    }
    public static void printAllStudents(ArrayList<Student> students){
        for(Student student : students){
            student.showInfo();
        }
    }
    public static void addStudent(ArrayList<Student> students, String newStudentName, int newStudentGrade){
        students.add(new Student(newStudentName, newStudentGrade));
    }
    public static boolean removeStudent(ArrayList<Student> students, String studentNameToRemove){
        for(int i = 0; i < students.size(); i++){
            if(studentNameToRemove.equals(students.get(i).name)){
                students.remove(i);
                return true;
            }
        }
        return false;
    }
    public static void updateStudent(Student student, int newGrade){
        student.grade = newGrade;
    }
    public static void printMenu(){
        System.out.println("\n===== MENU ======");
        System.out.println("1. Show all students.");
        System.out.println("2. Add a student.");
        System.out.println("3. Find a student.");
        System.out.println("4. Remove a student.");
        System.out.println("5. Update student's grade.");
        System.out.println("6. Exit.");
        System.out.print("Your choice: ");
    }
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        students.add(new Student("Alex", 93));
        students.add(new Student("Mike", 34));
        students.add(new Student("Claire", 86));
    
        while(true){
            printMenu();
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    printAllStudents(students);
                    break;
                case 2:
                    System.out.print("Student's name: ");
                    String name = input.nextLine();
                    System.out.print("Student's grade: ");
                    int grade = input.nextInt();
                    input.nextLine();
                    addStudent(students, name, grade);
                    break;
                case 3:
                    System.out.print("Student's name: ");
                    String studentName = input.nextLine();
                    Student found = findStudent(students, studentName);
                    if(found != null){
                        System.out.println("<<<<Student found>>>> ");
                        found.showInfo();
                    }else{
                        System.out.println("Student does not exist. ");
                    }
                    break;
                case 4:
                    System.out.print("Enter a name to remove: ");
                    String removeName = input.nextLine();
                    if(removeStudent(students, removeName)){ 
                        System.out.println("Student removed successfully.");
                        printAllStudents(students);
                    }else{
                        System.out.println("Student does not exist.");
                    }
                    break;
                case 5:
                    System.out.print("Student's name: ");
                    String studentToUpdate = input.nextLine();
                    Student foundToUpdate = findStudent(students, studentToUpdate);
                    if(foundToUpdate != null){
                        System.out.print("Student's new grade: ");
                        int newGrade = input.nextInt();
                        updateStudent(foundToUpdate, newGrade);
                        System.out.print("New grade updated: ");
                        foundToUpdate.showInfo();
                    }else{
                        System.out.println("Student does not exist.");
                    }
                    break;
                case 6:
                    System.out.println("Goodbye! ");
                    return;
                default:
                    System.out.println("Invalid choice! ");
            }
        }
    }
}
