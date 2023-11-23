public class Directeur {

    private MonteurPizza monteurPizza;

    public void setMonteurPizza(MonteurPizza mp){
        MonteurPizza MonteurPizza = mp;
    }
    public Pizza getPizza(){
        return MonteurPizza.getPizza();
    }
    public void contructPizza(){
        MonteurPizza.createNewPizzaProduct();
        MonteurPizza.monterPate();
        MonteurPizza.montersauce();
        MonteurPizza.monterGarniture();


    }

    public void constructPizza() {
        
    }
}
