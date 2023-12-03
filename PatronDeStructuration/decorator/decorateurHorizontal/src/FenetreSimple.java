public class FenetreSimple  implements Fenetre{
    private String texte;

    public FenetreSimple(String texte) {
        this.texte = texte;
    }

    @Override
    public void afficher() {
        System.out.println("Affichage simple : " + texte);
    }
}
