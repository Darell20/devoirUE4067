public class Client {
    public static void main(String[] args){
        IProduitFactory iproduitFactory1 = new ProduitFactory1();
        IProduitFactory iproduitFactory2 = new ProduitFactory2();

        ProduitA produitA = null;
        ProduitB produitB = null;
        ProduitC produitC = null;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = iproduitFactory1.getProduitA();
        produitB = iproduitFactory1.getProduitB();
        produitC = iproduitFactory1.getProduitC();
        produitA.methodeA();
        produitB.methodeB();
        produitC.methodeC();

        System.out.println("Utilisation de la deuxieme fabrique");
        produitA = iproduitFactory2.getProduitA();
        produitB = iproduitFactory2.getProduitB();
        produitC = iproduitFactory2.getProduitC();
        produitA.methodeA();
        produitB.methodeB();
        produitC.methodeC();

    }
}