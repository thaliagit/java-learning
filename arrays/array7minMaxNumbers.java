package arrays;
public class array7minMaxNumbers {
    public static void main(String[] args){
        int[] numbers = {5, 12, 66, 2, 34};
        int minNum = numbers[0];
        int maxNum = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(minNum > numbers[i]){
                minNum = numbers[i];
            }
            if(numbers[i] > maxNum){
                maxNum = numbers[i];
            }
        }
        System.out.println("Maximum: " + maxNum);
        System.out.println("Minimum: " + minNum);
    }
}
