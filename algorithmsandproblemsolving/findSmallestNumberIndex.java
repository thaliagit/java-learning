package algorithmsandproblemsolving;

public class findSmallestNumberIndex {
    public static void main(String[] args){
        int[] numbers = {14, -3, 22, 0, -11, 5};
        int smallest = numbers[0];
        int indexOfsmallest = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
                indexOfsmallest = i;
                
            }
        }
        System.out.println("Index of smallest number - " + smallest + " : " + indexOfsmallest);
        
    }
}
