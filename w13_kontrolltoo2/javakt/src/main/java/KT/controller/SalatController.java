package KT.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import KT.model.Ingredient;
import KT.service.IngredientService;

@Controller
public class SalatController {

    private IngredientService ingredientService;

    public SalatController(IngredientService ingredientService){
        this.ingredientService = ingredientService;
    }
    
    @GetMapping("")
    public String index(Model model){

        List<Ingredient> ingredients = ingredientService.getIngredients();
        model.addAttribute("ingredients", ingredients);
        return "index";
    }

    @PostMapping("")
    public String createIngredient(@RequestParam String foodName, 
                                @RequestParam int proteinPct, 
                                @RequestParam int fatPct, 
                                @RequestParam int carbohydratesPct){
    System.out.println(foodName);
    System.out.println(proteinPct);
    System.out.println(fatPct);
    System.out.println(carbohydratesPct);
    
    //siin ühendab service end controlleriga
    ingredientService.createIngredient(foodName, proteinPct, fatPct, carbohydratesPct);
    return "redirect:/";
    }

    @GetMapping("delete/{id}")
    public String deleteIngredient(@PathVariable Long id){
        ingredientService.deleteIngredient(id);
        return "redirect:/";
    }
}