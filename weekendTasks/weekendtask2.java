package weekendTasks;
public class weekendtask2 {
    public static void main(String[] args){
        int[] numbers = {10, 5, 8, 20, 3};
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("Maximum number is: " + max);
    }
}
