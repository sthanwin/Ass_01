import java.util.Scanner;

public class RockPaperScissors {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA;
        String playerB;
        String playAgain;
        boolean done = false;

        do {
            System.out.print("Enter your move player A [RPS]: ");
            playerA = in.nextLine();

            if (playerA.equalsIgnoreCase("R")) {
                done = true;
                System.out.println("PlayerA chose ROCK");
            } else if (playerA.equalsIgnoreCase("P")) {
                done = true;
                System.out.println("PlayerA chose PAPER");
            } else if (playerA.equalsIgnoreCase("S")) {
                done = true;
                System.out.println("PlayerA chose SCISSORS");
            } else
                System.out.println("You must enter [RPS] not " + playerA);

            System.out.print("Enter your move player B [RPS]: ");
            playerB = in.nextLine();

            if (playerA.equalsIgnoreCase("R")) {
                done = true;
                System.out.println("PlayerB chose ROCK");
            } else if (playerB.equalsIgnoreCase("P")) {
                done = true;
                System.out.println("PlayerB chose PAPER");
            } else if (playerB.equalsIgnoreCase("S")) {
                done = true;
                System.out.println("PlayerB chose SCISSORS");
            } else
                System.out.println("You must enter [RPS] not " + playerB);

            if ((playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) || (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) || (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))) {
                System.out.println("Player A wins");
            }
            else if ((playerB.equalsIgnoreCase("R") && playerA.equalsIgnoreCase("S")) || (playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("R")) || (playerB.equalsIgnoreCase("S") && playerA.equalsIgnoreCase("P"))) {
                System.out.println("Player B wins");
            }
            else {
                System.out.println("Its a tie!");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = in.nextLine();

            if (playAgain.equalsIgnoreCase("Y")) {
                done = false;
            }
            else {
                done = true;
                System.out.println("Thanks for playing!");
            }


        } while (!done);
    }
}