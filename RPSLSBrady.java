//Kabrina Brady

import java.util.Scanner;

public class RPSLSBrady {
    public static void main(String[] args) {
        String selection;
        String selection2;
        String result;
        Scanner input = new Scanner(System.in);

        System.out.println("Player 1: Type 'rock', 'paper', 'scissors', 'spock', or 'lizard'.");
        selection = input.next();

        System.out.println("Player 2: Type 'rock', 'paper', 'scissors', 'spock', or 'lizard'.");
        selection2 = input.next();

        selection = selection.toLowerCase();
        selection2 = selection2.toLowerCase();

        result = Winner(selection, selection2);

        System.out.println(result);
    }

    public static String Winner(String selection, String selection2){
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";
        String spock = "spock";
        String lizard = "lizard";
        String playerOneWon = "Player 1 won!";
        String playerTwoWon = "Player 2 won!";
        String tie = "It's a tie!";
        String error = "Error";

        switch (selection){
            case "rock":
                return switch (selection2) {
                    case "rock" -> tie;
                    case "paper" -> playerTwoWon;
                    case "scissors" -> playerOneWon;
                    case "spock" -> playerTwoWon;
                    case "lizard" -> playerOneWon;
                    default -> error;
                };
            case "paper":
                return switch (selection2) {
                    case "rock" -> playerOneWon;
                    case "paper" -> tie;
                    case "scissors" -> playerTwoWon;
                    case "spock" -> playerOneWon;
                    case "lizard" -> playerTwoWon;
                    default -> error;
                };
            case "scissors":
                return switch (selection2){
                    case "rock" -> playerTwoWon;
                    case "paper" -> playerOneWon;
                    case "scissors" -> tie;
                    case "spock" -> playerTwoWon;
                    case "lizard" -> playerOneWon;
                    default -> error;
                };
            case "spock":
                return switch (selection2){
                    case "rock" -> playerOneWon;
                    case "paper" -> playerTwoWon;
                    case "scissors" -> playerOneWon;
                    case "spock" -> tie;
                    case "lizard" -> playerTwoWon;
                    default -> error;
                };
            case "lizard":
                return switch (selection2){
                    case "rock" -> playerTwoWon;
                    case "paper" -> playerOneWon;
                    case "scissors" -> playerTwoWon;
                    case "spock" -> playerOneWon;
                    case "lizard" -> tie;
                    default -> error;
                };
            default:
                return error;
        }
    }
}
