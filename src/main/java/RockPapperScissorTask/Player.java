package RockPapperScissorTask;

public class Player {
    private PossibleActions action;

    public Player(PossibleActions action) {
        this.action = action;
    }

    public String getAction() {
        switch (this.action){
            case ROCK -> {
                return "rock";
            }
            case PAPER -> {
                return "paper";
            }
            case SCISSOR -> {
                return "scissors";
            }
            default -> {
                return "";
            }
        }
    }

    public void setAction(PossibleActions action) throws Exception {
        this.action = action;
    }

}
