package KT.service;

import java.util.List;

import org.springframework.stereotype.Service;

import KT.model.Ingredient;
import KT.repository.IngredientRepository;

@Service
public class IngredientService {

    //see on viit repositoryile
    private IngredientRepository ingredientRepository;

    //konstruktor, loob uue IngredientServici ja ühendab selle repoga
    public IngredientService(IngredientRepository ingredientRepository){
        this.ingredientRepository = ingredientRepository;
    }

    //meetod, loob uue ingredienti 
    public Ingredient createIngredient(String foodName, int proteinPct, int fatPct, int carbohydratesPct){
        Ingredient ingredient = new Ingredient(foodName, proteinPct, fatPct, carbohydratesPct);

        if (ingredient.getFoodName() == null) {
            return null;
        }
        //salvestab siin andmebaasi
        ingredientRepository.save(ingredient);
        return ingredient;
    }

    //list, mis hoiab sees ingrediente
    public List<Ingredient> getIngredients() {

        //loon listi ja repositorist saan need kätte
        List<Ingredient> ingredients = this.ingredientRepository.findAll();
        return ingredients;
    }

    public void deleteIngredient(Long id) {
        ingredientRepository.deleteById(id);
    }
}

