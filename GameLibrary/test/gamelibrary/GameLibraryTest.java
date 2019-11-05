/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import Mock.ManagerMock;
import java.util.ArrayList;
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
public class GameLibraryTest {
    
    private static GameLibrary gameLibrary;
    private static String LibraryName;
    public static ManagerMock man;
    
    public GameLibraryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        // init
        gameLibrary = new GameLibrary("Ludothèque Alma");
        man = new ManagerMock("Chris", "Jean");//manager simulation
        LibraryName = "Ludothèque Alma";
    }
    
    @AfterClass
    public static void tearDownClass() {
        // Clear all List
        GameLibrary.getVideoGameList().clear();
        GameLibrary.getBoardGameList().clear();
        GameLibrary.getToyList().clear();
        GameLibrary.getVideoGameList().clear();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class GameLibrary.
     */
    @Test
    public void testGetName() {
        assertEquals("Ludothèque Alma", gameLibrary.getName());
    }

    /**
     * Test of getVideoGameList method, of class GameLibrary.
     */
    @Test
    public void testGetVideoGameList() {
        man.addVideoGame();
        
        ArrayList<VideoGame> expResult = new ArrayList<VideoGame>(); //expected list result
        expResult.add(new VideoGame("PS4", "PES 19", "Sony"));
        expResult.add(new VideoGame("XboxOne", "FIFA 20", "Microsoft"));
        
        ArrayList<VideoGame> result = GameLibrary.getVideoGameList();
        
        assertEquals(expResult.size(), result.size()); // siwe test
        
        for (int i = 0; i < result.size(); i++) { // attribut test
            
            assertEquals(expResult.get(i).getName(), result.get(i).getName());
            assertEquals(expResult.get(i).getManufacturer(), result.get(i).getManufacturer());
            assertEquals(expResult.get(i).getStatut(), result.get(i).getStatut());
            assertEquals(expResult.get(i).getPlatform(), result.get(i).getPlatform());
        }
    }

    /**
     * Test of getToyList method, of class GameLibrary.
     */
    @Test
    public void testGetToyList() {
        man.addToy();
        
        ArrayList<Toy> expResult = new ArrayList<Toy>(); //expected list result
        expResult.add(new Toy("Bois", "Voiture", "Chine"));
        expResult.add(new Toy("Caoutchouc", "Lego", "Lego"));
        
        ArrayList<Toy> result = GameLibrary.getToyList();
        
        assertEquals(expResult.size(), result.size()); // siwe test
        
        for (int i = 0; i < result.size(); i++) { // attribut test
            
            assertEquals(expResult.get(i).getName(), result.get(i).getName());
            assertEquals(expResult.get(i).getManufacturer(), result.get(i).getManufacturer());
            assertEquals(expResult.get(i).getStatut(), result.get(i).getStatut());
            assertEquals(expResult.get(i).getMaterial(), result.get(i).getMaterial());
        }
    }

    /**
     * Test of getBoardGameList method, of class GameLibrary.
     */
    @Test
    public void testGetBoardGameList() {
        man.addBoardGame();
        
        ArrayList<BoardGame> expResult = new ArrayList<BoardGame>(); //expected list result
        expResult.add(new BoardGame(2, "échec", "Sony"));
        expResult.add(new BoardGame(2, "Monopoly", "Microsoft"));
        
        ArrayList<BoardGame> result = GameLibrary.getBoardGameList();
        
        assertEquals(expResult.size(), result.size()); // siwe test
        
        for (int i = 0; i < result.size(); i++) { // attribut test
            
            assertEquals(expResult.get(i).getName(), result.get(i).getName());
            assertEquals(expResult.get(i).getManufacturer(), result.get(i).getManufacturer());
            assertEquals(expResult.get(i).getStatut(), result.get(i).getStatut());
            assertEquals(expResult.get(i).getPlayerNumber(), result.get(i).getPlayerNumber());
        }
    }

    /**
     * Test of getAdherent method, of class GameLibrary.
     */
    @Test
    public void testGetAdherent() {
        man.addAdherent();
        
        ArrayList<Adherent> expResult = new ArrayList<Adherent>(); //expected list result
        expResult.add(new Adherent("Nadim", "Julien"));
        expResult.add(new Adherent("Gui", "Serges"));
        
        ArrayList<Adherent> result = GameLibrary.getAdherentList();
        
        assertEquals(expResult.size(), result.size()); // siwe test
        
        for (int i = 0; i < result.size(); i++) { // attribut test
            
            assertEquals(expResult.get(i).getName(), result.get(i).getName());
            assertEquals(expResult.get(i).getfirstname(), result.get(i).getfirstname());
        }
    }

    /**
     * Test of getManager method, of class GameLibrary.
     */
    @Test
    public void testGetManager() {        
        gameLibrary = new GameLibrary(LibraryName);
        gameLibrary.setManager(new Manager("Chris", "Jean"));
        
        String expNameResult = "Chris";
        String expFirstnameResult = "Jean";
        String nameResult = gameLibrary.getManager().getName();
        
        assertEquals(expNameResult, nameResult);
    }

    /**
     * Test of setManager method, of class GameLibrary.
     */
    @Test
    public void testSetManager() {
        gameLibrary = new GameLibrary(LibraryName);
        gameLibrary.setManager(new Manager("Chris", "Jean"));
        
        String expNameResult = "Chris";
        String expFirstnameResult = "Jean";
        String nameResult = gameLibrary.getManager().getName();
        
        assertEquals(expNameResult, nameResult);
    }
}
