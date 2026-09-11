package weekendTasks;
import java.util.Scanner;
import java.util.ArrayList;

public class weekendtask10 {
    public static class Student{
        String name;
        int grade;

        Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }
    }
    static Student findStudent(ArrayList<Student> students, String name){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).name.equals(name)){
                return students.get(i);
            }
        }
        return null;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 89));
        students.add(new Student("Natalie", 32));
        students.add(new Student("Jon", 76));
        
        System.out.print("Student's name: ");
        String inp = input.nextLine();
        Student studentToSearch = findStudent(students, inp);
        if(studentToSearch != null){
            System.out.println("Student found: " + studentToSearch.name);
        }else{
            System.out.println("Student not found!");
        }
        input.close();
    }
    
}
