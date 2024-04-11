import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BuildingTest {

    @Test
    public void Building_BuildingDoesntExist_BuildingExists() {
        Building testBuilding = new Building(0, "");

        assertNotNull(testBuilding);
    }

    @Test
    public void GetSqft_HasSqft_ReturnsSqft() {
        Building testBuilding = new Building(0, "");

        int sqft = testBuilding.GetSqft();

        assertEquals(0, sqft);
    }

    @Test
    public void GetTypeOfBuilding() {
        Building testBuilding = new Building(0, "");

        String type = testBuilding.GetTypeOfBuilding();

        assertEquals("", type);
    }

    @Test
    public void SetSqft() {
        Building testBuilding = new Building(0, "");

        testBuilding.SetSqft(100);

        assertEquals(100, testBuilding.GetSqft());
    }

    @Test
    public void SetTypeOfBuilding() {
        Building testBuilding = new Building(0, "");

        testBuilding.SetTypeOfBuilding("Condo");

        assertEquals("Condo", testBuilding.GetTypeOfBuilding());
    }
}
