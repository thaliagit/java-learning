package algorithmsandproblemsolving;

public class maxNumber {
    public static void main(String[] args) {
        int[] numbers = { 12, 5, 27, 9, 18 };
        int maxNumber = numbers[0];
        for (int number : numbers) {
            if(number> maxNumber){
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
    }

}
