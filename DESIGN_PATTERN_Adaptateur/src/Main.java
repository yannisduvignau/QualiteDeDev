// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IDisponible dispo = new Disponible();
        ICible cible = new Adaptateur(dispo);
        cible.operation();

        dispo = new DisponibleEtRiche();
        cible.setUtilise(dispo);
        cible.operation();
    }
}