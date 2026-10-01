package OOP.OOPTasks.MiniProjectOOP;

import java.util.ArrayList;

public class GameCharacterSystem {
    interface Healable {
        void heal();
    }

    public static abstract class Character {
        // COMPOSITION: Character HAS-A Weapon
        String name;
        int level;
        Weapon weapon;

        Character(String name, int level, Weapon weapon) {
            this.name = name;
            this.weapon = weapon;
            this.level = level;
        }

        abstract void attack();
    }

    public static class Warrior extends Character {
        // INHERITANCE: Warrior IS-A Character
        Warrior(String name, int level, Weapon weapon) {
            super(name, level, weapon);
        }

        @Override
        void attack() {
            System.out.println(weapon.name + " has inflicted " + weapon.getDamage() + " on you by warrior: " + name);
        }
    }

    public static class Mage extends Character implements Healable{
        // INHERITANCE: Mage IS-A Character
        // INTERFACE: Mage follows the Healable contract
        Mage(String name, int level, Weapon weapon){
            super(name, level, weapon);
        }

        @Override
        void attack() {
            System.out.println(weapon.name + " has inflicted " + weapon.getDamage() + " on you by mage: " + name);
        }
        public void heal(){
            System.out.println(name + " heals!");
        }
    }

    public static class Weapon {
        String name;
        private double damage;

        Weapon(String name, double damage) {
            this.name = name;
            this.damage = damage;
        }

        public double getDamage() {
            return damage;
        }
    }

    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        // POLYMORPHISM: collection can hold Character subclasses
        characters.add(new Warrior("Aragorn", 34, new Weapon("Greatsword", 50)));
        characters.add(new Mage("Gandalf", 56, new Weapon("Staff", 82)));

        for(Character character : characters){
            character.attack();
        }
        Mage mage = new Mage("Gandalf", 56, new Weapon("Staff", 82));
        mage.heal();

        ArrayList<Healable> healables = new ArrayList<>();
        healables.add(mage);
        for( Healable healable : healables){
            healable.heal();
        }
    }
}
//Current structure combines:

//🟦 Abstract class → Character
//🟩 Inheritance → Warrior, Mage
//🟨 Abstraction → abstract attack()
//🟧 Overriding → each class defines its own attack()
//🟥 Polymorphism → ArrayList<Character>
//🟪 Composition → Character HAS-A Weapon
//🔒 Encapsulation → damage is private + accessed through getDamage()
//🔼 super → subclasses initialize the inherited part through super(...)