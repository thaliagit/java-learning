package collections;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(10);

        int a = numbers.poll(); // poll() stores and removes from the list the LOWEST number.
        int b = numbers.poll();
        System.out.println(a);
        System.out.println(b);
        System.out.println(numbers);

        // STRINGS
        PriorityQueue<String> players = new PriorityQueue<>();
        players.add("Legolas");
        players.add("Aragorn");
        players.add("Gandalf");

        // By default, a PriorityQueue<String> uses the strings' natural ordering, which
        // is alphabetical for these names.
        System.out.println(players.poll());
        System.out.println(players.poll());
        System.out.println(players.poll());
    }
}
