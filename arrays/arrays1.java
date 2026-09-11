package arrays;
public class arrays1 {
    public static void main(String[] args){
        String[] names = {"Anna", "Jessie", "Philip", "Alex", "Rachel"};
        System.out.println(names[0]);
        //System.out.println(names[4]); hardcoded the line below is more flexible:
        System.out.println(names[names.length - 1]);
        //System.out.println(names[names.length]); array.length = total array element number: -1 means last element
    }
}
