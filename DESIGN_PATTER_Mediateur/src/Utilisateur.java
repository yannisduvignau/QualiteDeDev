public class Utilisateur extends Acteur{
    //ATTRIBUTS
    public String nom;
    //METHODES
    //Contructeur
    public Utilisateur(String nom,Mediateur mediateur){
        super(mediateur);
        setNom(nom);
    }
    //Encapsulation
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    //Methodes métiers
    public void recevoirMessageDe(String message, Utilisateur auteur){
        System.out.println ("..." + getNom() + " reçoit de (" + auteur.getNom() + ") le message (" + message + ")");
    }

}
