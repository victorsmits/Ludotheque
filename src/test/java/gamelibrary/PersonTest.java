/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import Mock.ManagerMock;
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
public class PersonTest {
    
    private static Person person;
    public static ManagerMock man;
    public static GameLibrary gamelibrary;
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        person = new Person("Itunime", "Rudy", "rudy36", "654321");
        man = ManagerMock.getInstance();//manager simulation
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
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        //System.out.println("getName");
        
        String expName = "Itunime";
        String result = person.getName();
        assertEquals(expName, result);
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        String expName = "Louis";
        person.setName("Louis");
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expName, person.getName());
    }

    /**
     * Test of getfirstname method, of class Person.
     */
    @Test
    public void testGetfirstname() {
        String expFirstname = "Oscar";
        String result = person.getFirstName();
        assertEquals(expFirstname, result);
    }

    /**
     * Test of setFirstname method, of class Person.
     */
    @Test
    public void testSetFirstname() {
        String expFirstName = "Oscar";
        person.setFirstName("Oscar");
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expFirstName, person.getFirstName());
    }

    /**
     * Test of searchVideoGame method, of class Person.
     */
    @Test
    public void testSearchVideoGame() {
        
        man.addVideoGame();
        
        String expResult = "1 result(s) found";
        assertEquals(expResult, person.searchGame("Video Game","FIFA 20"));
    }

    /**
     * Test of searchBoardGame method, of class Person.
     */
    @Test
    public void testSearchBoardGame() {
        man.addBoardGame();

        String expResult = "1 result(s) found";
        assertEquals(expResult, person.searchGame("Board Game","Monopoly"));
    }

    /**
     * Test of searchToy method, of class Person.
     */
    @Test
    public void testSearchToy() {
        man.addToy();

        String expResult = "1 result(s) found";
        assertEquals(expResult, person.searchGame("Toy","Lego"));
    }
    
}
