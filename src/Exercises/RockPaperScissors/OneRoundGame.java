package Exercises.RockPaperScissors;

import Utils.RockPaperScissors_Tools;

public class OneRoundGame {
    private boolean playerWins;
    private boolean robotWins;
    private Player player;
    private Robot robot;

    public OneRoundGame() {
        this.player = new Player();
        this.robot = new Robot();

        int playerChoice = player.getPlayerChoice();
        String playerMove = player.getActualPlayerChoice();

        int robotChoice = robot.getRobotChoice();
        String robotMove = robot.getActualRobotChoice();

        System.out.println("Player choice: " + playerMove);
        System.out.println("Robot choice: " + robotMove);

        this.playerWins = RockPaperScissors_Tools.determineWinner(playerChoice, robotChoice);
        this.robotWins = RockPaperScissors_Tools.determineWinner(robotChoice, playerChoice);
    }

    public boolean didPlayerWin() {
        return this.playerWins;
    }

    public boolean didRobotWin() {
        return this.robotWins;
    }
}
