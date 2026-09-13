package collections;

import java.util.HashMap;

public class HashMapPractice3 {
    static public void main(String[] args){
        HashMap<Integer, Integer> scores = new HashMap<>();
        scores.put(1, 850);
        scores.put(2, 1200);
        scores.put(3, 650);
        scores.put(4, 1500);
        scores.put(5, 900);


        System.out.println("Score of player in entry 4: " + scores.get(4));
        scores.put(3, 1000);
        System.out.println(scores.containsKey(6));
        scores.remove(1);

        for(HashMap.Entry<Integer, Integer> entry : scores.entrySet()){
            System.out.println("Player: " + entry.getKey());
            System.out.println("Score: " + entry.getValue());
        }

    }
}
