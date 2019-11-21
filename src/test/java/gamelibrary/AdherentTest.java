/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ablo1
 */
public class AdherentTest {
    private static Adherent adh;
    private static GameLibrary gamelibrary;

    public AdherentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        adh = new Adherent("Nadim", "Julien", "nadim14", "4569");
        gamelibrary = GameLibrary.getInstanceSingleObjectGameLibrary();
        GameLibrary.getVideoGameList().clear();
        GameLibrary.getBoardGameList().clear();
        GameLibrary.getToyList().clear();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSubscriptionBegin method, of class Adherent.
     */
    @Test
    public void testGetSubscriptionBegin() {
        LocalDate expResult = LocalDate.now();
        LocalDate result = adh.getSubscriptionBegin();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of borrowVideoGame method, of class Adherent.
     */
    @Test
    public void testBorrowVideoGame() {
        long id = 45698;
        
        String expResult = "No video game in database";
        String result = adh.borrowVideoGame(id);
        assertEquals(expResult, result);
        
        GameLibrary.getVideoGameList().add(new VideoGame("PS4", "PES 19", "Sony"));
        
        String expResult2 = "This video game was not found.";
        String result2 = adh.borrowVideoGame(id);
        assertEquals(expResult2, result2);
    }
    
}
