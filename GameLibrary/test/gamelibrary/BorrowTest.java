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
public class BorrowTest {
    private static Borrow borrow;
    
    public BorrowTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        borrow = new Borrow(new Adherent("Gui", "Serges", "charo", "65987"), new VideoGame("XboxOne", "FIFA 20", "Microsoft"));
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
     * Test of getAdherent method, of class Borrow.
     */
    @Test
    public void testGetAdherent() {
        String expResult = "Nadim";
        String result = borrow.getAdherent().getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateOfReturn method, of class Borrow.
     */
    @Test
    public void testGetDateOfReturn() {

        LocalDate expResult = LocalDate.now().plusMonths(1);
        LocalDate result = borrow.getDateOfReturn();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDateOfborrow method, of class Borrow.
     */
    @Test
    public void testGetDateOfborrow() {
        LocalDate expResult = LocalDate.now();
        LocalDate result = borrow.getDateOfborrow();
        assertEquals(expResult, result);
   }


    /**
     * Test of getGame method, of class Borrow.
     */
    @Test
    public void testGetGame() {
        System.out.println("getGame");
        String expResult = "FIFA 20";
        String result = borrow.getGame().getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdherent method, of class Borrow.
     */
    @Test
    public void testSetAdherent() {
        Adherent adherent = new Adherent("Nadim", "Julien", "nadim14", "4569");
        borrow.setAdherent(adherent);
        
        String expResult = "FIFA 20";
        String result = borrow.getGame().getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDateOfReturn method, of class Borrow.
     */
    @Test
    public void testSetDateOfReturn() {
        LocalDate dateOfReturn = LocalDate.now().plusWeeks(6);
        borrow.setDateOfReturn(dateOfReturn);
        
        LocalDate expResult = LocalDate.now().plusWeeks(6);
        LocalDate result = borrow.getDateOfReturn();
        assertEquals(expResult, result);
    }

    
}
