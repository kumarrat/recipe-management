package com.geekster.Recipe.Management.service;

import com.geekster.Recipe.Management.model.Recipe;
import com.geekster.Recipe.Management.repo.IRecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    IRecipeRepo recipeRepo;

    public String saveRecipe(Recipe newRecipe) {

        recipeRepo.save(newRecipe);
        return "recipe added";
    }

    public List<Recipe> getRecipe() {
        return recipeRepo.findAll();
    }


    public String removeRecipe(Long id) {
        recipeRepo.deleteById(id);
        return "recipe removed";
    }

    public Recipe getRecipeById(Long id) {
        return recipeRepo.findById(id).orElseThrow();
    }

}
