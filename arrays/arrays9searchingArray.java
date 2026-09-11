package arrays;
public class arrays9searchingArray {
    public static boolean contains(int[] array , int num){
        boolean contain = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                contain = true;
            }
        }
        return contain;
    }
    public static void main(String[] args){
        int[] numbers = {5, 12, 66, 2, 34};
        int number = 66;
        System.out.println(contains(numbers, number));
    }
}
