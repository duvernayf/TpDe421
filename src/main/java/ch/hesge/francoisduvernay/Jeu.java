package ch.hesge.francoisduvernay;

/**
 *
 * @author francois.duvernay
 */
public class Jeu {
    
    private static final int LIMITE = 3;
    
    private De de1;
    private De de2;
    private De de3;
    
    public Jeu(){
        de1 = new De();
        de2 = new De();
        de3 = new De();
    }
    
    public Jeu(int de1, int de2, int de3){
        this.de1 = new De(de1);
        this.de2 = new De(de2);
        this.de3 = new De(de3);
    }
    
    public boolean lance(){
        System.out.println("Vous avez tiré : " + de1.toString() + " " + de2.toString() +  " et " + de3.toString());
        return verif(de1, de2, de3);
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
    
    public String demarrer(){
        int essai = 0;
        while (essai < 3){
            essai++;
            if(lance()){
                return "C'est gagné!";
            }
            de1 = new De();
            de2 = new De();
            de3 = new De();
        }
        return "C'est perdu!";
    }
}
