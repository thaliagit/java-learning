package algorithmsandproblemsolving;

public class sumEvenNumbers {
    public static void main(String[] args){
        int[] numbers = {3, 8, 2, 11, 6, 5, 10};
        int sumOfEvenNumbers = 0;
        for(int number : numbers){
            if(number%2 == 0){
                sumOfEvenNumbers += number;
            }
        }
        System.out.println("The sum of even numbers is: " + sumOfEvenNumbers); 
    }
}
