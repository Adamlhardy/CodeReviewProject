public class FootballTeam {
    // Instance variables
    private String name;
    private String coach;
    private int numberOfPlayers;
 
    // Constructor
    public FootballTeam(String name, String coach, int numberOfPlayers) {
        this.name = name;
        this.coach = coach;
        this.numberOfPlayers = numberOfPlayers;
    }
 
    // Getter methods
    public String getName() {
        return name;
    }
 
    public String getCoach() {
        return coach;
    }
 
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
 
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
 
    public void setCoach(String coach) {
        this.coach = coach;
    }
 
    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
 
    // Method to display team information
    public void displayInfo() {
        System.out.println("Team Name: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Number of Players: " + numberOfPlayers);
    }
}