package com.geekster.Recipe.Management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.apache.bcel.generic.Instruction;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name should not be blank!!!")
    private String name;
    @NotBlank(message = "Name of the ingredients should not be blank!!!")
    private String ingredients;
    @NotBlank(message = "Name of the instructions should not be blank!!!")
    private String instructions;

}
