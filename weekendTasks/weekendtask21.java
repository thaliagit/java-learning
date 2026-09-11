package weekendTasks;
import java.util.ArrayList;
import java.util.Scanner;

public class weekendtask21 {
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
    public static ArrayList<Student> filterBasedOnGrade(ArrayList<Student> students, int gradeFilter){
        ArrayList<Student> studentsAboveGrade = new ArrayList<>();
        for(Student student : students){
            if(student.grade >= gradeFilter){
                studentsAboveGrade.add(student);
            }
        }

        return studentsAboveGrade;
    }
    public static Student findStudent(ArrayList<Student> students, String studentName){
        for(Student student : students){
            if(student.name.equals(studentName)){
                return student;
            }
        }
        return null;
    }
    public static int countPassingStudents(ArrayList<Student> students){
        int passingCounter = 0;
        for(Student student : students){
            if(student.grade >= 50){
                passingCounter++;
            }
        }
        return passingCounter;
    }
    public static Student findMaxGradeStudent(ArrayList<Student> students){
        Student highestGradeStudent = students.get(0);
        for(Student student : students){
            if(highestGradeStudent.grade < student.grade){
                highestGradeStudent = student;

            }
        }
        return highestGradeStudent;
    }
    public static Student findMinGradeStudent(ArrayList<Student> students){
        Student lowestGradeStudent = students.get(0);
        for(Student student : students){
            if(lowestGradeStudent.grade > student.grade){
                lowestGradeStudent = student;
            }
        }
        return lowestGradeStudent;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        //ARRAYLIST STUDENTS
        students.add(new Student("Jessie" , 31));
        students.add(new Student("Alex" , 53));
        students.add(new Student("Jon" , 20));
        students.add(new Student("Danny" , 22));
        students.add(new Student("Alice" , 43));
        students.add(new Student("Daemon" , 78));
        students.add(new Student("Phil" , 82));
        students.add(new Student("Claire" , 32));

        //FILTER STUDENT METHOD
        System.out.print("Student's grade filter: ");
        int gradeToFilter = input.nextInt();
        input.nextLine();
        ArrayList<Student> studentsFilteredList = filterBasedOnGrade(students, gradeToFilter);
        for(Student student : studentsFilteredList){
            student.printStudentInfo();
        }

        //FIND STUDENT METHOD
        System.out.print("Student's name: ");
        String studentNameToSearch = input.nextLine();
        Student found = findStudent(students, studentNameToSearch);
        if(found != null){
            System.out.print("Student found: ");
            found.printStudentInfo();
        }else{
            System.out.println("Student does not exist!");
        }

        //COUNTER PASSING STUDENTS
        System.out.println("Total passing students: " + countPassingStudents(students));

        //MAX STUDENT
        System.out.print("Highest grade student: ");
        Student bestStudent = findMaxGradeStudent(students);
        bestStudent.printStudentInfo();

        //MIN STUDENT
        System.out.print("Lowest grade student: ");
        Student lowestStudent = findMinGradeStudent(students);
        lowestStudent.printStudentInfo();
    }
}
