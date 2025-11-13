public interface PizzaBuilder {

    void setSize(String size);
    void setDough(String dough);
    void setIngredients();
    void reset();
    Pizza getPizza();

}
