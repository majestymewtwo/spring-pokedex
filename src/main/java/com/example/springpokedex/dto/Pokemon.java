package com.example.springpokedex.dto;

import lombok.Data;

import java.util.List;

@Data
public class Pokemon {
    private String name;
    private Integer order;
    private List<Ability> abilities;
    private Integer baseExperience;
    private List<Form> forms;
    private List<Stat> stats;
    private Sprites sprites;
    private List<Type> types;
    private Integer height;
    private Integer weight;
}
@Data
class Form {
    private String name;
    private String url;
}
@Data
class Ability {
    private String name;
    private String url;
}