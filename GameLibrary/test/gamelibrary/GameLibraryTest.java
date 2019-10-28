/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

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
    private static Game game;
    private static ArrayList<Game> gameList;
    private static int expectedSize;  // la taille à l'origine
    
    public GameLibraryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        //System.out.println("avant tout");
        gameLibrary = new GameLibrary();
        game = new Game("Fifa 20", "Sony");
        gameList = new ArrayList<Game>();
        expectedSize = 0;
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        //System.out.println("après tout");
    }
    
    @Before
    public void setUp() {
        //System.out.println("avant chaque test");
    }
    
    @After
    public void tearDown() {
        //System.out.println("après chaque test");
    }

    /**
     * Test of addGame method, of class GameLibrary.
     */
    @Test
    public void testAddGame() {
        /*System.out.println("addGame");
        Game game = null;
        GameLibrary instance = new GameLibrary();
        instance.addGame(game);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
        
        assertEquals(expectedSize, gameList.size());
	gameList.add(game);
	assertEquals(expectedSize+1, gameList.size());
        
        for(int i = 0; i < gameList.size(); i++) {
		assertEquals(gameList.get(i), game);
        }
    }

    /**
     * Test of getAllGames method, of class GameLibrary.
     */
    @Test
    public void testGetAllGames() {
        /*System.out.println("getAllGames");
        GameLibrary instance = new GameLibrary();
        instance.getAllGames();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
}
