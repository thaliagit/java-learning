package weekendTasks;
import java.util.ArrayList;

public class weekendtask19 {
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
    public static Student findHighestGradeStudent(ArrayList<Student> students){
        Student highestGradeStudent = students.get(0);
        for(Student student : students){
            if(highestGradeStudent.grade < student.grade){
                highestGradeStudent = student;
            }
        }
        return highestGradeStudent;
    }
     public static Student findLowestGradeStudent(ArrayList<Student> students){
        Student lowestGradeStudent = students.get(0);
        for(Student student : students){
            if(lowestGradeStudent.grade > student.grade){
                lowestGradeStudent = student;
            }
        }
        return lowestGradeStudent;
    }
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jessie" , 31));
        students.add(new Student("Alex" , 53));
        students.add(new Student("Jon" , 20));
        students.add(new Student("Danny" , 12));
        students.add(new Student("Alice" , 43));
        students.add(new Student("Daemon" , 78));
        students.add(new Student("Phil" , 82));
        students.add(new Student("Claire" , 32));

        Student bestStudent = findHighestGradeStudent(students);
        System.out.print("Best Student: ");
        bestStudent.printStudentInfo();
        Student worstStudent = findLowestGradeStudent(students);
        System.out.print("Worst Student: ");
        worstStudent.printStudentInfo();
    }
}
