package ch.hesge.francoisduvernay;

/**
 * @author francois.duvernay
 */
public class De {

    private final int MIN = 1;
    private final int MAX = 6;
    private int valeur;

    public De() {
        valeur = (int) (Math.random() * MAX) + MIN;
    }
    
    public De (int v){
        valeur = v;
    }

    public int getVal() {
        return valeur;
    }
    
    public void setVal(int v) {
        valeur = v;
    }

    @Override
    public String toString() {
        return "un " + valeur;
    }
}
