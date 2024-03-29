package ru.asteises.recipe_service.ingredient_category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.asteises.recipe_service.ingredient_category.model.entity.IngredientCategoryEntity;

import java.util.UUID;

@Repository
public interface IngredientCategoryJpaRepository extends JpaRepository<IngredientCategoryEntity, UUID> {

}
