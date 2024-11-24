package Exercises.RockPaperScissors;

import Utils.RockPaperScissors_Tools;

public class GameSession {
    private int roundsToWin;
    private int playerWins = 0;
    private int robotWins = 0;
    private OneRoundGame round;

    public GameSession() {
        this.roundsToWin = RockPaperScissors_Tools.roundsToWin();
        RockPaperScissors_Tools.playGame(roundsToWin, round);
    }
}




