package ru.asteises.recipe_service.recipes.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.asteises.recipe_service.utils.Endpoint;

@RequiredArgsConstructor
@RestController
@RequestMapping(Endpoint.API + Endpoint.VERSION + Endpoint.RECIPES)
public class RecipeController {


}
