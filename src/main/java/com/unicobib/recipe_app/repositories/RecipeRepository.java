package com.unicobib.recipe_app.repositories;

import com.unicobib.recipe_app.pojo.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
