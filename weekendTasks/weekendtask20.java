package weekendTasks;
import java.util.Scanner;
import java.util.ArrayList;

public class weekendtask20 {
    public static class Student{
        String name;
        int grade;

        Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }

        void printStudentInfo(){
            System.out.println("Student: " + name + " - Grade: " + grade);
        }
    }
    public static Student findStudent(ArrayList<Student> students, String studentName){
        Student studentToFind = null;
        for(Student student : students){
            if(studentName.equals(student.name)){
                studentToFind = student;
            }
        }
        return studentToFind;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Jessie" , 31));
        students.add(new Student("Alex" , 53));
        students.add(new Student("Jon" , 20));
        students.add(new Student("Danny" , 22));
        students.add(new Student("Alice" , 43));
        students.add(new Student("Daemon" , 78));
        students.add(new Student("Phil" , 82));
        students.add(new Student("Claire" , 32));

        System.out.print("Student's name: ");
        String nameToSearch = input.nextLine();
        Student found = findStudent(students, nameToSearch);
        if(found != null){
            found.printStudentInfo();
        }else{
            System.out.println("Student does not exist.");
        }
    }
}
