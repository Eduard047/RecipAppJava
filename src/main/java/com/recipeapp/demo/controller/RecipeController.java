package com.recipeapp.demo.controller;

import com.recipeapp.demo.model.Recipe;
import com.recipeapp.demo.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("recipes", recipeService.getAllRecipes());
        return "index";
    }

    @GetMapping("/addRecipe")
    public String showAddRecipeForm(Model model) {
        Recipe recipe = new Recipe();
        model.addAttribute("recipe", recipe);
        return "recipe-form";
    }

    @PostMapping("/saveRecipe")
    public String saveRecipe(@ModelAttribute("recipe") Recipe recipe) {
        recipeService.addRecipe(recipe);
        return "redirect:/";
    }

    @PostMapping("/deleteRecipe/{id}")
    public String deleteRecipe(@PathVariable(value = "id") Long id) {
        recipeService.deleteRecipe(id);
        return "redirect:/";
    }

    @GetMapping("/showRecipe/{id}")
    public String showRecipe(@PathVariable(value = "id") Long id, Model model) {
        Recipe recipe = recipeService.getRecipeById(id).orElseThrow(() -> new IllegalArgumentException("Invalid recipe Id:" + id));
        model.addAttribute("recipe", recipe);
        return "recipe-view";
    }

    @GetMapping("/category/{category}")
    public String viewCategoryPage(@PathVariable(value = "category") String category, Model model) {
        model.addAttribute("recipes", recipeService.getRecipesByCategory(category));
        model.addAttribute("category", category);
        return "category";
    }

    @GetMapping("/search")
    public String searchRecipes(@RequestParam("keyword") String keyword, @RequestParam("sortBy") String sortBy, Model model) {
        model.addAttribute("recipes", recipeService.searchRecipes(keyword, sortBy));
        return "index";
    }

    @GetMapping("/category/{category}/search")
    public String searchRecipesByCategory(@PathVariable("category") String category, @RequestParam("keyword") String keyword, @RequestParam("sortBy") String sortBy, Model model) {
        model.addAttribute("recipes", recipeService.searchRecipesByCategory(category, keyword, sortBy));
        model.addAttribute("category", category);
        return "category";
    }

    @PostMapping("/rateRecipe/{id}")
    public String rateRecipe(@PathVariable(value = "id") Long id, @RequestParam("rating") int rating) {
        Recipe recipe = recipeService.getRecipeById(id).orElseThrow(() -> new IllegalArgumentException("Invalid recipe Id:" + id));
        recipe.setRating(rating);
        recipeService.updateRecipe(recipe);
        return "redirect:/showRecipe/" + id;
    }

    @PostMapping("/commentRecipe/{id}")
    public String commentRecipe(@PathVariable(value = "id") Long id, @RequestParam("comment") String comment) {
        Recipe recipe = recipeService.getRecipeById(id).orElseThrow(() -> new IllegalArgumentException("Invalid recipe Id:" + id));
        recipe.setComment(comment);
        recipeService.updateRecipe(recipe);
        return "redirect:/showRecipe/" + id;
    }

}
