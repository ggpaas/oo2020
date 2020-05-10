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

    //annab käsu edasi repole vastavaks crud opiks
    private IngredientService ingredientService;

    //kontstruktor,mis loob objekti ja ühendab ingredient service'i selle objektiga
    public SalatController(IngredientService ingredientService){
        this.ingredientService = ingredientService;
    }
    
    //lisab kõik listi läbi servici
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
    
    //siin ühendab service end controlleriga ja loob uue ingredient ning saadab edasi käsi repole ja sealt juba andmebaasi
    ingredientService.createIngredient(foodName, proteinPct, fatPct, carbohydratesPct);
    return "redirect:/";
    }

    @GetMapping("delete/{id}")
    public String deleteIngredient(@PathVariable Long id){
        ingredientService.deleteIngredient(id);
        return "redirect:/";
    }
}