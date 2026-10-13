package algorithmsandproblemsolving;

public class countNegativeNumbers {
    public static void main(String[] args){
        int[] numbers = {7, -4, 0, -12, 9, -1, 6, -8};
        int negativeNumbersCounter = 0;
        for(int number : numbers){
            if(number < 0){
                negativeNumbersCounter+= 1;
            }
        }
        System.out.println("Negative Numbers: " + negativeNumbersCounter);
    }
}
