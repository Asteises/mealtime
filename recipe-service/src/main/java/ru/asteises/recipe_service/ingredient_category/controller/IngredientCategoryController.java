package ru.asteises.recipe_service.ingredient_category.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.asteises.recipe_service.ingredient_category.model.dto.IngredientCategory;
import ru.asteises.recipe_service.ingredient_category.model.dto.IngredientCategoryInnerDto;
import ru.asteises.recipe_service.ingredient_category.service.IngredientCategoryService;
import ru.asteises.recipe_service.utils.Endpoint;

//    @Cacheable
@RequiredArgsConstructor
@RestController
@RequestMapping(Endpoint.API + Endpoint.VERSION + Endpoint.INGREDIENT_CATEGORY)
public class IngredientCategoryController {

    private final IngredientCategoryService service;

    @PostMapping(Endpoint.FORWARD_SLASH)
    public ResponseEntity<IngredientCategory> createIngredientCategory(@RequestBody IngredientCategoryInnerDto innerDto) {
        return new ResponseEntity<>(service.createIngredientCategory(innerDto), HttpStatus.CREATED);
    }

}
