import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AdultCartoonsTest {

    @Test
    public void testGetAntagonist() {
         //Arrange
         AdultCartoons southPark = new AdultCartoons(null, null, null);

         //Action
         String test = southPark.getAntagonist();
 
         //Assert
         assertEquals("unknown antagonist", test);
    }



    @Test
    public void testGetProtagonist() {
         //Arrange
         AdultCartoons southPark = new AdultCartoons(null, null, null);

         //Action
         String test1 = southPark.getProtagonist();
 
         //Assert
         assertEquals("unknown protagonist", test1);
    }



    @Test
    public void testGetSupportingCharacters() {
         //Arrange
         AdultCartoons southPark = new AdultCartoons(null, null, null);

         //Action
         String test2 = southPark.getSupportingCharacters();
 
         //Assert
         assertEquals("unknown supporting characters", test2);
    }



    @Test
    public void testSetAntagonist() {
         //Arrange
         AdultCartoons southPark = new AdultCartoons(null, null, null);

         //Action
         String test3 = southPark.getAntagonist();
         southPark.setAntagonist("Cartman");
         String test4 = southPark.getSupportingCharacters();
 
         //Assert
         assertNotEquals(test3, test4);
    }



    @Test
    public void testSetProtagonist() {
          //Arrange
          AdultCartoons southPark = new AdultCartoons(null, null, null);

          //Action
          String test5 = southPark.getProtagonist();
  
          //Assert
          assertEquals("unknown protagonist", test5);
    }



    @Test
    public void testSetSupportingCharacters() {
         //Arrange
         AdultCartoons southPark = new AdultCartoons(null, null, null);

         //Action
         String test6 = southPark.getSupportingCharacters();
         southPark.setSupportingCharacters("Clyde");
         String test7 = southPark.getAntagonist();
 
         //Assert
         assertNotEquals(test6, test7);
    }

}
