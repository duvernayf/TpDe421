package ch.hesge.francoisduvernay;

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
