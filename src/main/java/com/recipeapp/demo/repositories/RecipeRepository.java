package com.recipeapp.demo.repositories;

import com.recipeapp.demo.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByNameContainingIgnoreCaseOrIngredientsContainingIgnoreCase(String name, String ingredients, Sort sort);
    List<Recipe> findByCategoryAndNameContainingIgnoreCaseOrCategoryAndIngredientsContainingIgnoreCase(String category, String name, String category2, String ingredients, Sort sort);
    List<Recipe> findByCategory(String category);
    List<Recipe> findByNameContainingIgnoreCase(String name);
}
