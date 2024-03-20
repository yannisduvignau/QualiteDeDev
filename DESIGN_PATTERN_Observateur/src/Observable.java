import java.util.ArrayList;

abstract class Observable {
    //ATTRIBUTS
    public ArrayList<Observateur> mesObservateurs;
    //CONSTRUCTEUR
    //DESTRUCTEUR
    //ENCAPSULTATION get&set
    public ArrayList<Observateur> getObservateur(){
        return this.mesObservateurs;
    }
    public void setObservateur(ArrayList<Observateur> o){
        this.mesObservateurs=o;
    }
    //METHODES USUELLES
    //METHODES SPECIFIQUES
    public boolean ajouterObservateur(Observateur o){
        return 0==0;
    };
    public boolean retirerObservateur(Observateur o){
        return 0==0;
    };
    public boolean supprimerObservateur(Observateur o){
        return 0==0;
    };
    protected void notifierObservateur(){
        for (Observateur obs:
             this.mesObservateurs) {
            obs.reagir();
        }
    }
}
