public class FoodComponent {

    private int amount;
    private Ingredient ingredient;

    public FoodComponent(int amount, Ingredient ingredient) {
        this.amount = amount;
        this.ingredient = ingredient;
    }

    public String calcFatPct(){
        double sum = amount * ingredient.getFatPct() / 100;
        return sum + "g on rasva kokku";
    }

}