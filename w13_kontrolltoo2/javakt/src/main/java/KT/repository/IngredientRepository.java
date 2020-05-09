package KT.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import KT.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long>{
    
    //loob automaatselt meetodi, mis tagastab ingridienti listi
    List<Ingredient> findAll();
}