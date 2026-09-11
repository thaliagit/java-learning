import java.util.ArrayList;
import java.util.Scanner;
public class StudentFilterPractice2 {

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
    // M E T H O D S  C R E A T E D:
    public static ArrayList<Student> studentsAboveGrade(ArrayList<Student> students, int inputGrade){
        ArrayList<Student> studentsAboveGrade = new ArrayList<>();

        for(Student student : students){
            if(student.grade >= inputGrade){
                studentsAboveGrade.add(student);
            }
        }
        return studentsAboveGrade;
    }
    public static ArrayList<Student> passingStudentsList(ArrayList<Student> students){
        ArrayList<Student> passingStudents = new ArrayList<>();
        for(Student student : students){
            if(student.grade >= 50){
                passingStudents.add(student);
            }
        }
        return passingStudents;
    }
    public static int passingStudentsCounter(ArrayList<Student> students){
        int passingStudentsCount = 0;
        for(Student student : students){
            if(student.grade >= 50){
                passingStudentsCount++;
            }
        }
        return passingStudentsCount;
    }
    public static int findHighestGrade(ArrayList<Student> students){
        int highestGrade = students.get(0).grade;
        for(Student student : students){
            if(highestGrade < student.grade){
                highestGrade = student.grade;
            }
        }
        return highestGrade;
    }
    public static int findLowestGrade(ArrayList<Student> students){
        int lowestGrade = students.get(0).grade;
        for(Student student : students){
            if(lowestGrade > student.grade){
                lowestGrade = student.grade;
            }
        }
        return lowestGrade;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student("Daenerys", 42));
        students.add(new Student("Alex", 96));
        students.add(new Student("Walter", 21));
        students.add(new Student("Alice", 81));
        students.add(new Student("Aragorn", 73));

        //return students filtered above the selected grade:
        System.out.print("Insert the grade filter: ");
        int gradeAndAbove = input.nextInt();
        
        ArrayList<Student> studentsAboveGradeList = studentsAboveGrade(students, gradeAndAbove);
        System.out.println("Students above grade " + gradeAndAbove + ": ");
        for(Student studentAbove : studentsAboveGradeList){
            studentAbove.printInfo();
        }
        
        //prints info of every student:
        System.out.println("~ ~ ~ Students ~ ~ ~");
        for(Student student : students){
            student.printInfo();
        }

        //prints passing students:
        System.out.println("PASSING STUDENTS: ");
        ArrayList<Student> passingList = passingStudentsList(students);
        for(Student student : passingList){
            student.printInfo();
        }
        //prints & calls on methods:
        System.out.println("Total Passing Students: " + passingStudentsCounter(students));
        System.out.println("Highest Grade: " + findHighestGrade(students));
        System.out.println("Lowest Grade: " + findLowestGrade(students));
        input.close();
    }
}