package org.example.pokemonlabo1.repository;

import lombok.RequiredArgsConstructor;
import org.example.pokemonlabo1.domain.entities.Pokemon;
import org.example.pokemonlabo1.utils.PokemonList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor

public class PokemonRepository {
    private final PokemonList pokemonList;

    public List<Pokemon> getAllPokemons(){
        return  pokemonList.getPokemons();
    }
}
