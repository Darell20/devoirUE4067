public class DecorateurScrollVertical extends DecorateurFenetre{
    public DecorateurScrollVertical(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Ajout du défilement vertical");
    }
}
