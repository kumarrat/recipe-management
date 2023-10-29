package com.geekster.Recipe.Management.controller;

import com.geekster.Recipe.Management.model.Recipe;
import com.geekster.Recipe.Management.service.RecipeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class RecipeController {
    @Autowired
    RecipeService recipeService;

    @PostMapping("recipe")
    public String addRecipe(@RequestBody @Valid Recipe newRecipe)
    {
        return recipeService.saveRecipe(newRecipe);
    }

    @GetMapping("recipes")
    public List<Recipe> getRecipe()
    {
        return recipeService.getRecipe();
    }

    @DeleteMapping("recipe/{id}")
    public String removeRecipe(@PathVariable Long id)
    {
        return recipeService.removeRecipe(id);
    }

    @GetMapping("recipe/{id}/id")
    public Recipe getRecipeById(@PathVariable Long id)
    {
        return recipeService.getRecipeById(id);
    }

}
