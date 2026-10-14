package algorithmsandproblemsolving;

public class searchWithAresultFlag {
    public static void main(String[] args){
        int[] numbers = {12, 5, 27, 9, 31};
        boolean found = false;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 18){
                found = true;
                break;
            }
        }

        System.out.println("Number found: " + found);
    }
}
