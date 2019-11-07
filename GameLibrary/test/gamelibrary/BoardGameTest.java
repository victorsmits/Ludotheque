/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

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
public class BoardGameTest {
    private static BoardGame boardgame;
    
    public BoardGameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        boardgame = new BoardGame(2, "échec", "Sony");
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
     * Test of getPlayerNumber method, of class BoardGame.
     */
    @Test
    public void testGetPlayerNumber() {
        int expResult = 2;
        int result = boardgame.getPlayerNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayerNumber method, of class BoardGame.
     */
    @Test
    public void testSetPlayerNumber() {
        int nbplayer = 4;
        int expResult = 4;
        
        boardgame.setPlayerNumber(nbplayer);
        int result = boardgame.getPlayerNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of displayPlayerNumber method, of class BoardGame.
     */
    /*@Test
    public void testDisplayPlayerNumber() {
        System.out.println("displayPlayerNumber");
        BoardGame boardGame = null;
        BoardGame instance = null;
        instance.displayPlayerNumber(boardGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of displayInfos method, of class BoardGame.
     */
    /*@Test
    public void testDisplayInfos() {
        System.out.println("displayInfos");
        BoardGame instance = null;
        instance.displayInfos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
