/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Ingredient potato = new Ingredient("Potato", 5, 3, 20);
        Ingredient moose = new Ingredient("Moose", 80, 2, 10);
        Ingredient rice = new Ingredient("Rice", 3, 2, 25);
        //Ingredient onion = new Ingredient("oninon", 300, 2, 25);
        
        FoodComponent potatoes = new FoodComponent(100, potato);
        FoodComponent mooses = new FoodComponent(1000, moose);
        FoodComponent rices = new FoodComponent(300, rice);
        
        System.out.println(potatoes.calcFatPct());
    }
}
