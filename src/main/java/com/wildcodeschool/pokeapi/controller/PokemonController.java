package com.wildcodeschool.pokeapi.controller;

import com.wildcodeschool.pokeapi.entity.Pokemon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PokemonController {

    @GetMapping("/api")
    @ResponseBody
    public Pokemon getApi() {

        Pokemon pikachu = new Pokemon("Pikachu", 42, 12);

        return pikachu;
    }

    @GetMapping("/pokemon")
    public String getPokemon(Model out) {

        Pokemon pikachu = new Pokemon("Pikachu", 42, 12);
        out.addAttribute("pokemon", pikachu);

        return "pokemon";
    }
}
