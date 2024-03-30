package ru.asteises.recipe_service.ingredient_category.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import ru.asteises.recipe_service.ingredient_category.model.dto.IngredientCategory;
import ru.asteises.recipe_service.ingredient_category.model.dto.IngredientCategoryInnerDto;
import ru.asteises.recipe_service.ingredient_category.model.entity.IngredientCategoryEntity;

import java.util.UUID;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        imports = {UUID.class})
public interface IngredientCategoryMapper {

    IngredientCategoryMapper INSTANCE = Mappers.getMapper(IngredientCategoryMapper.class);

    @Mapping(target = "id", expression = "java(UUID.randomUUID())")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    IngredientCategoryEntity toEntity(IngredientCategoryInnerDto dto);

    IngredientCategory toDto(IngredientCategoryEntity entity);

}
