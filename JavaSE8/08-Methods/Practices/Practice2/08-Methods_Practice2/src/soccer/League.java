/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;


/**
 *
 * @author Administrator
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Team[] theTeams = createTeams();
        Game[] theGames = createGames(theTeams);

        Game currGame = theGames[0];
        
        currGame.play Game();
        
        System.out.println(currGame.getDescription());
    }

    public static Team[] createTeams() {
        Player player1 = new Player();
        player1.playerName = "Neymar";
        
        Player player2 = new Player();
        player2.playerName = "Don Busizwe";
        
        Player player3 = new Player();
        player3.playerName = "Don Kilo";
        
       Player[] thePlayers = {player1, player2, player3};
        
       Team team1 = new Team();
       team1.teamName = "The Celtics";
       team1.playerArray = thePlayers;
        
        // Create team2
        Team team2 = new Team();
      team2.teamName = "Manchester United";
      team2.playerArray = new Player[3];
      
      team2.playerArray[0] = new Player();
      team2.playerArray[0] .playerName = "Robert Rameek";
      
      team2.playerArray[1] = new Player();
      team2.playerArray[1] .playerName = "Cristiano Ronaldo";
      
      team2.playerArray[2] = new Player();
      team2.playerArray[2] .playerName = "Raul Gonzalez"; 

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public static Game[] createGames(Team[] theTeams) {
        Game theGame = new Game();
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];
        Game[] theGames = {theGame};
        return theGames;
    }
     Goal[] theGoals = new Goal[numberOfGoals];
     
    
    
}
