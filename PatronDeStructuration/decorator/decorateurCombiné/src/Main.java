// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Création d'une fenêtre simple
        Fenetre fenetreSimple = new FenetreSimple("Contenu de la fenêtre simple");

        // Ajout du défilement vertical
        Fenetre fenetreAvecScrollVertical = new DecorateurScrollVertical(fenetreSimple);

        // Ajout du défilement horizontal
        Fenetre fenetreAvecScrollHorizontal = new DecorateurScrollHorizontal(fenetreAvecScrollVertical);

        // Affichage final
        fenetreAvecScrollHorizontal.afficher();
    }
}