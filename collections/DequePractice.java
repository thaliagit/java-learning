package collections;
import java.util.ArrayDeque;
import java.util.Deque;
public class DequePractice {
     public static void main(String[] args) {

        Deque<String> players = new ArrayDeque<>();
        players.addFirst("Aragorn"); // addFirst() <- put an element AT THE FRONT.
        players.addLast("Gandalf"); // addLast() <- put an element AT THE BACK.
        players.addLast("Legolas");
        String removed = players.removeFirst(); // removeFirst() <- removes the element AT THE FRONT.
        String removeLast = players.removeLast(); // removeLast() <- removes the element AT THE BACK.
        String peekLast = players.peekLast(); // peekLast() <- returns the element AT THE BACK. (does not remove it)
        System.out.println(removed);
        System.out.println(removeLast);
    }
}
