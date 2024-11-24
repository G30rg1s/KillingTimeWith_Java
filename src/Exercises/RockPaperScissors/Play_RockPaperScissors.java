package Exercises.RockPaperScissors;

import Utils.RockPaperScissors_Tools;

public class Play_RockPaperScissors {
    private boolean playAgain;

    public Play_RockPaperScissors() {
        this.playAgain = true;
        System.out.println("Welcome to Rock-Paper-Scissors!");
        while (this.playAgain) {
            System.out.println("\nStarting a new game session...");
            new GameSession();
            this.playAgain = RockPaperScissors_Tools.askToPlayAgain();
        }
        System.out.println("Thank you for playing Rock-Paper-Scissors! Goodbye!");
    }
}
