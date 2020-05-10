package KT;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import KT.model.Ingredient;
import KT.repository.IngredientRepository;
import KT.service.IngredientService;

@SpringBootTest
class IngredientServiceTest {
    
    // Ühendab IngredientService'i testiga
    @Autowired
    IngredientService ingredientService;

    @Autowired
    IngredientRepository ingredientRepository;

    @Test
	void createIngredient() {

        Ingredient testIngredient = ingredientService.createIngredient("Kaalikas", 2, 2, 11);
        
        assertNotNull(testIngredient);
        assertEquals(2, testIngredient.getFatPct(), "Rasv on vale!");
    }

    @Test
    void deleteIngredient() {

        Ingredient testIngredient = ingredientService.createIngredient("Kaalikas", 2, 2, 11);

        ingredientService.deleteIngredient(testIngredient.getId());
        Ingredient result = ingredientRepository.findById(testIngredient.getId()).orElse(null);

        assertNull(result);
    }
    

}