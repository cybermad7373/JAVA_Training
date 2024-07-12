package HandCricket;

import java.util.Random;
import java.util.Scanner;

class Player {
    public int score;     		// Score after each round
    public boolean batting;  	// Batting turn
    public char name;    		// Name of team
    public int target;   		// Target set for chasing team
    public int run;

    public Player(char c) {
        score = 0;
        batting = false;
        run = 0;
        name = c;
        target = 0;
    }

    public int getRun(Scanner scanner) {
        int run = -1;
        while(run < 0 || run > 6 || run == 5) {
            System.out.println(name + ", enter your run (0, 1, 2, 3, 4, 6): ");
            run = scanner.nextInt();
            if(run < 0 || run > 6 || run == 5) {
                System.out.println("Invalid input. Please enter a valid run.");
            }
        }
        return run;
    }
}

public class Main {

    public static void match(int rounds, Player currentPlayer, Player nextPlayer, Scanner scanner) {
        Player tempPlayer;
        for (int round = 1; round <= rounds; round++) {
            for (int ball = 0; ball < 6; ball++) {
                currentPlayer.batting = true;
                currentPlayer.run = currentPlayer.getRun(scanner);
                nextPlayer.run = nextPlayer.getRun(scanner);
                if (currentPlayer.run != nextPlayer.run) {
                    currentPlayer.score += currentPlayer.run;
                    System.out.println(currentPlayer.name + " throws " + currentPlayer.run + ", " + nextPlayer.name + " throws " + nextPlayer.run + ". " + currentPlayer.name + "'s score is " + currentPlayer.score);
                    if (currentPlayer.score > currentPlayer.target && currentPlayer.target != 0) {
                        System.out.println("Target of " + currentPlayer.target + " reached. Round over.");
                        break;
                    }
                } else {
                    System.out.println(currentPlayer.name + " throws " + currentPlayer.run + ", " + nextPlayer.name + " throws " + nextPlayer.run + ". " + currentPlayer.name + " is out.");
                    break;
                }
            }
            System.out.println(round + " Round over");
            currentPlayer.target = currentPlayer.score;  // Setting current player's score as target for opponent
            tempPlayer = currentPlayer;
            currentPlayer = nextPlayer;
            nextPlayer = tempPlayer;
            currentPlayer.score = 0; // Reset score for next player's innings
        }
        // Deciding the winner and TIE between teams
        if (currentPlayer.score > nextPlayer.target) {
            System.out.println(currentPlayer.name + " is the winner!");
        } else if (nextPlayer.score > currentPlayer.target) {
            System.out.println(nextPlayer.name + " is the winner!");
        } else {
            System.out.println("TIE");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rounds you need to play:");
        int rounds = scanner.nextInt();

        Player A = new Player('A');
        Player B = new Player('B');

        try {
            System.out.println("Enter the player who won the toss between A and B:");
            char playerFirst = scanner.next().charAt(0);

            if (playerFirst == 'A' || playerFirst == 'B') {
                if (playerFirst == 'A') {
                    match(rounds, A, B, scanner);
                } else if (playerFirst == 'B') {
                    match(rounds, B, A, scanner);
                }
            } else {
                throw new RuntimeException("Invalid input. Only char 'A' and 'B' expected.");
            }
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        } finally {
            scanner.close();
        }
    }
}
