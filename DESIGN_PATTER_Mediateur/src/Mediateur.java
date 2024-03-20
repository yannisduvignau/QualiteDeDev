interface Mediateur {
    //ATTRIBUTS
    //METHODES
    //Contructeur
    //Encapsulation
    //Methodes métiers
    void diffuserMessageDe(String message,Utilisateur user);
    boolean ajouter(Utilisateur user);
    boolean retirer(Utilisateur user);
    boolean existe(Utilisateur user);
}
