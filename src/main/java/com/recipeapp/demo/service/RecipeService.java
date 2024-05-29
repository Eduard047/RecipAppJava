package com.recipeapp.demo.service;

import com.recipeapp.demo.model.Recipe;
import com.recipeapp.demo.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    public Optional<Recipe> getRecipeById(Long id) {
        return recipeRepository.findById(id);
    }

    public Recipe addRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public void deleteRecipe(Long id) {
        recipeRepository.deleteById(id);
    }

    public List<Recipe> searchRecipes(String keyword, String sortBy) {
        Sort sort = Sort.by(Sort.Direction.ASC, sortBy);
        return recipeRepository.findByNameContainingIgnoreCaseOrIngredientsContainingIgnoreCase(keyword, keyword, sort);
    }

    public List<Recipe> searchRecipesByCategory(String category, String keyword, String sortBy) {
        Sort sort = Sort.by(Sort.Direction.ASC, sortBy);
        return recipeRepository.findByCategoryAndNameContainingIgnoreCaseOrCategoryAndIngredientsContainingIgnoreCase(category, keyword, category, keyword, sort);
    }

    public List<Recipe> getRecipesByCategory(String category) {
        return recipeRepository.findByCategory(category);
    }

    public List<Recipe> searchRecipesByName(String name) {
        return recipeRepository.findByNameContainingIgnoreCase(name);
    }

    public Recipe updateRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }
}
