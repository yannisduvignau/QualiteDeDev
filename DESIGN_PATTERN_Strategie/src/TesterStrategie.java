/**
 * Classe : TesterStrategie
 * Objectif : Tester le patron de conception Strategie
 * Ici, une op�rationM�tier s'ex�cute diff�rement selon la strat�gie du moment
 * @version 1.0
 * @author: Lopisteguy
 * @date : jj/mm/aaaa
 **/
public class TesterStrategie {
	// ATTRIBUTS 				-non-
	// CONSTRUCTEURS 			-non-
	// METHODES D'ENCAPSULATION -non-
	// METHODES USUELLES 		-non-
	// METHODES SPECIFIQUES 	-non-

	// METHODE PRINCIPALE : main () 
	public static void main(String[] args) {
		// D�claration d'un objetX capable de r�aliser une operationM�tier
		ClasseXutilisantStrategie objetX;
		objetX = new ClasseXutilisantStrategie();

		// D�claration d'une variable capable de pointer vers une Strat�gie
		IStrategie maStrategie;

		// S�lection de la strat�gie concr�te 1
		maStrategie = new StrategieConcrete1();
		objetX.setLaStrategie(maStrategie);
		// Ex�cution de l'op�ration m�tier avec la strat�gie1
		objetX.operationMetier();		// Comportement 1

		// S�lection de la strat�gie concr�te 2
		maStrategie = new StrategieConcrete2();
		objetX.setLaStrategie(maStrategie);
		// Ex�cution de l'op�ration m�tier avec la strat�gie2
		objetX.operationMetier();		// Comportement 2
		
		/** Affiche 
L'op�ration m�tier commence son ex�cution
(m�thode de Strat�gie Concr�te 1 qui s'ex�cute)
l'op�ration m�tier se termine !

L'op�ration m�tier commence son ex�cution
(m�thode de Strat�gie Concr�te 2 qui s'ex�cute)
l'op�ration m�tier se termine !
		 **/
	}
}