package collections;
import java.util.HashMap;
public class HashMapPractice6 {
    public static void main(String[] args){
        HashMap<Integer, String> players = new HashMap<>();
        players.put(101, "Lilly");
        players.put(205, "Alex");
        players.put(317, "Maria");
        players.put(420, "John");
        players.put(555, "Sarah");

        boolean ifExists = players.containsKey(317);
        if(ifExists){
            System.out.println(players.get(317));
        }

        players.put(420, "James");
        System.out.println(players.get(420));
        players.remove(205);
        System.out.println(players.get(205));
        for(HashMap.Entry<Integer, String> entry : players.entrySet()){
            System.out.println("Number: " + entry.getKey() + " | Player: " + entry.getValue());
        }
        
    }
}
