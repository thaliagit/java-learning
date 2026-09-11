package weekendTasks;
import java.util.ArrayList;
public class weekendtask15 {
 
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
    public static Student findWorstStudent(ArrayList<Student> students){
        int worstGrade = students.get(0).grade;
        Student worstStudent = students.get(0);
        for(int i = 0; i < students.size(); i++){
            if(worstGrade > students.get(i).grade){
                worstGrade = students.get(i).grade;
                worstStudent = students.get(i);
            }
        }

        return worstStudent;
    }
    
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex" , 97));
        students.add(new Student("Daenerys",    74));
        students.add(new Student("Daemon", 31));
        students.add(new Student("Alicent", 83));
        students.add(new Student("Aegon", 45));
        students.add(new Student("Ned", 90));
        Student worst = findWorstStudent(students);
        System.out.print("Worst Student: ");
        worst.printInfo();
        //idk why I get error when I try to use worst.showInfo(); even though i can reach name and grade INSIDE THE PRINT ? ? ?

    }


}
