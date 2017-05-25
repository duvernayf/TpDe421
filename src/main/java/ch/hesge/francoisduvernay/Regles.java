package ch.hesge.francoisduvernay;

import java.util.ArrayList;

/**
 *
 * @author francois.duvernay
 */
public class Regles {
    public Regles(){
        
    }
    
    public boolean combinaisonCorrecte(Lance l){
        ArrayList des = l.getListeDes();
        if(combinaison421(des) || combinaison555(des)){
            return true;
        }
        return false;
    }
    
    private boolean combinaison421(ArrayList des){
        return verif((De)des.get(0), (De)des.get(1), (De)des.get(2));
    }
    
    private boolean combinaison555(ArrayList des){
        De de1 = (De)des.get(0);
        De de2 = (De)des.get(1);
        De de3 = (De)des.get(2);
        if(de1.getVal() == 5 && de2.getVal() == 5 && de3.getVal() == 5){
            return true;
        }
        return false;
    }
    
    public boolean verif(De de1, De de2, De de3) {
        switch (de1.getVal()) {
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
    
    public boolean autorisTourSuivant (int nbEssai){
        return nbEssai <= 3;
    }
}
