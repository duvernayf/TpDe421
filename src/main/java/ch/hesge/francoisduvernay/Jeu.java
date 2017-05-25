package ch.hesge.francoisduvernay;

/**
 *
 * @author francois.duvernay
 */
public class Jeu {
   private Joueur j1;
   private Joueur j2;
   private Regles r;
   
   public Jeu(){
       
   }
   
   public void demarrer(){
       System.out.println("--------- Joueur 1 ---------");
       if(partie(j1)){System.out.println("c'est gagné!");}
       else{System.out.println("c'est perdu!");}
       System.out.println("--------- Joueur 2 ---------");
       if(partie(j2)){System.out.println("c'est gagné!");}
       else{System.out.println("c'est perdu!");}
   }
   
   private boolean partie(Joueur j){
       int essai = 0;
       while(r.autorisTourSuivant(essai)){
           essai++;
           Lance l = j1.lanceDe();
           if(r.combinaisonCorrecte(l)){
               return true;
           }
       }
       return false;
   }
}
