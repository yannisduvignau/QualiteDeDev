import java.util.ArrayList;

public class ObservableMeteo extends Observable{
    //ATTRIBUTS
    public String libelle;
    private String heure;
    private Double temp;
    private Double pression;
    //CONSTRUCTEUR
    public ObservableMeteo(String l){
        this.libelle=l;
    }
    //DESTRUCTEUR
    //ENCAPSULTATION get&set
    //GETTEURS
    public Double getPression() {
        return this.pression;
    }

    public Double getTemp() {
        return this.temp;
    }

    public String getHeure() {
        return this.heure;
    }

    public String getLibelle() {
        return libelle;
    }
    //SETTEURS
    public void setValeurs(Double temp,Double pression,String heure) {
        this.heure = heure;
        this.temp=temp;
        this.pression=pression;
        notifierObservateur();
    }

    //METHODES USUELLES
    //METHODES SPECIFIQUES
}
