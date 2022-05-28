package curs5;

public class ChicagoPizzaStore extends  PizzaStore{
    @Override
    protected curs5.Pizza createPizza(String type) {
        switch (type){
            case "Cheese": return  new ChicagoStyleCheesePizza();
            case "Peperoni" : return  new ChicagoStylePeperoniPizza();
            default: return null;
        }
    }
}
