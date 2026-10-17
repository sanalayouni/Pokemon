package com.PokemonReview.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.PokemonReview.api.Models.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
