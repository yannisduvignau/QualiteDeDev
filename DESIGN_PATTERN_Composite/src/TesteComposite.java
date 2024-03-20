/**
 * Classe : TesteComposite1
 * Objectif : Tester l'approche 1 du Patron Composite qui définit...
 * ... les méthodes de la composition dàs la super classe Composant
 * @version 1.0
 * @author: Lopisteguy
 * @date : jj/mm/aaaa
 */
public class TesteComposite {
    // ATTRIBUTS 				-non-
    // CONSTRUCTEURS 			-non-
    // METHODES D'ENCAPSULATION -non-
    // METHODES USUELLES 		-non-
    // METHODES SPECIFIQUES 	-non-

    // METHODE PRINCIPALE : main ()
    public static void main(String[] args) {
        System.out.println ("### TESTE COMPOSITE -1- ###\n");
        // Création des ingredients simples
        PreparationDeCuisine tomateCuite    = new PreparationSimple ("Tomate cuite",    1);
        PreparationDeCuisine assaisonnement = new PreparationSimple ("Assaisonnement", 1);
        PreparationDeCuisine pates          = new PreparationSimple ("Pates",          3);
        PreparationDeCuisine viandeHachee   = new PreparationSimple ("Viande hachée",   4);

        // Affichage des ingredients simples
        System.out.println ("L e s   i n g r é d i e n t s   s i m p l e s   s o n t");
        System.out.print (tomateCuite.toString(""));
        System.out.print (assaisonnement.toString(""));
        System.out.print (pates.toString(""));
        System.out.print (viandeHachee.toString(""));

        // Création des ingredients composés
        PreparationDeCuisine sauceTomate    = new PreparationCompose ("SAUCE TOMATE", 2);
        sauceTomate.ajouterPreparationDeCuisine (tomateCuite);
        sauceTomate.ajouterPreparationDeCuisine (assaisonnement);

        PreparationDeCuisine sauceBolo = new PreparationCompose ("SAUCE BOLO", 2);
        sauceBolo.ajouterPreparationDeCuisine (viandeHachee);
        sauceBolo.ajouterPreparationDeCuisine (sauceTomate);

        PreparationDeCuisine pateBolo = new PreparationCompose ("PATE BOLO", 1);
        pateBolo.ajouterPreparationDeCuisine (pates);
        pateBolo.ajouterPreparationDeCuisine (sauceBolo);

        // Affichage des ingredients composes
        System.out.println ("\nL e s   i n g r é d i e n t s   c o m p o s é s   s o n t");
        System.out.println (sauceTomate.toString(""));
        System.out.println (sauceBolo.toString(""));
        System.out.println (pateBolo.toString(""));
    }
}