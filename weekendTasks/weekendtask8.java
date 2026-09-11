package weekendTasks;
public class weekendtask8 {
    public static class Student{
        String name;
        int grade;

        Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }

        boolean isPassing(){
            if(grade >= 50){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args){
        Student[] students = new Student[3];
        students[0] = new Student("Elsa", 43);
        students[1] = new Student("Diego", 90);
        students[2] = new Student("Alex", 75);

        for(int i = 0; i < students.length; i++){
            if(students[i].isPassing()){
                System.out.println(students[i].name + " has passed!");
            }else{
                System.out.println(students[i].name + " has failed.");
            }
        }
    }
}
