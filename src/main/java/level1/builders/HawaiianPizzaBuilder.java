package level1.builders;

import level1.model.Pizza;

public class HawaiianPizzaBuilder implements PizzaBuilder {

    private Pizza hawaiian;

    public HawaiianPizzaBuilder() {
        this.reset();
    }

    @Override
    public void setSize(String size) {
        hawaiian.setSize(size);
    }

    @Override
    public void setDough(String dough) {
        hawaiian.setDough(dough);
    }

    @Override
    public void setIngredients() {
        hawaiian.setIngredients("Tomato sauce", "Mozzarella Cheese", "Ham", "Pineapple", "Oregano");
    }

    @Override
    public void reset() {
        this.hawaiian = new Pizza();
    }

    @Override
    public Pizza getPizza() {
        Pizza margarita = this.hawaiian;
        this.reset();
        return margarita;
    }


}
