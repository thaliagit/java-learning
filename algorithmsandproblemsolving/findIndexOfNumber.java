package algorithmsandproblemsolving;

public class findIndexOfNumber {
    public static void main(String[] args) {
        int[] numbers = { 12, 5, 27, 9, 18, 5, 31 };

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 18) {
                System.out.println("Index of " + numbers[i] + " : " + i);
            }
        }
    }

}
