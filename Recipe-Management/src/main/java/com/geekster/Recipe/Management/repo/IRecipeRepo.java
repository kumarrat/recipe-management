package com.geekster.Recipe.Management.repo;

import com.geekster.Recipe.Management.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRecipeRepo extends JpaRepository<Recipe,Long> {
}
