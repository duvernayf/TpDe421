package ch.hesge.francoisduvernay;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author francois.duvernay
 */
public class JeuTest {
    
    public JeuTest() {
    }

    /**
     * Test of demarrer method, of class Jeu.
     */
    @Test
    public void testDemarrer() {
        Jeu j = new Jeu();
        String s = j.demarrer();
        boolean result = false;
        if(s.equals("C'est gagné!") || s.equals("C'est perdu!")) {result = true;}
        assertEquals(true, result);
    }
    
    @Test
    public void testLancerGagnant(){
        Jeu j1 = new Jeu(4,2,1);
        Jeu j2 = new Jeu(2,1,4);
        Jeu j3 = new Jeu(1,2,4);
        boolean result = false;
        String s = "C'est gagné!";
        if(j1.demarrer().equals(s) && j2.demarrer().equals(s) && j3.demarrer().equals(s)){
            result = true;
        }
        assertEquals(true, result);
    }
    
}
