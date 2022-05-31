package com.example.cloudbusting;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class PokemonController {

    @Autowired
    PokemonRepository pokemonRepository;

    @GetMapping("/pokemon")
    public String getPokemon() {
        return "get pokemon";
    }

    @GetMapping("/pokemons")
    public List<Pokemon> getPokemons() {
        return pokemonRepository.findAll();
    }

    @PostMapping("/pokemon")
    public String addPokemon(@RequestBody Pokemon text) {
        this.pokemonRepository.save(text);
        System.out.println("Added " + text);
        return "Pokemon saved okay";
    }

    @DeleteMapping("/pokemons/{pokemonId}")
    @Transactional
    public String deletePokemon(@PathVariable int pokemonId) {
        System.out.println("pokemon = " + pokemonId);
        int deleted = this.pokemonRepository.deletePokemonByPokemonId(pokemonId);
        if (deleted > 0) {
            return "Pokemon removed okay";
        }
        return "Pokemon Id doesn't exist";
    }
}



