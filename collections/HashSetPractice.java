package collections;
import java.util.HashSet;
public class HashSetPractice {
    public static void main(String[] args){
        HashSet<String> games = new HashSet<>();
        games.add("League of Legends");
        games.add("Apex Legends");
        games.add("Pacman");
        games.add("Tetris");
        games.add("Minecraft");
        games.add("LEAGUE OF LEGENDS");
        games.add("Lost Ark");

        boolean added = games.add("League of Legends");

        for(String game : games){
            System.out.println(game);
        }

        System.out.println(added);
    }
}