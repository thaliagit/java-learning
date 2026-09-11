package miniProjects;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
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
    public static Student findStudent(ArrayList<Student> students, String input){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).name.equals(input)){
                return students.get(i);
            }
        }
        return null;
    }
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        students.add(new Student("Alex", 93));
        students.add(new Student("Mike", 34));
        students.add(new Student("Claire", 86));

        while(true){
            System.out.println("\n===== MENU ======");
            System.out.println("1. Show all students.");
            System.out.println("2. Add a student.");
            System.out.println("3. Find a student.");
            System.out.println("4. Remove a student.");
            System.out.println("5. Update student's grade.");
            System.out.println("6. Exit.");
            System.out.print("Your choice: ");
            int choice = input.nextInt();
            input.nextLine(); //reset buffer right?

            switch (choice) {
                case 1:
                    for(int i = 0; i < students.size(); i++){
                        students.get(i).showInfo();
                    }
                    break;
                case 2:
                    System.out.print("Student's name: ");
                    String name = input.nextLine();
                    System.out.print("Student's grade: ");
                    int grade = input.nextInt();
                    input.nextLine();
                    students.add(new Student(name, grade));
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
                    System.out.println("Enter a name to remove: ");
                    String removeName = input.nextLine();
                    Student toRemove = findStudent(students, removeName);
                    if(toRemove != null){ //if(findStudent(students, removeName != null)){students.remove(findStudent(students, removeName))} 
                                                        // !!! I did this at the start but its bad practice as it runs the loop in findStudent() twice!!!
                        students.remove(toRemove);
                        System.out.println("Student removed successfully.");
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
                        foundToUpdate.grade = newGrade;
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
