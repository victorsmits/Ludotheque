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
     * Test of getId method, of class Person.
     */
    /*@Test
    public void testGetId() {
        System.out.println("getId");
        Person instance = null;
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setId method, of class Person.
     */
    /*@Test
    public void testSetId() {
        System.out.println("setId");
        long newId = 0L;
        Person instance = null;
        instance.setId(newId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

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
        String result = person.getfirstname();
        assertEquals(expFirstname, result);
    }

    /**
     * Test of setFirstname method, of class Person.
     */
    @Test
    public void testSetFirstname() {
        String expFistname = "Oscar";
        person.setFirstname("Oscar");
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expFistname, person.getfirstname());
    }

    /**
     * Test of searchVideoGame method, of class Person.
     */
    @Test
    public void testSearchVideoGame() {
        
        man.addVideoGame();
        
        String expResult = "1 result(s) found";
        assertEquals(expResult, person.searchVideoGame("FIFA 20"));
    }

    /**
     * Test of searchBoardGame method, of class Person.
     */
    @Test
    public void testSearchBoardGame() {
        man.addBoardGame();
        
        String expResult = "1 result(s) found";
        assertEquals(expResult, person.searchBoardGame("Monopoly"));
    }

    /**
     * Test of searchToy method, of class Person.
     */
    @Test
    public void testSearchToy() {
        man.addToy();
        
        String expResult = "1 result(s) found";
        assertEquals(expResult, person.searchToy("Lego"));
    }
    
}
