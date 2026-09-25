package RockPapperScissorTask;

public class DTOInteraction {
    public String Player1Action;
    public String Player2Action;
    public String outcome;

    public DTOInteraction(
            String player1Action,
            String player2Action,
            String outcome
    ) {
        this.Player1Action = player1Action;
        this.Player2Action = player2Action;
        this.outcome = outcome;
    }

    public String getPlayer1Action() {
        return Player1Action;
    }

    public void setPlayer1Action(String player1Action) {
        Player1Action = player1Action;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public String getPlayer2Action() {
        return Player2Action;
    }

    public void setPlayer2Action(String player2Action) {
        Player2Action = player2Action;
    }
}
