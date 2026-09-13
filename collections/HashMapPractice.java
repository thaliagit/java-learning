package collections;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<Integer, String> players = new HashMap<>();
        players.put(82, "Bard");
        players.put(50, "Annie");
        players.put(18, "Vex");
        players.put(105, "Zed");
        players.put(34, "Seraphine");

        // Java interprets the second put() as:
        //"Key 18 already exists → update the value associated with it."
        //So now: 18 -> Ahri
        players.put(18, "Ahri");
        players.remove(18);

        System.out.println(players.get(18));

        //checks whether a key 
        System.out.println(players.containsKey(18));
        System.out.println(players.containsKey(999));
        System.out.println("THIS IS NEW PRACTICE OF GETTING BOTH ENTRIES: ");
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        //how to loop in HashMaps

        for(HashMap.Entry<Integer, String> entry : players.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}
