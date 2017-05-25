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
         j.demarrer();
        boolean result = false;
        if(s.equals("C'est gagné!") || s.equals("C'est perdu!")) {result = true;}
        assertEquals(true, result);
    }
    
    @Test
    public void testLancerGagnant421(){
        De de1 = new De(2);
        De de2 = new De(4);
        De de3 = new De(1);
        Lance l = new Lance(de1, de2, de3);
        Regles r = new Regles();
        assertEquals(true, r.combinaisonCorrecte(l));
    }
    
}
