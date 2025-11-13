public class PizzaMaster {

    public Pizza preparePizza(PizzaBuilder pizzaBuilder, String size, String dough){
        pizzaBuilder.reset();
        pizzaBuilder.setDough(size);
        pizzaBuilder.setDough(dough);
        pizzaBuilder.setIngredients();
        return pizzaBuilder.getPizza();
    }

}
