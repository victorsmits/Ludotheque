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
public class ToyTest {
    private static Toy toy;
    public ToyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        toy = new Toy("Caoutchouc", "Lego", "Lego");
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
     * Test of getMaterial method, of class Toy.
     */
    @Test
    public void testGetMaterial() {
        String expResult = "Acier";
        String result = toy.getMaterial();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaterial method, of class Toy.
     */
    @Test
    public void testSetMaterial() {
        String material = "Acier";
        String expResult = "Acier";
        
        toy.setMaterial(material);
        String result = toy.getMaterial();
        assertEquals(expResult, result);
    }

    /**
     * Test of displayMaterial method, of class Toy.
     */
    /*@Test
    public void testDisplayMaterial() {
        System.out.println("displayMaterial");
        Toy toy = null;
        Toy instance = null;
        instance.displayMaterial(toy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of displayInfos method, of class Toy.
     */
    /*@Test
    public void testDisplayInfos() {
        System.out.println("displayInfos");
        Toy instance = null;
        instance.displayInfos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
