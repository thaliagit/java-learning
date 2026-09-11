package weekendTasks;
import java.util.ArrayList;
import java.util.Scanner;
public class weekendtask17 {
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
    //methods:
    public static ArrayList<Student> findStudentsAboveFilterGrade(ArrayList<Student> students, int gradeUserInput){
        ArrayList<Student> studentsAboveGradeList = new ArrayList<>();
        for(Student student : students){
            if(student.grade >= gradeUserInput){
                studentsAboveGradeList.add(student);
            }
        }

        return studentsAboveGradeList;
    }
    public static ArrayList<Student> findPassingStudents(ArrayList<Student> students){
        ArrayList<Student> passingStudentsList = new ArrayList<>();
        for(Student student : students){
            if(student.grade >= 50){
                passingStudentsList.add(student);
            }
        }
        return passingStudentsList;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jessie" , 31));
        students.add(new Student("Alex" , 53));
        students.add(new Student("Jon" , 98));
        students.add(new Student("Danny" , 22));
        students.add(new Student("Alice" , 43));
        students.add(new Student("Daemon" , 78));
        students.add(new Student("Phil" , 82));
        students.add(new Student("Claire" , 32));

        for(Student student : students){
            student.printStudentInfo();
        }

        System.out.print("Insert the grade to see students above that grade: ");
        int gradeFilter = input.nextInt();
        System.out.println("Students that above grade " + gradeFilter + ": ");
        ArrayList<Student> studentsAboveFilterGradeList = findStudentsAboveFilterGrade(students, gradeFilter);
        for(Student student : studentsAboveFilterGradeList){
            student.printStudentInfo();
        }

        System.out.println("Passing Students: ");
        ArrayList<Student> passedStudentsList = findPassingStudents(students);
        for(Student student : passedStudentsList){
            student.printStudentInfo();
        } 
    }
}
