public class MargaritaPizzaBuilder implements PizzaBuilder {

    private Pizza margarita;

    public MargaritaPizzaBuilder(Pizza margarita) {
        this.reset();
    }

    @Override
    public void setSize(String size) {
        margarita.setSize(size);
    }

    @Override
    public void setDough(String dough) {
        margarita.setDough(dough);
    }

    @Override
    public void setIngredients() {
        margarita.setIngredients("Tomato sauce", "Mozzarella Cheese", "Oregano");
    }

    @Override
    public void reset() {
        this.margarita = new Pizza();
    }

    @Override
    public Pizza getPizza() {
        Pizza margarita = this.margarita;
        this.reset();
        return margarita;
    }

}
