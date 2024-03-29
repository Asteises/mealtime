package ru.asteises.recipe_service.ingredient_category.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IngredientCategory {

    private UUID id;
    private String name;
    private String description;
}
