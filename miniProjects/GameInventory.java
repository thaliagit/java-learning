package miniProjects;
import java.util.Scanner;
import java.util.ArrayList;
public class GameInventory {
    public static class Item{
        String name;
        int power;

        Item(String name, int power){
            this.name = name;
            this.power = power;
        }

        void showItemInfo(){
            System.out.println("Item: " + name + " - Power: " + power);
        }
    }
    // public static Item addItem(ArrayList<Item> items, String itemName, int itemPower){
    //     for(int i = 1; i < items.size(); i++){
    //         if(items.get(i).name.equals(itemName)){
    //             System.out.println("Item already exists.");
    //             return null;
    //         }else{
    //             return items.add(new Item(itemName, itemPower));
    //         }
    //     }
    //     return null;
    // }
    public static Item findItem(ArrayList<Item> items, String itemName){
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).name.equals(itemName)){
                return items.get(i);
            }
        }
        return null;
    }
    public static Item findStrongest(ArrayList<Item> items){
        Item strongestItem = items.get(0);
        for(int i = 1; i < items.size(); i++){
            if(strongestItem.power < items.get(i).power){
                strongestItem = items.get(i);
            }
        }
        return strongestItem;
    }
    public static void main(String[] args){
        //using Scanner class:
        Scanner input = new Scanner(System.in);

        //creating array list & adding objects:
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Hammer", 15));
        items.add(new Item("Staff", 12));
        items.add(new Item("Dagger", 6));
        items.add(new Item("Greatsword", 20));
        items.add(new Item("Bow", 3));
         
        while(true){
            //creating menu prints:
            System.out.println("<<<<<<<<<< M E N U >>>>>>>>>>");
            System.out.println("1. Show all items.");
            System.out.println("2. Add an item.");
            System.out.println("3. Find an item.");
            System.out.println("4. Remove an item.");
            System.out.println("5. Upgrade item power.");
            System.out.println("6. Show strongest item.");
            System.out.println("7. Exit.");
            System.out.print("Your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Items' Summary: ");
                    for(int i = 0; i < items.size(); i++){
                        items.get(i).showItemInfo();
                    }
                    break;
                case 2:
                    System.out.print("Name of new item: ");
                    String itemName = input.nextLine();
                    System.out.print("Item power: ");
                    int itemPower = input.nextInt();
                    if(itemPower <= 20){
                        items.add(new Item(itemName, itemPower));
                    }else{
                        System.out.println("Weapons cannot be this powerful!");
                    }
                    break;
                case 3:
                    System.out.print("Search item name: ");
                    String findItemName = input.nextLine();
                    Item found = findItem(items, findItemName);
                    if(found != null){
                        found.showItemInfo();
                    }else{
                        System.out.println("Item does not exist.");
                    }
                    break;
                case 4:
                    System.out.print("Name of item to remove: ");
                    String itemToRemove = input.nextLine();
                    Item findItemToRemove = findItem(items, itemToRemove);
                    if(findItemToRemove != null){
                        items.remove(findItemToRemove);
                        System.out.println("Item removed successfully!");
                    }else{
                        System.out.println("Item does not exist.");
                    }
                    break;
                case 5:
                    System.out.print("Item's name: ");
                    String itemToUpgrade = input.nextLine();
                    Item findItemToUpgrade = findItem(items, itemToUpgrade);
                    if(findItemToUpgrade != null){
                        System.out.print("Insert amount of power: ");
                        int newPower = input.nextInt();
                        findItemToUpgrade.power = newPower;
                        System.out.println("Item upgraded!");
                        findItemToUpgrade.showItemInfo();
                    }else{
                        System.out.println("Item does not exist.");
                    }
                    break;
                case 6:
                    findStrongest(items).showItemInfo();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
