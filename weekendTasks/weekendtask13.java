package weekendTasks;
import java.util.ArrayList;
public class weekendtask13 {
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
    public static int passingStudents(ArrayList<Student> students){
        int totalPassing = 0;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).grade >= 50){
                totalPassing++;
            }
        }
        return totalPassing;
    }
    public static double findAverageGrade(ArrayList<Student> students){
        int sumGrade = 0;
        for(int i = 0; i < students.size(); i++){
            sumGrade += students.get(i).grade;
        }
        return sumGrade / students.size();
    }
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex" , 97));
        students.add(new Student("Daenerys",    74));
        students.add(new Student("Daemon", 31));
        students.add(new Student("Alicent", 83));
        students.add(new Student("Aegon", 45));
        students.add(new Student("Ned", 90));

        int totalStudents = students.size();
        int passingStudents = passingStudents(students);
        int failingStudents = totalStudents - passingStudents;
        System.out.println("Total students: " + totalStudents);
        System.out.println("Students passing: " + passingStudents);
        System.out.println("Failing studets: " + failingStudents);
        System.out.println("Average Grade: " + findAverageGrade(students));


    }
}
