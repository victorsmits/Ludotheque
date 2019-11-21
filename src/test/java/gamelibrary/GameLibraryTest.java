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
 * @author ablo1
 */
public class GameLibraryTest {
    
    private static GameLibrary gameLibrary;
    public static ManagerMock man;
    
    public GameLibraryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        // init
        gameLibrary = GameLibrary.getInstanceSingleObjectGameLibrary();
        man = ManagerMock.getInstance();//manager simulation
        GameLibrary.getVideoGameList().clear();
        GameLibrary.getBoardGameList().clear();
        GameLibrary.getToyList().clear();
    }
    
    @AfterClass
    public static void tearDownClass() {
        // Clear all List
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetName() {
        assertEquals("ECAM Game Library", gameLibrary.getName());
    }

    @Test
    public void testGetVideoGameList() {
        man.addVideoGame();
        
        ArrayList<VideoGame> expResult = new ArrayList<>();
        expResult.add(new VideoGame("PS4", "PES 19", "Sony"));
        expResult.add(new VideoGame("XboxOne", "FIFA 20", "Microsoft"));
        
        ArrayList<Game> result = GameLibrary.getVideoGameList();
        
        assertEquals(expResult.size(), result.size());
        
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i).getName(), result.get(i).getName());
            assertEquals(expResult.get(i).getManufacturer(), result.get(i).getManufacturer());
            assertEquals(expResult.get(i).getStatut(), result.get(i).getStatut());
            assertEquals(expResult.get(i).getPlatform(), result.get(i).getPlatform());
        }
    }

    @Test
    public void testGetToyList() {
        man.addToy();
        
        ArrayList<Toy> expResult = new ArrayList<>();
        expResult.add(new Toy("Bois", "Voiture", "Chine"));
        expResult.add(new Toy("Caoutchouc", "Lego", "USA"));
        
        ArrayList<Game> result = GameLibrary.getToyList();
        
        assertEquals(expResult.size(), result.size());
        
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i).getName(), result.get(i).getName());
            assertEquals(expResult.get(i).getManufacturer(), result.get(i).getManufacturer());
            assertEquals(expResult.get(i).getStatut(), result.get(i).getStatut());
            assertEquals(expResult.get(i).getMaterial(), result.get(i).getMaterial());
        }
    }

    @Test
    public void testGetBoardGameList() {
        man.addBoardGame();
        
        ArrayList<BoardGame> expResult = new ArrayList<>();
        expResult.add(new BoardGame(2, "échec", "Sony"));
        expResult.add(new BoardGame(2, "Monopoly", "Microsoft"));
        
        ArrayList<Game> result = GameLibrary.getBoardGameList();
        
        assertEquals(expResult.size(), result.size());
        
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i).getName(), result.get(i).getName());
            assertEquals(expResult.get(i).getManufacturer(), result.get(i).getManufacturer());
            assertEquals(expResult.get(i).getStatut(), result.get(i).getStatut());
            assertEquals(expResult.get(i).getPlayerNumber(), result.get(i).getPlayerNumber());
        }
    }

    @Test
    public void testGetAdherent() {
        man.addAdherent();
        
        ArrayList<Adherent> expResult = new ArrayList<>(); //expected list result
        expResult.add(new Adherent("Nadim", "Julien", "nadim14", "4569"));
        expResult.add(new Adherent("Gui", "Serges", "charo", "65987"));
        
        ArrayList<Adherent> result = GameLibrary.getAdherentList();
        
        assertEquals(expResult.size(), result.size()); // siwe test
        
        for (int i = 0; i < result.size(); i++) { // attribut test
            
            assertEquals(expResult.get(i).getName(), result.get(i).getName());
            assertEquals(expResult.get(i).getfirstname(), result.get(i).getfirstname());
        }
    }

    @Test
    public void testGetManager() {        
        
        String expNameResult = "Chris";
        String expFirstnameResult = "Jean";
        
        String nameResult = GameLibrary.getManager().getName();
        String firstnameResult = GameLibrary.getManager().getfirstname();
        
        assertEquals(expNameResult, nameResult);
    }

    @Test
    public void testSetManager() {
        
        String expNameResult = "Chris";
        String expFirstnameResult = "Jean";
        
        gameLibrary.setManager(expNameResult, expFirstnameResult);
        
        String nameResult = GameLibrary.getManager().getName();
        
        assertEquals("Chris", nameResult);
    }
}
