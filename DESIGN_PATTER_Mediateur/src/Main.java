// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Création du serveur de chat
        Mediateur unServeurDeChat = new ServeurDeChat("Serveur de chat");

        // Création des Utilisateurs
        Utilisateur utilisateurPierre = new Utilisateur("Pierre",unServeurDeChat);
        Utilisateur utilisateurPaul = new Utilisateur("Paul",unServeurDeChat);
        Utilisateur utilisateurJacques = new Utilisateur("Jacques",unServeurDeChat);

        // Lier les objets entre eux
        unServeurDeChat.ajouter(utilisateurPierre);
        unServeurDeChat.ajouter(utilisateurPaul);
        unServeurDeChat.ajouter(utilisateurJacques);

        // … avec en plus, si ce n’est pas symétrique
        utilisateurPierre.setMediateur(unServeurDeChat);
        utilisateurPaul.setMediateur(unServeurDeChat);
        utilisateurJacques.setMediateur(unServeurDeChat);

        //Simulation d'un serveur de chat
        System.out.println(" ");
        unServeurDeChat.diffuserMessageDe("Bonjour à tous !", utilisateurPierre);
        System.out.println(" ");
        unServeurDeChat.diffuserMessageDe("Bonjour Pierre et les autres !", utilisateurPaul);
        System.out.println(" ");
        unServeurDeChat.diffuserMessageDe("Yes ! Salut...", utilisateurJacques);
        System.out.println(" ");
    }
}