public class Client {
    public static void main(String[] args) {
        System.out.println("execution du patron de construction builder");

        var Directeur = new Directeur();

        var MonteurPizza = new MonteurPizzaPiquante();
        Directeur.getPizza();
        MonteurPizza.monterGarniture();
        MonteurPizza.monterPate();
        MonteurPizza.monterSauce();
        MonteurPizza.getPizza();

    }
}