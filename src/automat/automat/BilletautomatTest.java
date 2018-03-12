/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat.automat;

import automat.Billetautomat;

import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class BilletautomatTest {
    
    public BilletautomatTest() {
    }
    
    
    public static void setUpClass() {
    }
    
   
    public static void tearDownClass() {
    }
    
    
    public void setUp() {
    }
    
    
    public void tearDown() {
    }

    /**
     * Test of getBilletpris method, of class Billetautomat.
     */
    
    public void testGetBilletpris() {
        System.out.println("getBilletpris");
        Billetautomat instance = new Billetautomat();
        int expResult = 0;
        int result = instance.getBilletpris();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indsætPenge method, of class Billetautomat.
     */
    
    public void testIndsætPenge() {
        System.out.println("inds\u00e6tPenge");
        int beløb = 0;
        Billetautomat instance = new Billetautomat();
        instance.indsætPenge(beløb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class Billetautomat.
     */
    
    public void testGetBalance() {
        System.out.println("getBalance");
        Billetautomat instance = new Billetautomat();
        int expResult = 0;
        int result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of udskrivBillet method, of class Billetautomat.
     */
    @org.junit.Test
    public void testUdskrivBillet() {
        System.out.println("udskrivBillet");
        Billetautomat instance = new Billetautomat();
        instance.udskrivBillet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returpenge method, of class Billetautomat.
     */
    @org.junit.Test
    public void testReturpenge() {
        System.out.println("returpenge");
        Billetautomat instance = new Billetautomat();
        int expResult = 0;
        int result = instance.returpenge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of montørLogin method, of class Billetautomat.
     */
    
    public void testMontørLogin() {
        System.out.println("mont\u00f8rLogin");
        String adgangskode = "";
        Billetautomat instance = new Billetautomat();
        instance.montørLogin(adgangskode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Billetautomat.
     */
    
    public void testGetTotal() {
        System.out.println("getTotal");
        Billetautomat instance = new Billetautomat();
        int expResult = 0;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAntalBilletterSolgt method, of class Billetautomat.
     */
    
    public void testGetAntalBilletterSolgt() {
        System.out.println("getAntalBilletterSolgt");
        Billetautomat instance = new Billetautomat();
        int expResult = 0;
        int result = instance.getAntalBilletterSolgt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBilletpris method, of class Billetautomat.
     */
    
    public void testSetBilletpris() {
        System.out.println("setBilletpris");
        int billetpris = 0;
        Billetautomat instance = new Billetautomat();
        instance.setBilletpris(billetpris);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nulstil method, of class Billetautomat.
     */
    @org.junit.Test
    public void testNulstil() {
        System.out.println("nulstil");
        Billetautomat instance = new Billetautomat();
        instance.nulstil();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAntalBilletterSolgt method, of class Billetautomat.
     */
    @org.junit.Test
    public void testSetAntalBilletterSolgt() {
        System.out.println("setAntalBilletterSolgt");
        int antalBilletterSolgt = 0;
        Billetautomat instance = new Billetautomat();
        instance.setAntalBilletterSolgt(antalBilletterSolgt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of erMontør method, of class Billetautomat.
     */
    @org.junit.Test
    public void testErMontør() {
        System.out.println("erMont\u00f8r");
        Billetautomat instance = new Billetautomat();
        boolean expResult = false;
        boolean result = instance.erMontør();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLog method, of class Billetautomat.
     */
    @org.junit.Test
    public void testGetLog() {
        System.out.println("getLog");
        Billetautomat instance = new Billetautomat();
        instance.getLog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writerLog method, of class Billetautomat.
     */
    @org.junit.Test
    public void testWriterLog() throws Exception {
        System.out.println("writerLog");
        Billetautomat instance = new Billetautomat();
        instance.writerLog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of erMedlem method, of class Billetautomat.
     */
    @org.junit.Test
    public void testErMedlem() {
        System.out.println("erMedlem");
        Billetautomat instance = new Billetautomat();
        boolean expResult = false;
        boolean result = instance.erMedlem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rabatBillet method, of class Billetautomat.
     */
    @org.junit.Test
    public void testRabatBillet() {
        System.out.println("rabatBillet");
        Billetautomat instance = new Billetautomat();
        instance.rabatBillet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tilføjMedlem method, of class Billetautomat.
     */
    @org.junit.Test
    public void testTilføjMedlem() {
        System.out.println("tilf\u00f8jMedlem");
        Billetautomat instance = new Billetautomat();
        instance.tilføjMedlem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of medlemLogin method, of class Billetautomat.
     */
    @org.junit.Test
    public void testMedlemLogin() {
        System.out.println("medlemLogin");
        String medlemskode = "";
        Billetautomat instance = new Billetautomat();
        instance.medlemLogin(medlemskode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FTP method, of class Billetautomat.
     */
    @org.junit.Test
    public void testFTP() throws Exception {
        System.out.println("FTP");
        String[] a = null;
        Billetautomat instance = new Billetautomat();
        instance.FTP(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
