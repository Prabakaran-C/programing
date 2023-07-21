package hackerrank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

      
        List<String> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter player " + (i + 1) + "'s name: ");
            String name = scanner.nextLine();
            players.add(name);
        }
        System.out.print("Enter the name of the starting player: ");
        String startingPlayer = scanner.nextLine();

     
        System.out.print("Enter the count of dice throws: ");
        int numThrows = scanner.nextInt();
        scanner.nextLine();

       
        int currentPlayerIndex = players.indexOf(startingPlayer);
        for (int i = 0; i < numThrows; i++) {
            System.out.print("Enter the value of dice throw " + (i + 1) + ": ");
            int diceValue = scanner.nextInt();
            scanner.nextLine();

            currentPlayerIndex = (currentPlayerIndex + diceValue) % numPlayers;
        }

     
        String loser = players.get(currentPlayerIndex);
        System.out.println("The loser is: " + loser);

        scanner.close();
    }
}