package RockPapperScissorTask;

import java.util.Scanner;

public class Main {
    static void main() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How may rounds would you like to play");
        String rawNumRounds  = scanner.nextLine();
        int numRounds = Integer.parseInt(rawNumRounds);
        Game.gameLoop(numRounds);
    }
}
