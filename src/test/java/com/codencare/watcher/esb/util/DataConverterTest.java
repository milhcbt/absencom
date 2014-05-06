/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codencare.watcher.esb.util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iman
 */
public class DataConverterTest {
    
    public DataConverterTest() {
    }

    /**
     * Test of bytesToLong method, of class DataConverter.
     */
//    @Test
    public void testBytesToLong() {
        System.out.println("bytesToLong");
        byte[] raw = null;
        long expResult = 0L;
        long result = DataConverter.bytesToLong(raw);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of byteToHexString method, of class DataConverter.
     */
//    @Test
    public void testByteToHexString() {
        System.out.println("byteToHexString");
        byte[] raw = null;
        String expResult = "";
        String result = DataConverter.byteToHexString(raw);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class DataConverter.
     */
//    @Test
    public void testAdd() {
        System.out.println("add");
        int x = 1;
        int y = 3;
        int expResult = 4;
        int result = DataConverter.add(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
