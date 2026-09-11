import java.util.ArrayList;
import java.util.Scanner;

public class showpassingStudents {
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
    static Student passingStudents(ArrayList<Student> students){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).grade >= 50){
                return students.get(i);
            }
        }

        return null;
    }
    static int searchMinimumGradeStudents(ArrayList<Student> students, int minimumGrade){
        int studentsAboveMinGrade = 0;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).grade >= minimumGrade){
                studentsAboveMinGrade++;
            }
        }

        return studentsAboveMinGrade;
    }
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        students.add(new Student("Alex" , 97));
        students.add(new Student("Daenerys",    74));
        students.add(new Student("Daemon", 31));
        students.add(new Student("Alicent", 83));
        students.add(new Student("Aegon", 45));
        students.add(new Student("Ned", 90));
        
        
        while(true){
            System.out.println("~~~ MENU ~~~");
            System.out.println("1. Show students' summary.");
            System.out.println("2. Show passing students.");
            System.out.println("3. Search students based on grade.");
            System.out.println("4. Exit.");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice){
                case 1:
                    for(int i = 0; i < students.size(); i++){
                    students.get(i).printInfo();
                    }
                    break;
                case 2:
                    if(passingStudents(students) != null){
                        passingStudents(students).printInfo();
                    }else{
                        System.out.println("Oops! Something went wrong.");
                    }
                    break;
                case 3:
                    System.out.print("Enter minimum grade: ");
                    int gradeFilter = input.nextInt();
                    int studentsAboveMinGrade = searchMinimumGradeStudents(students, gradeFilter);
                    System.out.println("Students with grade greater or equal to " + gradeFilter + ": " + studentsAboveMinGrade);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }

    }
}
