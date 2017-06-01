package ch.hesge.francoisduvernay;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author François
 */
public class ReglesTest {
    @Test
    public void testCombinaison421Gagne(){
        Regles r = new Regles();
        Lance mockedLance = mock(Lance.class);
        De mockedDe1 = mock(De.class);
        De mockedDe2 = mock(De.class);
        De mockedDe3 = mock(De.class);
        mockedDe1.setVal(2);
        mockedDe2.setVal(4);
        mockedDe3.setVal(1);
        ArrayList des = new ArrayList();
        des.add(mockedDe1);
        des.add(mockedDe2);
        des.add(mockedDe3);
        mockedLance.setListeDes(des);
        assertEquals(r.combinaisonCorrecte(mockedLance), true);
    }
    
    @Test
    public void testCombinaison555Gagne(){
        Regles r = new Regles();
        Lance mockedLance = mock(Lance.class);
        De mockedDe1 = mock(De.class);
        De mockedDe2 = mock(De.class);
        De mockedDe3 = mock(De.class);
        mockedDe1.setVal(5);
        mockedDe2.setVal(5);
        mockedDe3.setVal(5);
        ArrayList des = new ArrayList();
        des.add(mockedDe1);
        des.add(mockedDe2);
        des.add(mockedDe3);
        mockedLance.setListeDes(des);
        assertEquals(r.combinaisonCorrecte(mockedLance), true);
    }
    
    @Test
    public void testCombinaison345Perds(){
        Regles r = new Regles();
        Lance mockedLance = mock(Lance.class);
        De mockedDe1 = mock(De.class);
        De mockedDe2 = mock(De.class);
        De mockedDe3 = mock(De.class);
        mockedDe1.setVal(3);
        mockedDe2.setVal(4);
        mockedDe3.setVal(5);
        ArrayList des = new ArrayList();
        des.add(mockedDe1);
        des.add(mockedDe2);
        des.add(mockedDe3);
        mockedLance.setListeDes(des);
        assertEquals(r.combinaisonCorrecte(mockedLance), false);
    }
}
