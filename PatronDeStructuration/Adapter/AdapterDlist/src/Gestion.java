// Gestion.java
public class Gestion {
    private stack pile;

    public Gestion(stack pile) {
        this.pile = pile;
    }

    // Méthodes de la classe Gestion qui utilisent l'interface Pile
    public void effectuerDesOperations() {
        pile.empiler("Element 1");
        pile.empiler("Element 2");

        Object elementDepile = pile.depiler();
        System.out.println("Élément dépilé : " + elementDepile);
    }
}
