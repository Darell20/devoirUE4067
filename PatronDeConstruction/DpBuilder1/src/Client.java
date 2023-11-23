
public class Client {
    public static void main(String[] args) {
        System.out.println("implémentation du patron de construction builder");
        Directeur directeur = new Directeur();

        MonteurPizza  MonteurPizzaPiquante = new MonteurPizzaPiquante();
        MonteurPizza MonteurPizzaReine = new MonteurPizzaReine();

        Pizza pizza = directeur.getPizza();
        System.out.println();

        directeur.setMonteurPizza( MonteurPizzaPiquante);
        directeur.constructPizza();

        pizza = directeur.getPizza();
        System.out.println();

        directeur.setMonteurPizza( MonteurPizzaPiquante);
        directeur.constructPizza();

        pizza = directeur.getPizza();
        System.out.println();
    }
}