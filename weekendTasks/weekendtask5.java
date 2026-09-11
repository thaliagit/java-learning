package weekendTasks;
public class weekendtask5 {
    public static void main(String[] args){
        int[] numbers = {10, 5, 8, 20, 3};
        int evenTotal = 0;
        int oddTotal = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 == 0){
                evenTotal+= 1;
            }else{
                oddTotal+= 1;
            }
        }
        System.out.println("Even numbers total: " + evenTotal);
        System.out.println("Odd numbers total: " + oddTotal);
    }
}
