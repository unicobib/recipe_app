package com.unicobib.recipe_app.repositories;

import com.unicobib.recipe_app.pojo.Ingredient;
import com.unicobib.recipe_app.pojo.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
