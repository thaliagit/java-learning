package algorithmsandproblemsolving;

public class minNumber {
    public static void main(String[] args) {
        int[] numbers = {14, -3, 22, 0, 8, -11, 5};
        int minNumber = numbers[0];
        for (int number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        System.out.println(minNumber);
    }
}
