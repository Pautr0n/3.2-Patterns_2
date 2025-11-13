package level1.app;

import level1.builders.HawaiianPizzaBuilder;
import level1.builders.MargaritaPizzaBuilder;
import level1.builders.PizzaBuilder;
import level1.builders.PizzaMaster;
import level1.model.Pizza;

public class Main {

    public static void main(String[] args) {

        Pizza pizzaOrder;
        PizzaBuilder pizzaBuilder = new MargaritaPizzaBuilder();
        PizzaMaster pizzaMaster = new PizzaMaster();

        pizzaOrder = pizzaMaster.preparePizza(pizzaBuilder, "Large", "Thin");
        System.out.println(pizzaOrder.toString());
        pizzaOrder = pizzaMaster.preparePizza(pizzaBuilder, "Medium", "Thick");
        System.out.println(pizzaOrder.toString());

        pizzaBuilder = new HawaiianPizzaBuilder();
        pizzaOrder = pizzaMaster.preparePizza(pizzaBuilder, "Small", "Rolling");
        System.out.println(pizzaOrder);


    }

}
