import java.util.ArrayList;

public class ServeurDeChat implements Mediateur{
    //ATTRIBUTS
    public String nom;
    public ArrayList<Utilisateur> lesUtilisateurs;
    //METHODES
    //Contructeur
    public ServeurDeChat(String nom){
        setNom(nom);
        setLesUtilisateurs(new ArrayList<>());
    }
    //Encapsulation
    //get
    public String getNom() {
        return nom;
    }

    public ArrayList<Utilisateur> getLesUtilisateurs() {
        return lesUtilisateurs;
    }
    //set

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLesUtilisateurs(ArrayList<Utilisateur> lesUtilisateurs) {
        this.lesUtilisateurs = lesUtilisateurs;
    }

    //Methodes métiers
    public boolean ajouter(Utilisateur u) {
        return lesUtilisateurs.add(u);
    }
    public boolean retirer(Utilisateur u) {
        return lesUtilisateurs.remove(u);
    }
    public boolean existe(Utilisateur u) {
        return lesUtilisateurs.contains(u);
    }
    public void diffuserMessageDe(String message, Utilisateur auteur) {
        System.out.println ("(" + getNom() + ") diffuse le message (" + message + ") de (" + auteur.getNom() + ")");
        for (Utilisateur utilisateur : getLesUtilisateurs()) {
            if (utilisateur != auteur)
                utilisateur.recevoirMessageDe(message, auteur);
        }
    }

}
