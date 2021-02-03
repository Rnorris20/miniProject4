import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  {
    Scanner scan = new Scanner(System.in);

    //print statements relating to soccer teams
    System.out.println("What is your favorite soccer team?");
    String team = scan.next();
    System.out.println("What is your teams score");
    int teamScore = scan.nextint();
    System.out.println("What is your opponents score");
    int opponentScore = scan.nextint();


    System.out.println(greeting(name)); 
    int totalScore = scoreValue(opponentScore, teamScore);
    System.out.println("The point difference between each team is " + totalScore);


    System.out.println(greeting(name));
    int totalScore = scoreValue(opponentScore, teamScore);
    System.out.println("The point difference between each team is " + totalScore);
   }

    //Team method returns 
    static String soccer(String team)
      {
        String soccer = "Your favorite team is " + team;
        return soccerTeam;
      }


    //Score method returns
    static int scoreValue(int opponentScore, int teamScore)
      {
        int scoreValue = opponentScore - teamScore;
        return totalScore;
      }
  }
}