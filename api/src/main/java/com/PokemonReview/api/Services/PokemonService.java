package com.PokemonReview.api.Services;

import com.PokemonReview.api.Models.Pokemon;
import com.PokemonReview.api.Repositories.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }


    public Pokemon createPokemon(Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }

    public Pokemon getPokemonById(int id) {
        return pokemonRepository.findById(id).orElse(null);
    }

    public Pokemon updatePokemon(int id, Pokemon newPokemon) {
        Pokemon pokemon = pokemonRepository.findById(id).orElse(null);

        if (pokemon != null) {
            pokemon.setName(newPokemon.getName());
            pokemon.setType(newPokemon.getType());

            return pokemonRepository.save(pokemon);
        }

        return null;
    }

    public void deletePokemon(int id) {
        pokemonRepository.deleteById(id);
    }




}