package com.PokemonReview.api.Services;

import com.PokemonReview.api.Models.Pokemon;
import com.PokemonReview.api.Models.Review;
import com.PokemonReview.api.Repositories.PokemonRepository;
import com.PokemonReview.api.Repositories.ReviewRepository;

import java.util.List;
import java.util.Optional;

public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final PokemonRepository pokemonRepository;
    //constructeur:
    public ReviewService(
            ReviewRepository reviewRepository,
            PokemonRepository pokemonRepository) {
        this.reviewRepository = reviewRepository;
        this.pokemonRepository = pokemonRepository;
    }

    public Review createReview(int pokemonId, Review review) {

        Optional<Pokemon> pokemon =
                pokemonRepository.findById(pokemonId);

        if (pokemon.isEmpty()) {
            throw new RuntimeException("Pokemon not found");
        }

        review.setPokemon(pokemon.get());

        return reviewRepository.save(review);
    }


}
