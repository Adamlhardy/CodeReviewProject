import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AnimeTest {
    @Test
    public void testGetMainChar() {
        //Arrange
        Anime naruto = new Anime();

        //Action
        String test = naruto.getMainChar();

        //Assert
        assertEquals("Unknown main", test);
    }



    @Test
    public void testSetMainChar() {

         //Arrange
         Anime naruto = new Anime();

         //Action
         String test = naruto.getMainChar();
         naruto.setMainChar("Naruto");
         String test2 = naruto.getMainChar();
 
         //Assert
         assertNotEquals(test, test2);
    }



    @Test
    public void testGetSuppChar() {

        //Arrange
        Anime naruto = new Anime();

        //Action
        String test = naruto.getSuppChar();

        //Assert
        assertEquals("Unknown supp", test);
    }


    @Test
    public void testSetSuppChar() {
         //Arrange
         Anime naruto = new Anime();

         //Action
         String test = naruto.getSuppChar();
         naruto.setSuppChar("Sakura");
         String test2 = naruto.getSuppChar();
 
         //Assert
         assertNotEquals(test, test2);

    }



    @Test
    public void testGetVillian() {

          //Arrange
          Anime naruto = new Anime();

          //Action
          String test = naruto.getVillain();
  
          //Assert
          assertEquals("Unknown villain", test);
    }



    @Test
    public void testSetVillain() {
         //Arrange
         Anime naruto = new Anime();

         //Action
         String test = naruto.getVillain();
         naruto.setVillian("Madara");
         String test2 = naruto.getVillain();
 
         //Assert
         assertNotEquals(test, test2);
    }

}
