package algorithmsandproblemsolving;

public class countOccurrences {
    public static void main(String[] args){
        int[] numbers = {4, 7, 4, 2, 4, 9, 7, 4};
        int counter = 0;
        for(int number : numbers){
            if(number == 4){
                counter+= 1;
            }
        }
        System.out.println("Number of occurrences: " + counter);
    }
}
