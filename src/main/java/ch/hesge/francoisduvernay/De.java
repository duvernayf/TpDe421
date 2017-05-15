/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.francoisduvernay;

/**
 *
 * @author francois.duvernay
 */
public class De {

    private final int MIN = 1;
    private final int MAX = 7;
    private int valeur;

    public De() {
        valeur = (int) (Math.random() * (MAX - MIN)) + MIN;
    }
    
    public De (int v){
        valeur = v;
    }

    public int getVal() {
        return valeur;
    }

    @Override
    public String toString() {
        return "un " + valeur;
    }

    public boolean verif(De de2, De de3) {
        switch (valeur) {
            case 4:
                return verifDe2De3(de2, de3, 2, 1);
            case 2:
                return verifDe2De3(de2, de3, 4, 1);
            case 1:
                return verifDe2De3(de2, de3, 4, 2);
            default:
                return false;
        }
        
    }
    
    public boolean verifDe2De3(De de2, De de3, int n1, int n2) {
        if (de2.getVal() == n1 && de3.getVal() == n2) {
            return true;
        } else {
            return de3.getVal() == n1 && de2.getVal() == n2;
        }
    }
}
