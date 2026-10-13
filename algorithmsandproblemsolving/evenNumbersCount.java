package algorithmsandproblemsolving;

public class evenNumbersCount {
    public static void main(String[] args){
        int[] numbers = {4, 7, 10, 3, 8, 11, 14, 5};
        int evenCounter = 0;
        for(int number : numbers){
            if(number%2 == 0){
                evenCounter+=1;
            }
        }
        System.out.println("Amount of even numbers: " + evenCounter);
    }
}
