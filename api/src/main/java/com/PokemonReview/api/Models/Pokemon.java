package com.PokemonReview.api.Models;

import jakarta.persistence.Id;

public class Pokemon {
    @Id
    private int id;
    private String name;
    private String type;

}
