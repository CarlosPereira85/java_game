package jogo;

public class Main {

    public static void main(String[] args) {
        
        // Creating players for the first team
        String[] playersTeam1 = {"Player1_Team1", "Player2_Team1", "Player3_Team1"};

        // Creating the first club object
        Club club1 = new Club("Vasco", "Carlos", playersTeam1);

        // Displaying club name
        System.out.println("Club Name: " + club1.getClubName());

        // Displaying players of the first club
        System.out.println("Players of " + club1.getClubName() + ":");
        for (String player : club1.getPlayers()) {
            System.out.println(player);
        }

        // Creating players for the second team
        String[] playersTeam2 = {"Player1_Team2", "Player2_Team2", "Player3_Team2"};

        // Creating the second club object
        Club club2 = new Club("Real Madrid", "Zinedine Zidane", playersTeam2);

        // Displaying club name
        System.out.println("\nClub Name: " + club2.getClubName());

        // Displaying players of the second club
        System.out.println("Players of " + club2.getClubName() + ":");
        for (String player : club2.getPlayers()) {
            System.out.println(player);
        }
    }
}
