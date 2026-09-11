package miniProjects;

public class StudentAnalyticsSystem {
    public static class Student{
        String name;
        int grade;

        Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }

        void showInfo(){
            System.out.println(name + " -   " + grade);
        }

        boolean isPassing(){
            return this.grade >= 50;
        }
        String getName(){
            return name;
        }
    }
    static void printAllStudents(Student[] students){
            for(int i = 0; i < students.length; i++){
                students[i].showInfo();
            }
        }
    static int countPassingStudent(Student[] students){
        int counterPassedStudents = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].isPassing()){
                counterPassedStudents += 1;
            }
        }
        return counterPassedStudents;
    }
    static Student findBestStudent(Student[] students){
        int bestGrade = students[0].grade;
        Student bestStudent = students[0];
        for(int i = 0; i < students.length; i++){
            if(students[i].grade > bestGrade){
                bestGrade = students[i].grade;
                bestStudent = students[i];
            }
        }
        return bestStudent;
    }
    static double averageGrade(Student[] students){
        double sumGrades = 0;
        for(int i = 0; i < students.length; i++){
            sumGrades += students[i].grade;
        }
        return sumGrades / students.length;
    }
    static int getHighestGrade(Student[] students){
        int highest = students[0].grade;
        for(int i = 0; i < students.length; i++){
            if(students[i].grade > highest){
                highest = students[i].grade;
            }
        }
        return highest;
    }
    static int countExcellent(Student[] students){
        int excellentCounter = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].grade >= 90){
                excellentCounter++;
            }
        }
        return excellentCounter;
    }
    static void printSummary(Student[] students){
        int excellent = countExcellent(students);
        int passed = countPassingStudent(students);
        int failed = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].grade < 50){
                failed++;
            }
        }

        System.out.println("Excellent: " + excellent);
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
    }
    public static void main(String[] args){
        Student[] students = new Student[4];
        students[0] = new Student("Felipe", 62);
        students[1] = new Student("Bonnie", 89);
        students[2] = new Student("Jason", 93);
        students[3] = new Student("Jessica", 34);
        Student best = findBestStudent(students);
        printAllStudents(students);
        System.out.println("Total students passed: " + countPassingStudent(students));
        System.out.println("Best student is: " + best.name);
        System.out.println("The average grade is: " + averageGrade(students));
        System.out.println("Highest grade: " + getHighestGrade(students));
        System.out.println("How many excellent students: " + countExcellent(students));
        printSummary(students);

        for(int i = 0; i < students.length; i++){
            if(students[i].isPassing()){
                System.out.println(students[i].getName() + " PASS");
            }else{
                System.out.println(students[i].getName() + " FAIL");
            }
            
        }

        
    }
}
