package weekendTasks;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class weekendtask18 {
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
    public static ArrayList<Student> passingStudents(ArrayList<Student> students){
        ArrayList<Student> passingStudents = new ArrayList<>();
        for(Student student : students){
            if(student.grade >= 50){
                passingStudents.add(student);
            }
        }
        return passingStudents;
    }
    public static int countPassingStudents(ArrayList<Student> students){
        int passingStudentsCounter = 0;
        for(Student student : students){
            if(student.grade >= 50){
                passingStudentsCounter++;
            }
        }
        return passingStudentsCounter;
    }
    public static ArrayList<Student> failingStudents(ArrayList<Student> students){
        ArrayList<Student> failingStudents = new ArrayList<>();
        for(Student student : students){
            if(student.grade < 50){
                failingStudents.add(student);
            }
        }

        return failingStudents;
    }
    public static int countFailingStudents(ArrayList<Student> students, int passingStudentsCounter){
        return students.size() - passingStudentsCounter;
    }
    public static double averageGrade(ArrayList<Student> students){
        double gradeSum = 0;
        for(Student student : students){
            gradeSum += student.grade;
        }

        return gradeSum / students.size();
    }
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jessie" , 31));
        students.add(new Student("Alex" , 53));
        students.add(new Student("Jon" , 20));
        students.add(new Student("Danny" , 22));
        students.add(new Student("Alice" , 43));
        students.add(new Student("Daemon" , 78));
        students.add(new Student("Phil" , 82));
        students.add(new Student("Claire" , 32));

        System.out.println("SUMMARY: ");
        ArrayList<Student> passingStudentsList = passingStudents(students);
        System.out.println("Passing Students: ");
        for(Student student : passingStudentsList){
            student.printStudentInfo();
        }
        System.out.println("Total Passing Students: " + countPassingStudents(students));
        System.out.println("Failing Students: ");
        ArrayList<Student> failingStudentsList = failingStudents(students);
        for(Student student : failingStudentsList){
            student.printStudentInfo();
        }
        System.out.println("Total Failing Students: " + countFailingStudents(students, countPassingStudents(students)));
        System.out.println("Average grade: " + averageGrade(students));

    }
}
