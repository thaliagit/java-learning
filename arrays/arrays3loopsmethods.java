package arrays;
public class arrays3loopsmethods {
    static void multiply2(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] * 2);
        }
    }
    public static void main(String[] args){
        int[] numbers = {5, 12, 66, 2, 34};
        multiply2(numbers);
    }
}
