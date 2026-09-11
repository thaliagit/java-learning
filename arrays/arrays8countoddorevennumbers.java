package arrays;
public class arrays8countoddorevennumbers {
    public static void main(String[] args){
        int[] numbers = {5, 12, 66, 2, 34, 9, 11};
        int oddCounter = 0;
        int evenCounter = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 == 0){
                evenCounter+= 1;
            }else{
                oddCounter+= 1;
            }
        }

        System.out.println("Odds: "+ oddCounter);
        System.out.println("Evens: " + evenCounter);
    }
}
