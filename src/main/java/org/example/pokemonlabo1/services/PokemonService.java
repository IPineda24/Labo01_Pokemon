package org.example.pokemonlabo1.services;

import lombok.RequiredArgsConstructor;
import org.example.pokemonlabo1.domain.entities.Pokemon;
import org.example.pokemonlabo1.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PokemonService {
    private final PokemonRepository repository;

    // PARA EL PRIMERO USE IA PARA ENTENDER COMO FUNCIONABA FILTER
    public List<Pokemon> filterByType(String type) {
        return repository.getAllPokemons().stream()
                .filter(p -> p.getPokemonType().toLowerCase().contains(type.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filterByZone(String zone) {
        return repository.getAllPokemons().stream()
                .filter(p -> p.getTypeOfZones().stream()
                        .anyMatch(z -> z.equalsIgnoreCase(zone)))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filterByWeaknesses(String weaknesses) {
        return repository.getAllPokemons().stream()
                .filter(p -> p.getWeaknesses().stream()
                        .anyMatch(w -> w.equalsIgnoreCase(weaknesses)))
                .collect(Collectors.toList());
    }
}