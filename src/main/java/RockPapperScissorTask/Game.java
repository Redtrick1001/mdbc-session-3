package RockPapperScissorTask;

import java.util.Scanner;

public class Game {

    public static void gameLoop(int numOfRound) throws Exception {
        int playerWins = 0;
        int computerWins = 0;
        int roundCounter = 0;

        while (true) {
            Game game = new Game();
            Player player = new Player(game.getPlayerAction());
            System.out.println("player = " + player.getAction());
            Player computer = new Player(game.getComputerAction());
            System.out.println("computer = " + computer.getAction());

            String result = game.round(player, computer);
            roundCounter++;

            if (result.equalsIgnoreCase("player 1 wins")) {
                playerWins++;
                System.out.println("You won this round");
            } else if (result.equalsIgnoreCase("player 2 wins")) {
                computerWins++;
                System.out.println("You lost this round");
            } else {
                System.out.println("There was a draw");
            }
            System.out.println("Score: " + playerWins + " - " + computerWins);
            System.out.println("----------------------------------------------");

            if (roundCounter == numOfRound) {
                System.out.println("All rounds played");

                break;
            }
        }

        System.out.println("==============================================");

        if (computerWins < playerWins) {
            System.out.println("You wins");
        } else if (computerWins > playerWins) {
            System.out.println("Computer wins");
        } else {
            System.out.println("It was a draw");
        }

    }


    public String round(Player player1, Player player2) throws Exception {
        if (player1.getAction().isEmpty() || player2.getAction().isEmpty()) {
            throw new Exception("plays not initialised ");
        }

        final DTOInteraction[] interactions = new DTOInteraction[]{
                new DTOInteraction("rock", "rock", "draw"),
                new DTOInteraction("rock", "paper", "player 2 wins"),
                new DTOInteraction("rock", "scissors", "player 1 wins"),
                new DTOInteraction("paper", "rock", "player 1 wins"),
                new DTOInteraction("paper", "paper", "draw"),
                new DTOInteraction("paper", "scissors", "player 2 wins"),
                new DTOInteraction("scissors", "rock", "player 2 wins"),
                new DTOInteraction("scissors", "paper", "player 1 wins"),
                new DTOInteraction("scissors", "scissors", "draw")
        };

        for (DTOInteraction interaction: interactions) {
            if (
                    (interaction.getPlayer1Action().equals(player1.getAction())) &&
                    (interaction.getPlayer2Action().equals(player2.getAction()))
            ) {
                return interaction.outcome;
            }
        }

       return "outcome not found";
    }

    public PossibleActions getPlayerAction() {
        Scanner scanner = new Scanner(System.in);
        PossibleActions choice;
        while (true) {
            System.out.println("What would you like to do");
            String playerInput = scanner.nextLine();

            switch (playerInput.toLowerCase()) {
                case "rock" -> {
                    choice = PossibleActions.ROCK;
                }
                case "paper" -> {
                    choice = PossibleActions.PAPER;
                }
                case "scissor" -> {
                    choice = PossibleActions.SCISSOR;
                }
                default -> {
                    System.out.println("not a valid input");
                    continue;
                }
            }
            break;
        }
        return choice;
    }

    public PossibleActions getComputerAction() throws Exception {
        double ComputerChoice = Math.floor(Math.random() * 3);
        if (ComputerChoice <= 1) {
            return PossibleActions.ROCK;
        } else if (ComputerChoice <=2) {
            return PossibleActions.PAPER;
        } else if (ComputerChoice <= 3) {
            return PossibleActions.SCISSOR;
        } else {
            throw new Exception("Some thing went wrong with you computer");
        }
    }
}
