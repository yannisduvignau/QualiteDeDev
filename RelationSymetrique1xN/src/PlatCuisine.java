import java.util.ArrayList;
import java.util.Iterator;
/**
 * Classe : PlatCuisine
 * Objectif : Tester une relation BIdirectionnelle 1xN entre Ingredient et PlatCuisine
 * @version 1.0
 * @author Lopist�guy Philippe
 * @date jj/mm/aa
 */
public class PlatCuisine {
    // ATTRIBUTS _libelle, _mesIngredient
    private String _libelle="";
    private ArrayList<Ingredient> _mesIngredient=new ArrayList<Ingredient>();

    // CONSTRUCTEURS : PlatCuisine(), PlatCuisine(String)
    public PlatCuisine () {
        this.set_libelle("");
    }
    public PlatCuisine (String libelle) {
        this.set_libelle(libelle);
    }

    // ENCAPSULATION : _libelle, _recette, _mesIngredient
    public void set_libelle (String libelle) {
        this._libelle = libelle;
    }
    public String get_libelle() {
        return _libelle;
    }
    public void set_mesIngredient (ArrayList<Ingredient> mesIngredient) {
        this._mesIngredient = mesIngredient;
    }
    public ArrayList<Ingredient> get_mesIngredient() {
        return _mesIngredient;
    }

    // METHODES USUELLES : toString1, toString2, toString3, equals
    // toString1 : parcours de l�ArrayList avec un acc�s direct aux �l�ments
    //             acc�s avec i du type int
    public String toString1() {
        String message;
        message = "("+get_libelle()+")";
        message += " compos�/e de ( ";
        if (! get_mesIngredient().isEmpty()) {
            for (int i = 0; i < _mesIngredient.size(); i++) {
                message += _mesIngredient.get(i).get_libelle()+" ";
            }
        }
        message += ")";
        return message;
    }
    // toString2 : parcours s�quentiel de l�ensemble des �l�ments de l�ArrayList
    //             acc�s avec ingredient du type Ingredient
    public String toString2() {
        String message;
        message = "("+get_libelle()+")";
        message += " compos�/e de ( ";
        if (! get_mesIngredient().isEmpty()) {
            for (Ingredient ingredient : get_mesIngredient()) {
                message += ingredient.get_libelle()+" ";
            }
        }
        message += ")";
        return message;
    }

    // toString3 : parcours de l�ArrayList avec un it�rateur
    //             acc�s avec it du type Iterator<Ingredient>
    public String toString3() {
        String message;
        message = "("+get_libelle()+")";
        message += " compos�/e de ( ";
        if (! get_mesIngredient().isEmpty()) {
            for (Iterator<Ingredient> it = get_mesIngredient().iterator(); it.hasNext();  ) {
                message += it.next().get_libelle()+" ";  // Acc�de au suivant
            }
        }
        message += ")";
        return message;
    }

    // equals : dit si unPlat est �gal � l'objet courant
    public boolean equals (PlatCuisine plat) {
        boolean resultat;  // le r�sultat doit �tre bool�en
        resultat = (get_libelle() == plat.get_libelle()
                &&
                get_mesIngredient() == plat.get_mesIngredient()
        );
        return resultat; // une fois �tabli, on retourne le r�sultat bool�en
    }

    // METHODES SPECIFIQUES : existeIngredient, ajouterIngredient, retirerIngredient, lierIngredient, delierIngredient
    // existeIngredient : dit si un ingredient est pr�sent
    public boolean existeIngredient (Ingredient ingredient) {
        return (get_mesIngredient().contains(ingredient));
    }
    // ajouterIngredient : ajoute un ingredient s'il n'y est pas
    public boolean ajouterIngredient (Ingredient ingredient) {
        boolean ajouter;
        if(ajouter = (! existeIngredient (ingredient)))
            _mesIngredient.add(ingredient);
        return ajouter;
    }

    // retirerIngredient : retire un ingredient s'il y est
    public boolean retirerIngredient (Ingredient ingredient) {
        boolean retirer;
        if(retirer = existeIngredient (ingredient))
            _mesIngredient.remove(ingredient);
        return retirer;
    }

    // lierIngredient : dit si r�ussit � lier sym�triquement un ingredient qui n'y soit pas d�j�
    public boolean lierIngredient(Ingredient ingredient) {
        boolean lier; // R�sultat � retourner
        if(! existeIngredient (ingredient)) { // S'il n'est pas pr�sent dans la liste
            ajouterIngredient(ingredient);          // l'ajouter, puis
            ingredient.deLierPlatCuisine();         // supprimer son lien �ventuel
            ingredient.set_PlatCuisine(this);       // et le faire pointer vers moi
            lier = true;
        }
        else lier = false;
        return lier;
    }
    // delierIngredient : dit si r�ussit � retirer et d�lier sym�triquement ingredient
    public boolean delierIngredient (Ingredient ingredient) {
        boolean delier;
        if (delier = retirerIngredient (ingredient)) // M�morise le resultat de la suppression
            ingredient.set_PlatCuisine(null);        // l'ingredient ne doit plus pointer vers moi
        return delier;
    }
}
