/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import Mock.GameLibraryMock;
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
public class ManagerTest {
    public static Manager man;
    
    public ManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        man = Manager.getInstance();
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
     * Test of getInstance method, of class Manager.
     */
    @Test
    public void testGetInstance() {
        String expName = "Juan";
        String expFirstanme = "Oscar";
        
        String name = man.getName();
        String firstsname = man.getfirstname();
        
        assertEquals(expName, name);
        assertEquals(expFirstanme, firstsname);

    }

    /**
     * Test of setInstance method, of class Manager.
     */
    @Test
    public void testSetInstance() {
        System.out.println("setInstance");
        String newName = "Juan";
        String newFirstname = "Oscar";
        Manager.setInstance(newName, newFirstname);
        
        String name = man.getName();
        String firstsname = man.getfirstname();
        
        assertEquals(newName, name);
        assertEquals(newFirstname, firstsname);
    }

    /**
     * Test of addVideoGame method, of class Manager.
     */
    @Test
    public void testAddVideoGame() {
        int expectedSize = 2;
        
        ArrayList<VideoGame> result = GameLibraryMock.getVideoGameList();
        
        assertEquals(expectedSize, result.size()); // size test
        
	result.add(new VideoGame("PS4", "PES 20", "Sony"));
	assertEquals(expectedSize+1, result.size());
        
	/*for(int i = 0; i < result.size(); i++) {
            assertEquals(result.get(i).getName(), "PES 19");
        }*/
    }

    /**
     * Test of addBoardGame method, of class Manager.
     */
    @Test
    public void testAddBoardGame() {
        int expectedSize = 2;
        
        ArrayList<BoardGame> result = GameLibraryMock.getBoardGameList();
        
        assertEquals(expectedSize, result.size()); // size test
        
	result.add(new BoardGame(2, "Dames", "Microsoft"));
	assertEquals(expectedSize+1, result.size());
        
	/*for(int i = 0; i < result.size(); i++) {
            assertEquals(result.get(i).getName(), "PES 19");
        }*/
    }

    /**
     * Test of addToy method, of class Manager.
     */
    @Test
    public void testAddToy() {
        int expectedSize = 2;
        
        ArrayList<Toy> result = GameLibraryMock.getToyList();
        
        assertEquals(expectedSize, result.size()); // size test
        
	result.add(new Toy("Caoutchouc", "barbie", "USA"));
	assertEquals(expectedSize+1, result.size());
        
	/*for(int i = 0; i < result.size(); i++) {
            assertEquals(result.get(i).getName(), "PES 19");
        }*/
    }

    /**
     * Test of getBorrowList method, of class Manager.
     */
    @Test
    public void testGetBorrowList() {

        String expResult = "No loan in the database";
        
        String result = man.getBorrowList();
        assertEquals(expResult, result);

    }
    
}
