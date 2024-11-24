package Exercises.RockPaperScissors;

import Utils.RockPaperScissors_Tools;

public class Robot {
    private int robotChoice;
    private String actualRobotChoice;

    public Robot() {
        this.robotChoice = RockPaperScissors_Tools.randomChoice();
        this.actualRobotChoice = RockPaperScissors_Tools.actualChoise(robotChoice);
    }

    public String getActualRobotChoice() {
        return actualRobotChoice;
    }

    public int getRobotChoice() {return robotChoice;}
}
