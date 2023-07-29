package com.example.springpokedex.dto;

import lombok.Data;

@Data
public class Sprites {
    private String back_default;
    private String back_shiny;
    private String front_default;
    private String front_shiny;
    private Other other;
}
@Data
class Other {
    private DreamWorld dream_world;
    private Home home;
}
@Data
class Home {
    private String front_default;
    private String front_shiny;
}
@Data
class DreamWorld {
    private String front_default;
    private String front_female;
}