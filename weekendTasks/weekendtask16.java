package weekendTasks;
import java.util.ArrayList;
import java.util.Scanner;
public class weekendtask16 {
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
    
    public static Student updateStudent(ArrayList<Student> students, String studentName){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < students.size(); i++){
            if(studentName.equals(students.get(i).name)){
                System.out.print("New grade: ");
                int newGrade = input.nextInt();
                students.get(i).grade = newGrade;
                return students.get(i);
            }
        }
        return null;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex" , 97));
        students.add(new Student("Daenerys",    74));
        students.add(new Student("Daemon", 31));
        students.add(new Student("Alicent", 83));
        students.add(new Student("Aegon", 45));
        students.add(new Student("Ned", 90));
        
        
        for(int i = 0; i < students.size(); i++){
            students.get(i).printInfo();
        }
        
        System.out.println("Student's name: ");
        String studentName = input.nextLine();
        Student studentUpdated = updateStudent(students, studentName);
        if(studentUpdated != null){
            studentUpdated.printInfo();
        }

    }
}
