package level1.builders;

import level1.model.Pizza;

public class PizzaMaster {

    public Pizza preparePizza(PizzaBuilder pizzaBuilder, String size, String dough) {
        pizzaBuilder.reset();
        pizzaBuilder.setSize(size);
        pizzaBuilder.setDough(dough);
        pizzaBuilder.setIngredients();
        return pizzaBuilder.getPizza();
    }

}
