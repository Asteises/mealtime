package ru.asteises.recipe_service.ingredient_category.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.asteises.recipe_service.ingredient_category.mapper.IngredientCategoryMapper;
import ru.asteises.recipe_service.ingredient_category.model.dto.IngredientCategory;
import ru.asteises.recipe_service.ingredient_category.model.dto.IngredientCategoryInnerDto;
import ru.asteises.recipe_service.ingredient_category.model.entity.IngredientCategoryEntity;
import ru.asteises.recipe_service.ingredient_category.repository.IngredientCategoryJpaRepository;
import ru.asteises.recipe_service.ingredient_category.service.IngredientCategoryService;


@Slf4j
@RequiredArgsConstructor
@Service
public class IngredientCategoryServiceImpl implements IngredientCategoryService {

    private final IngredientCategoryJpaRepository repository;

    @Transactional
    public IngredientCategory createIngredientCategory(IngredientCategoryInnerDto innerDto) {
        IngredientCategoryEntity entity = IngredientCategoryMapper.INSTANCE.toEntity(innerDto);
        log.info("IngredientCategoryEntity create: {}", entity);
        repository.save(entity);
        log.info("Create IngredientCategoryEntity success");
        return IngredientCategoryMapper.INSTANCE.toDto(entity);
    }

}
