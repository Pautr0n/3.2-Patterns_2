public class Pizza {

    private String size;
    private String dough;
    private String[] ingredients;

    public void setSize(String size) {
        this.size = size;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setIngredients(String... ingredients) {
        this.ingredients = ingredients;
    }

}
