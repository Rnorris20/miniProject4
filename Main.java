import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    //print statements relating to soccer teams
    System.out.println("Hello, welcome to the soccer shop!");
    
    System.out.println("What is your favorite soccer team?");
    String team = scan.next();
    System.out.println("What is your teams score?");
    int teamScore = scan.nextInt();
    System.out.println("What is your opponents score");
    int opponentScore = scan.nextInt();


    int totalScore = scoreValue(opponentScore, teamScore);
    System.out.println("The point difference between each team is " + totalScore);
   }

    //Team method returns 
     
    static String Soccer(String team)
     {
       String soccerTeam = "Your favorite team is " + team;
       return soccerTeam;
     }

    //Score method returns
    static int scoreValue(int opponentScore, int teamScore)
      {
        int totalScore = opponentScore - teamScore;
        return totalScore;
      }
  }



