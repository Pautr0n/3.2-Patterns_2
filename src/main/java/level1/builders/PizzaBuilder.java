package level1.builders;

import level1.model.Pizza;

public interface PizzaBuilder {

    void setSize(String size);

    void setDough(String dough);

    void setIngredients();

    void reset();

    Pizza getPizza();

}
