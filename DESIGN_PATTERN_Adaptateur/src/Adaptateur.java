public class Adaptateur implements ICible{

    IDisponible utilise;
    public Adaptateur(IDisponible d){
        super();
        setUtilise(d);
    }
    public void operation() {
        utilise.operationDisponible();
    }
    public IDisponible getUtilise() {
        return utilise;
    }

    public void setUtilise(IDisponible utilise) {
        this.utilise = utilise;
    }

}
