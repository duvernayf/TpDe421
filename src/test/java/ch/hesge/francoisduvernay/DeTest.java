/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.francoisduvernay;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author francois.duvernay
 */
public class DeTest {
    
    public DeTest() {
    }
    
    @Test
    public void testCreation(){
        De d = new De();
        boolean result = false;
        if(d.getVal() <= 6 && d.getVal() >= 1){
            result = true;
        }
        assertEquals(true, result);
    }
}
