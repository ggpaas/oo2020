public class Ingredient {
    
    private String foodName;
	private double proteinPct;
	private double fatPct;
	private double carbohydratesPct;

    public Ingredient(String foodName, double proteinPct, double fatPct, double carbohydratesPct) {
        
        //Takistab objekti loomist vigaste parameetritega.
        if(proteinPct + fatPct + carbohydratesPct > 100){
            System.out.println("Check your food percent!!! The percent can't be over 100%");
        }else{
            this.foodName = foodName;
            this.proteinPct = proteinPct;
            this.fatPct = fatPct;
            this.carbohydratesPct = carbohydratesPct;
        }
    }

    /**
     * @return the fatPct
     */
    public double getFatPct() {
        return fatPct;
    }
}