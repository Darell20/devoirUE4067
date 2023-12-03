// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // Main.java
        // Créer une instance de la classe DList
        DList dList = new DList();

        // Créer un adaptateur pour DList
        stack dListPileAdapter = new DListAdapteur(dList);

        // Utiliser la classe Gestion avec l'adaptateur
        Gestion gestion = new Gestion(dListPileAdapter);

        // Appeler des méthodes de la classe Gestion
        gestion.effectuerDesOperations();
    }
}