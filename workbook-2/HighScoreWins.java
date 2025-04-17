import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        //Create Scanner class
        Scanner scanner = new Scanner(System.in);
        //user input
        String userInput = userInput(scanner);
        getWinnerInfo(userInput);
        scanner.close();
    }
    //get input from user in this format
    //Home:Visitor|21:9
    //split on pipe
    //[Home:Visitor, 21:9]
    // split[0] on ":" = [Home, Visitor]
    //split[1] on "|" = [21, 9]
    /*
        if split[1][0] > split[1][1]{
        sout("winner: " + Home);
        }
        else if (split[1][1] > split[1][0]{
        sout("winner: " + Visitor);
        }
        else{
            sout("the game is a tie");
            }
     */
    public static String userInput(Scanner scanner){
        System.out.println("Please enter a game score in this format (Home:Visitor|21:9): ");
        return scanner.nextLine().trim();
    }
    public static void getWinnerInfo (String userInput){
        //Split Input
        String[] splitsByPipe = userInput.split("//|");
        String teamNames = splitsByPipe[0];
        String teamScores = splitsByPipe[1];

        String[] splitsTeamNameByColon = teamNames.split(":");
        String homeTeam = splitsTeamNameByColon[0];
        String visitorTeam = splitsTeamNameByColon[1];

        String[] splitsTeamScoresByColon = teamScores.split(":");
        String homeScore = splitsTeamScoresByColon[0];
        String visitorScore = splitsTeamScoresByColon[1];

        //parse scores to int
        int numHomeScore = Integer.parseInt(homeScore);
        int numVisitorScore = Integer.parseInt(visitorScore);

        //Logic for winner and display
        if (numHomeScore > numVisitorScore){
            System.out.println("The winner is: " + homeTeam);
        } else if (numVisitorScore > numHomeScore) {
            System.out.println("The winner is: " + visitorTeam);
        }
        else {
            System.out.println("There was a tie");
        }
    }

}
