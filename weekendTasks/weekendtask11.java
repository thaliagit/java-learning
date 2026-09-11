package weekendTasks;
import java.util.Scanner;
import java.util.ArrayList;
public class weekendtask11 {
    public static class Student{
        String name;
        int grade;

        Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }
    }

    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("****************** M E N U ******************");
        System.out.println("1. Add Student.");
        System.out.println("2. Show students.");
        System.out.println("3. Exit.");
        
        while(true){
            System.out.print("Number of choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Name of student: ");
                    String name = input.nextLine();
                    System.out.print("Grade of student: ");
                    int grade = input.nextInt();
                    students.add(new Student(name, grade));
                    break;
                case 2:
                    for(int i = 0; i < students.size(); i++){
                        System.out.println("Student: " + students.get(i).name + " - Grade: " + students.get(i).grade);
                    }
                    break;
                case 3:
                    System.out.print("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid information.");
                    break;
            }
        }
    }
}
