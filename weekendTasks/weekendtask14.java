package weekendTasks;
import java.util.ArrayList;
public class weekendtask14 {
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
    public static Student findBestStudent(ArrayList<Student> students){
        int bestGrade = students.get(0).grade;
        Student bestStudent = students.get(0);
        for(int i = 0; i < students.size(); i++){
            if(bestGrade < students.get(i).grade){
                bestGrade = students.get(i).grade;
                bestStudent = students.get(i);
            }
        }

        return bestStudent;
    }
    
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex" , 97));
        students.add(new Student("Daenerys",    74));
        students.add(new Student("Daemon", 31));
        students.add(new Student("Alicent", 83));
        students.add(new Student("Aegon", 45));
        students.add(new Student("Ned", 90));
        Student best = findBestStudent(students);
        System.out.println("Best Student: " + best.name + " - Grade: " + best.grade);
        //idk why I get error when I try to use best.showInfo(); even though i can reach name and grade ? ? ?

    }
}
