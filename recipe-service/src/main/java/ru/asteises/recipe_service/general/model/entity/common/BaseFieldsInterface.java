package ru.asteises.recipe_service.general.model.entity.common;

public interface BaseFieldsInterface {

    boolean isDeleted();

    void setDeleted(boolean deleted);

    int getVersion();

    void setVersion(int version);
}
