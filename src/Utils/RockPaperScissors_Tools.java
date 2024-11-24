package Utils;

import Exercises.RockPaperScissors.OneRoundGame;

import java.util.Scanner;

public class RockPaperScissors_Tools {

    public static int getPlayerChoice() {
        Scanner scannerPlayerChoise = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Enter your choice: 1 for Rock, 2 for Scissors, 3 for Paper:");
            choice = scannerPlayerChoise.nextInt();
            if (choice >= 1 && choice <= 4) {
                break;
            } else {
                System.out.println("Invalid choice. Please choose a number between 1 and 3.");
            }
        }
        return choice;
    }

    public static int randomChoice() {
        return (int) (Math.random() * 3) + 1;
    }

    public static String actualChoise(int choice) {
        switch (choice) {
            case 1:
                return "ROCK";
            case 2:
                return "SCISSORS";
            case 3:
                return "PAPER";
            default:
                return "MOVE DONT EXIST";
        }
    }

    public static boolean determineWinner(int playerChoice, int robotChoice) {
        if (playerChoice == robotChoice) {
            return false;
        } else if (
                (playerChoice == 1 && (robotChoice == 2)) ||
                        (playerChoice == 2 && (robotChoice == 3 )) ||
                        (playerChoice == 3 && (robotChoice == 1))
        ) {
            System.out.println("Player wins this round!");
            return true;
        } else {
            System.out.println("Robot wins this round!");
            return false;
        }
    }

    public static int roundsToWin() {
        Scanner scannerRounds = new Scanner(System.in);
        int rounds;
        while (true) {
            System.out.println("Enter the number of wins needed to win the game:");
            rounds = scannerRounds.nextInt();
            if (rounds > 0) {
                break;
            } else {
                System.out.println("Please enter a positive number greater than 0.");
            }
        }
        return rounds;
    }

    public static void playGame(int roundsToWin, OneRoundGame round) {
        int playerWins = 0;
        int robotWins = 0;
        System.out.println("Game starts! First to " + roundsToWin + ",  WINS!!!!");

        while (playerWins < roundsToWin && robotWins < roundsToWin) {
            System.out.println("\nStarting a new round...");
            round = new OneRoundGame();

            if (round.didPlayerWin()) {
                playerWins++;
            } else if (round.didRobotWin()) {
                robotWins++;
            }else{
                System.out.println("It's a tie!");
            }

            System.out.println("Current Score: Player " + playerWins + " - Robot " + robotWins);
        }
        if (playerWins == roundsToWin) {
            System.out.println("\nCongratulations! You win the game!");
        } else {
            System.out.println("\nRobot wins the game! Better luck next time.");
        }
    }

    public static boolean askToPlayAgain() {
        Scanner scannerPlayAgain = new Scanner(System.in);
        System.out.println("\nDo you want to play again? (Y/N):");
        String response = scannerPlayAgain.nextLine().trim().toUpperCase();
        return response.equals("Y");
    }
}



