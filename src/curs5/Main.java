package curs5;

public class Main {
    public  static void main(String [] args){
        PizzaStore nyPizzaStore =new NYPizzaStore();
        Pizza myCheesePizza= nyPizzaStore.orderPizza("Chesse");
    Pizza myPeperoni=nyPizzaStore.orderPizza("Peperoni");
    PizzaStore chicagoPizzaStore=new curs5.ChicagoPizzaStore();
    Pizza chPeperoni=chicagoPizzaStore.orderPizza("Peperoni");
    }
}
