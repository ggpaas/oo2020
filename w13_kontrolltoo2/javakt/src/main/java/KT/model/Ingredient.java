package KT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jdk.nashorn.internal.objects.annotations.Getter;
import net.bytebuddy.asm.Advice.Return;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //See annab igale id-le järjestikuliselt kasvava väärtuse
    //kui tegin Identityks, siis ühendas mind andmebaasiga
    private Long id;
    private String foodName;
	private int proteinPct;
	private int fatPct;
	private int carbohydratesPct;

    public Ingredient(String foodName, int proteinPct, int fatPct, int carbohydratesPct) {
        
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
    public Ingredient(){

    }

    /**
     * @return the fatPct
     */
    public double getFatPct() {
        return fatPct;
    }

    /**
     * @return the foodName
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * @return the carbohydratesPct
     */
    public int getCarbohydratesPct() {
        return carbohydratesPct;
    }

    /**
     * @return the proteinPct
     */
    public int getProteinPct() {
        return proteinPct;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
}