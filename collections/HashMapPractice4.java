package collections;

import java.util.HashMap;

public class HashMapPractice4 {
    static public void main(String[] args){
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Potion", 15);
        inventory.put("Arrow", 50);
        inventory.put("Sword", 3);
        inventory.put("Shield", 7);
        inventory.put("Food", 20);

        for(HashMap.Entry<String, Integer> entry : inventory.entrySet()){
            if(entry.getKey() == "Sword"){
                System.out.println("Sword value: " + entry.getValue());
            }
        }
        inventory.put("Potion" , 25);
        System.out.println("Does bow exist? " + inventory.containsKey("Bow"));
        inventory.remove("Shield");
        for(HashMap.Entry<String,Integer> entry : inventory.entrySet()){
            System.out.println("Item: " + entry.getKey() + " | Amount: " + entry.getValue());
        }
    }
}
