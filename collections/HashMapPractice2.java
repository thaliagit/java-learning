package collections;

import java.util.HashMap;

public class HashMapPractice2 {
    public static void main(String[] args){
        HashMap<Integer, String> games = new HashMap<>();
        games.put(1, "Lost Ark");
        games.put(2, "League of Legends");
        games.put(3, "Uncharted");
        games.put(4, "Aion");
        games.put(5, "R.E.P.O");
        games.put(6, "The Sims 3");

        System.out.println(games.get(3));
        games.put(3, "Apex Legends");
        System.out.println(games.get(3));

        System.out.print("Does key 5 exist? ");
        System.out.print(games.containsKey(5));

        games.remove(2);

        //looping:

        for(HashMap.Entry<Integer, String> entry : games.entrySet()){
            System.out.println(entry);
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }

    } 
    
}
