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
        return de1.verif(de2, de3);
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
