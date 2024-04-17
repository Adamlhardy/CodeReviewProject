public class AdultCartoons {
   
    private String protagonist = "unkown protagonist";
    private String supportingCharacters = "unkown supportingCharacters"; 
    private String antagonist = "unknown antagonist";

    public AdultCartoons(String protagonist, String supportingCharacters, String antagonist) {
        this.protagonist = protagonist;
        this.supportingCharacters = supportingCharacters;
        this.antagonist = antagonist;
    }

    public void setProtagonist(String protagonist) {
        this.protagonist = protagonist;
    }

    public String getProtagonist() {
        return protagonist;
    }

    public void setSupportingCharacters(String supportingCharacters) {
        this.supportingCharacters = supportingCharacters;
    }

    public String getSupportingCharacters() {
        return supportingCharacters;
    }

    public void setAntagonist(String antagonist) {
        this.antagonist = antagonist;
    }

    public String getAntagonist() {
        return antagonist;
    }
}
