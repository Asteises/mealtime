package ru.asteises.recipe_service.ingredient_category.service;

import ru.asteises.recipe_service.ingredient_category.model.dto.IngredientCategory;
import ru.asteises.recipe_service.ingredient_category.model.dto.IngredientCategoryInnerDto;

public interface IngredientCategoryService {

    IngredientCategory createIngredientCategory(IngredientCategoryInnerDto innerDto);
}
