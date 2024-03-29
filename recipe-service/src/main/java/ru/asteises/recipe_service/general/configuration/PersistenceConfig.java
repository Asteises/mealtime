package ru.asteises.recipe_service.general.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"ru.asteises.recipe_service.ingredient_category.repository"})
@EnableJpaAuditing
public class PersistenceConfig {
}
