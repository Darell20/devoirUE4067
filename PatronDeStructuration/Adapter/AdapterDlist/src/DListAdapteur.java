// DListAdapteur.java
public class DListAdapteur implements stack {
    private DList dList;

    public DListAdapteur(DList dList) {
        this.dList = dList;
    }

    public void empiler(Object element) {
        // Appeler la méthode de la classe DList pour ajouter un élément à la liste
        dList.ajouterEnTete(element);
    }

    public Object depiler() {
        // Appeler la méthode de la classe DList pour supprimer et retourner un élément de la liste
        Object elementDepile = dList.retirerEnTete();
        return elementDepile;
    }

    @Override
    public void push(Object element) {

    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public Object top() {
        return null;
    }
}
