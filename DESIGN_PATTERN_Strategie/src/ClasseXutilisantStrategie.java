/**
 * Classe : ClasseXutilisantStrategie
 * Objectif : Tester le patron de conception IStrategie
 * Ici, une op�rationM�tier s'ex�cute diff�rement selon la strat�gie du moment
 * @version 1.0
 * @author Lopist�guy Philippe
 * @date jj/mm/aa
 **/
public class ClasseXutilisantStrategie {
    // ATTRIBUTS laStrategie
    private IStrategie laStrategie; // Pointe sur une strategie qui impl�mente un.des m�thodes.s d'int�r�t

    // CONSTRUCTEURS 			-non-

    // METHODES D'ENCAPSULATION laStrategie
    public void setLaStrategie (IStrategie s) { this.laStrategie = s; }
    public IStrategie getLaStrategie (IStrategie s) { return this.laStrategie; }

    // METHODES USUELLES 		-non-

    // METHODES SPECIFIQUES 	op�rationMetier

    // operationMetier : utilise une.des m�thode.s de laStrategie
    public void operationMetier() {
        System.out.println ("L'operation metier commence son execution");
    	// Invoque la m�thode selon la strat�gie du moment
        laStrategie.methodeDeStrategie(); 
        System.out.println ("l'operation metier termine son execution !\n");
    }
}