package com.unicobib.recipe_app.repositories;

import com.unicobib.recipe_app.pojo.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
