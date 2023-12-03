public class DecorateurScrollHorizontal extends DecorateurFenetre{
    public DecorateurScrollHorizontal(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Ajout du défilement horizontal");
    }
}
