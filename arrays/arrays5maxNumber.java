package arrays;
public class arrays5maxNumber {
    public static void main(String[] args){
        int[] numbers = {5, 12, 66, 2, 34};
        //int maxNum = 0;
        int maxNum = numbers[0];
        for(int i = 1; i < numbers.length; i++){ //we start at numbers[0] already at the initialization so we dont need to set i to 0, int = 1
            if(numbers[i] > maxNum){
                maxNum = numbers[i];
            }
        }
        System.out.println("The maximum number is: " + maxNum);
    }

}
