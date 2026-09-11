package arrays;
public class arrays4loopsmethods {
    static int sumOf(int[] array){
        int total = 0;
        for(int i = 0; i < array.length; i++){
            total = total + array[i];
        }
         return total;
    }
    public static void main(String[] args){
        int[] numbers = {5, 12, 66, 2, 34};
        System.out.println(sumOf(numbers));
    }
}
