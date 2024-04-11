/**
 * Building
 */
public class Building {

    private int sqft;
    private String typeOfBuilding;

    public Building(int sqft, String typeOfBuilding) {
        this.sqft = sqft;
        this.typeOfBuilding = typeOfBuilding;
    }

    public int GetSqft() {
        return this.sqft;
    }

    public String GetTypeOfBuilding() {
        return this.typeOfBuilding;
    }

    public void SetSqft(int sqft) {
        this.sqft = sqft;
    }

    public void SetTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }
}