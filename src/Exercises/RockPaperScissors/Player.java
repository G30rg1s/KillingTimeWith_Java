package Exercises.RockPaperScissors;

import Utils.RockPaperScissors_Tools;

public class Player {
    private int playerChoice;
    private String actualPlayerChoice;

    public Player() {
        this.playerChoice = RockPaperScissors_Tools.getPlayerChoice();
        this.actualPlayerChoice = RockPaperScissors_Tools.actualChoise(playerChoice);
    }

    public String getActualPlayerChoice() {return actualPlayerChoice;}

    public int getPlayerChoice() {return playerChoice;}
}
