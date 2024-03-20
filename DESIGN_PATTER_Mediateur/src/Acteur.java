abstract class Acteur {
    //ATTRIBUTS
    protected Mediateur mediateur;
    //METHODES
    Acteur(Mediateur mediateur) {
        this.mediateur = mediateur;
    };
    //Contructeur
    //Encapsulation

    public void setMediateur(Mediateur mediateur) {
        this.mediateur = mediateur;
    }

    //Methodes métiers
    public abstract void recevoirMessageDe(String message,Utilisateur user);
}
