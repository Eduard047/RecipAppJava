package com.recipeapp.demo;

import com.recipeapp.demo.model.Recipe;
import com.recipeapp.demo.repositories.RecipeRepository;
import com.recipeapp.demo.service.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class RecipeServiceTest {

    @Autowired
    private RecipeService recipeService;

    @MockBean
    private RecipeRepository recipeRepository;

    private Recipe recipe1;
    private Recipe recipe2;
    private Recipe newRecipe;

    @BeforeEach
    public void setUp() {
        recipe1 = new Recipe("Spaghetti Carbonara", "Spaghetti, eggs, pancetta, Parmesan cheese, black pepper",
                "1. Cook spaghetti in salted boiling water until al dente. 2. In a pan, cook pancetta until crispy. 3. Beat eggs and mix with Parmesan cheese and black pepper. 4. Combine spaghetti, pancetta, and egg mixture.",
                "Main Course");

        recipe2 = new Recipe("Chicken Curry", "Chicken, curry powder, coconut milk, onions, garlic, ginger",
                "1. Cook onions, garlic, and ginger in a pan. 2. Add chicken and curry powder, cook until chicken is browned. 3. Pour in coconut milk and simmer until chicken is cooked through.",
                "Main Course");

        newRecipe = new Recipe("New Recipe", "Ingredients", "Instructions", "Category");

        when(recipeRepository.findAll()).thenReturn(Arrays.asList(recipe1, recipe2));
        when(recipeRepository.findById(recipe1.getId())).thenReturn(Optional.of(recipe1));
        when(recipeRepository.save(any(Recipe.class))).thenReturn(newRecipe);
    }

    @Test
    public void testGetAllRecipes() {
        List<Recipe> recipes = recipeService.getAllRecipes();
        assertThat(recipes).hasSize(2);
        assertThat(recipes).contains(recipe1, recipe2);
    }

    @Test
    public void testGetRecipeById() {
        Optional<Recipe> foundRecipe = recipeService.getRecipeById(recipe1.getId());
        assertThat(foundRecipe).isPresent();
        assertThat(foundRecipe.get()).isEqualTo(recipe1);
    }

    @Test
    public void testAddRecipe() {
        Recipe savedRecipe = recipeService.addRecipe(newRecipe);
        assertThat(savedRecipe.getName()).isEqualTo(newRecipe.getName());
    }

    @Test
    public void testDeleteRecipe() {
        recipeService.deleteRecipe(recipe1.getId());
        Mockito.verify(recipeRepository, Mockito.times(1)).deleteById(recipe1.getId());
    }
}
