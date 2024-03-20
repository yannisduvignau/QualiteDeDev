import java.util.ArrayList;

public class ObservateurMeteo extends Observateur{
    //ATTRIBUTS
    ObservableMeteo sonde;
    public String libelle;
    private String heure;
    private Double temp;
    private Double pression;
    //CONSTRUCTEUR
    public ObservateurMeteo(String l){
        this.libelle=l;
    }
    //DESTRUCTEUR
    //ENCAPSULTATION get&set

    public String getLibelle() {
        return this.libelle;
    }
    public String getValeurs() {
        return libelle;
    }

    public void setValeurs(Double temp,Double pression,String heure) {
        this.heure = heure;
        this.temp=temp;
        this.pression=pression;
    }
    public void setObservable(ObservableMeteo sondeMeteo) {
        this.sonde = sondeMeteo;
    }
    //METHODES USUELLES
    //METHODES SPECIFIQUES

    @Override
    public void reagir() {
        setValeurs(sonde.getTemp(),sonde.getPression(),sonde.getHeure());
    }
}
