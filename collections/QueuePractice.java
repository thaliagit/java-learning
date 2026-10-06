package collections;
import java.util.Queue;
import java.util.LinkedList;

public class QueuePractice {
    public static void main(String[] args){
        Queue<String> players = new LinkedList<>();
        players.add("Aragorn"); // <- adds to the queue
        players.add("Gandalf");
        players.add("Legolas");
        //String firstPlayer = players.poll(); <- removes and RETURNS first element out of the list
        String firstPlayer = players.peek(); // <- inspects the front of the list
        System.out.println(firstPlayer);

        System.out.println(players);
    }
}
