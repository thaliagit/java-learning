package OOP.OOPTasks.Task1;
import java.util.ArrayList;

public class MixedOOPChallenge {
    interface Healable{
        void heal();
    }
    public static class Weapon{
        String name;
        double damage;
        Weapon(String name, double damage){
            this.name = name;
            this.damage = damage;
        }

        void use(){
            System.out.println(name + " deals " + damage + " damage.");
        }
    }
    public static abstract class Character{
        String name;
        Weapon weapon;
        Character(String name, Weapon weapon){
            this.name = name;
            this.weapon = weapon;
        }
        void showInfo(){
            System.out.println(name);
        }
        abstract void attack();
    }
    public static class Warrior extends Character{
        Warrior(String name, Weapon weapon){
            super(name, weapon);
        }
        @Override 
        void attack(){
            System.out.println("Warrior " + name + " attacks!");
            weapon.use();
        }
    }
    public static class Mage extends Character implements Healable{
        Mage(String name, Weapon weapon){
            super(name, weapon);
        }
        @Override 
        void attack(){
            System.out.println("Mage " + name + " attacks!");
            weapon.use();
        }
        public void heal(){
            System.out.println(name + " heals themselves!");
        }
    }
    
    public static void main(String[] args){
        Weapon greatsword = new Weapon("Greatsword", 50);
        Weapon spellbook = new Weapon("Spellbook", 80);
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new Warrior("Aragorn", greatsword));
        characters.add(new Mage("Gandalf", spellbook));
        for(Character character : characters){
            character.attack();
            if(character instanceof Mage){
                Mage mage = (Mage) character;
                mage.heal();
            }
        }

    }
}
