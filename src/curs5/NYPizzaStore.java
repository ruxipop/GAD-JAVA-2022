package curs5;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "Chesse":
                return new NYstyleCheesePizza();
            case "Peperoni":
                return new NYstylePeperoniPizza();
            default:
                return null;
        }

    }
}
