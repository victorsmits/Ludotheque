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
public class VideoGameTest {
    private static VideoGame videogame;
    
    public VideoGameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        videogame = new VideoGame("PS4", "PES 19", "Sony");
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
     * Test of getPlatform method, of class VideoGame.
     */
    @Test
    public void testGetPlatform() {
        
        String expResult = "XboxOne";
        String result = videogame.getPlatform();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlatform method, of class VideoGame.
     */
    @Test
    public void testSetPlatform() {
        String platform = "XboxOne";
        String expResult = "XboxOne";
        
        videogame.setPlatform(platform);
        String result = videogame.getPlatform();
        assertEquals(expResult, result);
    }

    /**
     * Test of displayPlateform method, of class VideoGame.
     */
    /*@Test
    public void testDisplayPlateform() {
        System.out.println("displayPlateform");
        VideoGame videoGame = null;
        VideoGame instance = null;
        instance.displayPlateform(videoGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of displayInfos method, of class VideoGame.
     */
    /*@Test
    public void testDisplayInfos() {
        System.out.println("displayInfos");
        VideoGame instance = null;
        instance.displayInfos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
