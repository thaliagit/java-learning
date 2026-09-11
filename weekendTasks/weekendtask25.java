package weekendTasks;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class weekendtask25 {
    public static class Character{
        String name;
        int level;

        Character(String name, int level){
            this.name = name;
            this.level = level;
        }

        public void showCharacterInfo(){
            System.out.println("Character name: " + name + " - Character level: " + level);
        }
    }
    public static ArrayList<Character> addCharacter(ArrayList<Character> characters, String nameOfNewCharacter, int levelOfNewCharacter){
        characters.add(new Character(nameOfNewCharacter, levelOfNewCharacter));
        System.out.println("New character has been added!");
        return characters;
    }
    public static Character findCharacter(ArrayList<Character> characters, String nameToFind){
        for(Character character : characters){
            if(nameToFind.equals(character.name)){
                return character;
            }
        }
        return null;
    }
    public static Character updateCharacter(Character characterToUpdate, int levelToUpdate){
        characterToUpdate.level = levelToUpdate;
        System.out.println("Level has been updated successfully!");

        return characterToUpdate;
    }
    public static ArrayList<Character> removeCharacter(ArrayList<Character> characters, Character charToDelete){
        characters.remove(charToDelete);

        return characters;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Show all characters: ");
        System.out.println("2. Add character: ");
        System.out.println("3. Find character: ");
        System.out.println("4. Remove character: ");
        System.out.println("5. Update character level: ");
        System.out.println("6. Exit: ");

        

        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new Character("Ted", 34));
        characters.add(new Character("Dany", 66));
        characters.add(new Character("Daemon", 23));
        characters.add(new Character("Jessica", 55));
        characters.add(new Character("Anna", 82));
        characters.add(new Character("Mark", 12));
        characters.add(new Character("Chan", 71));
        while(true){
            System.out.print("Select your choice: ");
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    for(Character character : characters){
                        character.showCharacterInfo();
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Insert Character name: ");
                    String newCharName = input.nextLine();
                    Character exists = findCharacter(characters, newCharName);
                    if(exists != null){
                        System.out.println("This character already exists!");
                        break;
                    }
                    try{
                        System.out.print("Character level: ");
                        int newCharLevel = input.nextInt();
                        if(newCharLevel > 0 && newCharLevel <= 100){
                            addCharacter(characters, newCharName, newCharLevel);
                        }else{
                            System.out.println("Character's level must be between 1 and 100!");
                            break;
                        }
                    }catch(InputMismatchException e){
                        System.out.println("Oops! Something went wrong. " + e);
                        input.nextLine();
                    }
                    
                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Which character name are you looking for? ");
                    String nameToFind = input.nextLine();
                    Character charSearch = findCharacter(characters, nameToFind);
                    if( charSearch!= null){
                        charSearch.showCharacterInfo();
                    }else{
                        System.out.println("This character does not exist!");
                    }
                    break;
                case 4:
                    input.nextLine();
                    System.out.print("Which character would you like to delete? ");
                    String charNameToDelete = input.nextLine();
                    Character charToDelete = findCharacter(characters, charNameToDelete);
                    if( charToDelete!= null){
                        removeCharacter(characters, charToDelete);
                        System.out.println("Character has been deleted successfully!");
                    }else{
                        System.out.println("This character does not exist!");
                    }
                    break;
                case 5:
                    input.nextLine();
                    System.out.print("Character name: ");
                    String nameToUpdate = input.nextLine();
                    Character foundToUpdate = findCharacter(characters, nameToUpdate);
                    if(foundToUpdate != null){
                        System.out.print("Insert new level: ");
                        int updateLevel = input.nextInt();
                        while(updateLevel <= 0 || updateLevel > 100){
                            System.out.print("The level must range between 1 and 100! Insert new level: ");
                            updateLevel = input.nextInt();
                        }
                        updateCharacter(foundToUpdate, updateLevel);
                    }else{
                        System.out.println("This character does not exist! ");
                    }
                    break;
                case 6:
                    System.out.print("Goodbye!");
                    return;
                default:
                    break;
            }
        }
        
    }
}
