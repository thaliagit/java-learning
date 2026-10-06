package collections;
import java.util.ArrayDeque;
import java.util.Deque;
public class StackPractice {
    public static void main(String[] args){
        Deque<String> players = new ArrayDeque<>();
        players.push("Aragorn");
        players.push("Gandalf");
        players.push("Legolas");
        String removedPlayer = players.pop(); // <- removes the last in queue player which is legolas

        System.out.println(removedPlayer);
        System.out.println(players);
    }
}
