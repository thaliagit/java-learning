package miniProjects;

public class StudentManagementSystem {
    public static class Student{
        String name;
        int grade;

        Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }

        void showInfo(){
            System.out.println(name + " - Grade: " + grade);
        }
        boolean isPassing(){
            return this.grade >= 50;
        }
        void study(){
            if(this.grade > 95){
                this.grade = 100;
            }else{
                this.grade += 5;
            }
            System.out.println(this.grade);
        }
        void takeExam(){
            if(this.grade >= 90){
                this.grade = 100;
            }else{
                this.grade += 10;
            }
            System.out.println(this.grade);
        }
    }
    public static void main(String[] args){
        Student[] students = new Student[5];
        students[0] = new Student("Alex", 89);
        students[1] = new Student("Jessie", 62);
        students[2] = new Student("Bonnie", 43);
        students[3] = new Student("Tom", 97);
        students[4] = new Student("Jerry", 32);

        int passedTotal = 0;
        for(int i = 0; i < students.length; i++){
            students[i].showInfo();
            if(students[i].isPassing()){
                passedTotal += 1;
            }
        }
        System.out.println(students[1].grade);
        System.out.println(students[3].grade);
        students[1].study();
        System.out.println("Students passing: " + passedTotal);
        System.out.println(students[1].grade);
    }
}
