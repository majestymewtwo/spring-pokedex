package com.example.springpokedex.controller;

import com.example.springpokedex.dto.Pokemon;
import com.example.springpokedex.service.PokedexService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final PokedexService pokedexService;
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/pokemon")
    public String pokemon(@RequestParam(value = "name", required = false, defaultValue = "default") String name, Model model) throws IOException {
        Pokemon pokemon = pokedexService.getPokemonDetails(name.toLowerCase());
        model.addAttribute("pokemon", pokemon);
        model.addAttribute("title",
                "Pokemon - " + (
                pokemon.getName().toUpperCase().charAt(0)
                + pokemon.getName().substring(1)));
        return "pokemon";
    }
}
