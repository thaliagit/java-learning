package algorithmsandproblemsolving;

public class findAnumber {
    public static void main(String[] args) {
        int[] numbers = { 12, 5, 27, 9, 18, 5, 31 };
        boolean isExisting = false;
        for (int number : numbers) {
            if (number == 18) {
                isExisting = true;
            }
        }
         System.out.print("Number found: " + isExisting);
    }
}
