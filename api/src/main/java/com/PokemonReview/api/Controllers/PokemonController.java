package com.PokemonReview.api.Controllers;

import com.PokemonReview.api.Models.Pokemon;
import com.PokemonReview.api.Services.PokemonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    // READ ALL
    @GetMapping
    public List<Pokemon> getAllPokemons() {
        return pokemonService.getAllPokemons();
    }

    // CREATE
    @PostMapping
    public Pokemon createNewPokemon(@RequestBody Pokemon pokemon) {
        return pokemonService.createPokemon(pokemon);
    }

    // READ ONE
    @GetMapping("/{id}")
    public Pokemon getPokemonById(@PathVariable int id) {
        return pokemonService.getPokemonById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Pokemon updatePokemon(
            @PathVariable int id,
            @RequestBody Pokemon newPokemon) {
        return pokemonService.updatePokemon(id, newPokemon);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletePokemon(@PathVariable int id) {
        pokemonService.deletePokemon(id);
    }
}