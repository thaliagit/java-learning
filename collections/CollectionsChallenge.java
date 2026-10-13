package collections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class CollectionsChallenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> players = new HashMap<>();

        while (true) {
            System.out.println("Select your options: ");
            System.out.println("1. Add a player.");
            System.out.println("2. Show player list.");
            System.out.println("3. Exit.");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Add player id: ");
                    boolean isInteger = input.hasNextInt();
                    if (isInteger) {
                        int playerID = input.nextInt();
                        if (playerID > 0) {
                            input.nextLine();
                            System.out.print("Add player's name: ");
                            String playerName = input.nextLine();

                            if (players.containsKey(playerID) || players.containsValue(playerName)) {
                                if (players.containsKey(playerID)) {
                                    System.out.println("That player ID already exists!");
                                } else {
                                    System.out.println("That name already exists!");
                                }

                            } else {
                                players.put(playerID, playerName);
                                System.out.println("Player: " + playerName + " has been added!");
                            }
                        } else {
                            input.nextLine();
                            System.out.println("Player ID must be a positive number!");
                            break;
                        }

                    } else {
                        System.out.println("Player ID has to be an integer.");
                        input.nextLine();
                    }
                    break;
                case "2":
                    if (players.isEmpty()) {
                        System.out.println("No players have been added in this list.");
                    } else {
                        System.out.println("Player List: ");
                        for (Map.Entry<Integer, String> entry : players.entrySet()) {
                            System.out.println("Player ID: " + entry.getKey() + " - Player Name: " + entry.getValue());
                        }
                    }

                    break;
                case "3":
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        }

    }
}
