package weekendTasks;
import java.util.ArrayList;

public class weekendtask9 {
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
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Anna", 43));
        students.add(new Student("Diego", 74));
        students.add(new Student("Jason", 89));

        for(int i = 0; i < students.size(); i++){
            students.get(i).printInfo();
        }
    }
}
