package algorithmsandproblemsolving;

public class findTheFirstOccurrence {
    public static void main(String[] args){
        int[] numbers = {12, 5, 18, 9, 18, 5, 31};
        int indexOfFirstOccurrence = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 18){
                indexOfFirstOccurrence = i;
                break;
            }
        }
        System.out.println("Index of first occurrence: " + indexOfFirstOccurrence);
    }
}
