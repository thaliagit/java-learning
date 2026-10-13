package collections;
import java.util.ArrayDeque;
import java.util.Deque;
public class StackPractice {
    public static void main(String[] args){
        Deque<String> players = new ArrayDeque<>();
        players.push("Aragorn"); // push() <- add to top!
        players.push("Gandalf");
        players.push("Legolas");
        String removedPlayer = players.pop(); // pop() <- removes the last in queue player which is Legolas!
        String returnTopPlayer = players.peek(); // peek() <- returns and DOES NOT REMOVE the player on top which is Gandalf!

        System.out.println(removedPlayer);
        System.out.println(returnTopPlayer);
        System.out.println(players);
    }
}
