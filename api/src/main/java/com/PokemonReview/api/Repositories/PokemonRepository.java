package com.PokemonReview.api.Repositories;

import com.PokemonReview.api.Models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

}

