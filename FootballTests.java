import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FootballTests {



    @Test
    public void testConstructorAndGetterMethods() {

        FootballTeam team = new FootballTeam("Seahawks", "Texans", 22);

        assertEquals("Seahawks", team.getName());
        assertEquals("Texans", team.getCoach());
        assertEquals(22, team.getNumberOfPlayers());
    }

    @Test
    public void testSetterMethods() {
        FootballTeam team = new FootballTeam("Broncos", "Cowboys", 22);
     
        team.setName("Broncos");
        team.setCoach("Sean Peyton");
        team.setNumberOfPlayers(22);
     
        assertEquals("Cowboys", team.getName());
        assertEquals("Mike McCarthy", team.getCoach());
        assertEquals(22, team.getNumberOfPlayers());
    }
}
    

