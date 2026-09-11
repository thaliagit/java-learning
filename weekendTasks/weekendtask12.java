package weekendTasks;
import java.util.Scanner;
import java.util.ArrayList;

public class weekendtask12 {
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
    public static Student findStudent(ArrayList<Student> students, String studentName){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).name.equals(studentName)){
                return students.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex" , 93));
        students.add(new Student("Mike" , 34));
        students.add(new Student("Jessica" , 14));
        students.add(new Student("Barbara" , 53));

        System.out.print("Student name: ");
        String inp = input.nextLine();
        Student studentToSearch = findStudent(students, inp);
        if(studentToSearch != null){
            System.out.println("Student found! ");
            students.remove(studentToSearch);
            System.out.println("Student removed successfully!");
        }else{
            System.out.println("Student does not exist.");
        }

        //just to test if it really works and removes the student from the array list.
        for(int i = 0; i < students.size(); i++){
            students.get(i).printInfo();
        }
    }
}
