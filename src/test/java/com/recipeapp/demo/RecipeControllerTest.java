package com.recipeapp.demo;

import com.recipeapp.demo.controller.RecipeController;
import com.recipeapp.demo.model.Recipe;
import com.recipeapp.demo.service.RecipeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class RecipeControllerTest {

    @Mock
    private RecipeService recipeService;

    @InjectMocks
    private RecipeController recipeController;

    private MockMvc mockMvc;

    public RecipeControllerTest() {
        MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(recipeController).build();
    }

    @Test
    public void testViewHomePage() throws Exception {
        when(recipeService.getAllRecipes()).thenReturn(Arrays.asList(new Recipe(), new Recipe()));
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    public void testShowAddRecipeForm() throws Exception {
        mockMvc.perform(get("/addRecipe"))
                .andExpect(status().isOk())
                .andExpect(view().name("recipe-form"));
    }

    @Test
    public void testShowRecipe() throws Exception {
        Recipe recipe = new Recipe();
        when(recipeService.getRecipeById(1L)).thenReturn(Optional.of(recipe));

        Model model = new org.springframework.validation.support.BindingAwareModelMap();
        String viewName = recipeController.showRecipe(1L, model);

        assertThat(viewName).isEqualTo("recipe-view");
        assertThat(model.getAttribute("recipe")).isEqualTo(recipe);
    }
}
