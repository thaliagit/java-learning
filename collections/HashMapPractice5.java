package collections;

import java.util.HashMap;

public class HashMapPractice5 {
    public static void main(String[] args){
        HashMap<String, Integer> playerLevels = new HashMap<>();
        playerLevels.put("Lilly", 28);
        playerLevels.put("Alex", 42);
        playerLevels.put("Maria", 15);
        playerLevels.put("John", 31);

        System.out.println("Maria's level: " + playerLevels.get("Maria"));
        playerLevels.put("John", 35);
        playerLevels.containsKey("Alex");
        playerLevels.containsKey("Sarah");
        playerLevels.remove("Lilly");
        System.out.println("Is Lilly here? " + playerLevels.containsKey("Lilly"));
        playerLevels.put("Sarah", 20);
        System.out.println(playerLevels);
        
    }
}
