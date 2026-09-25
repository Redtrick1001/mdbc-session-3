package RockPapperScissorTask;

public enum PossibleActions {
    ROCK("rock"),
    PAPER("paper"),
    SCISSOR("scissor");

    final public String action;

    PossibleActions(String action) {
        this.action = action;
    }
}
