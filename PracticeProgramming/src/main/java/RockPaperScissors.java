
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boram2
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("How many rounds would you like to play? (#1-10)");
            int rounds = Integer.parseInt(scanner.nextLine());
            int wins = 0;
            int ties = 0;
            int losses = 0;

            for (int i = 0; i < rounds; i++) {
                String result = playRockPaperScissors(scanner);
                switch (result) {
                    case "tie" -> ties += 1;
                    case "win" -> wins += 1;
                    case "loss" -> losses += 1;
                    default -> {}
                }

            }

            System.out.println("Losses: " + losses);
            System.out.println("Wins: " + wins);
            System.out.println("Ties: " + ties);

            if (wins > losses) {
                System.out.println("You win!");
            } else if (wins == losses) {
                System.out.println("It is a tie");
            } else {
                System.out.println("The computer wins");
            }
            
            System.out.println("Would you like to play again? (yes-no)");
            String answer = scanner.nextLine();
            
            if (!"yes".equals(answer)) {
                break;
            }
        }

        
    }

    static String playRockPaperScissors(Scanner scanner) {
        System.out.println("What's your choice? (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        computerMove = switch (randomNumber) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
        System.out.println("Computer chose " + computerMove + "!");

        if (playerMove.equals(computerMove)) {
            System.out.println("It's a tie!");
            return "tie";
        } else if (playerWins(playerMove, computerMove)) {
            System.out.println("You win!");
            return "win";
        } else {
            System.out.println("Computer wins!");
            return "loss";
        }
    }

    static boolean playerWins(String playerMove, String computerMove) {
        return switch (playerMove) {
            case "rock" -> computerMove.equals("scissors");
            case "paper" -> computerMove.equals("rock");
            default -> computerMove.equals("paper");
        };
    }   
}