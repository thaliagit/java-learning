package miniProjects;

public class StudentManagerV2 {
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
    public static void main(String[] args){
        Student[] students = new Student[4];
        students[0] = new Student("Felipe", 62);
        students[1] = new Student("Bonnie", 89);
        students[2] = new Student("Jason", 93);
        students[3] = new Student("Jessica", 34);
        printAllStudents(students);

        for(int i = 0; i < students.length; i++){
            if(students[i].isPassing()){
                System.out.println(students[i].getName() + " PASS");
            }else{
                System.out.println(students[i].getName() + " FAIL");
            }
            
        }

        
    }
}
