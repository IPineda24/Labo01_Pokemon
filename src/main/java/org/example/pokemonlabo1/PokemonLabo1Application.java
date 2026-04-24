package org.example.pokemonlabo1;

import org.example.pokemonlabo1.domain.entities.Pokemon;
import org.example.pokemonlabo1.services.PokemonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PokemonLabo1Application {

    public static void main(String[] args) {
        SpringApplication.run(PokemonLabo1Application.class, args);
    }

    @Bean
    public CommandLineRunner run(PokemonService pokemonService) {
        return args -> {
            System.out.println("\n--- INICIANDO SISTEMA POKÉDEX (Servicio Inyectado) ---");

            System.out.println("\n1. Filtrando por Tipo (Water):");
            printResults(pokemonService.filterByType("Water"));

            System.out.println("\n2. Filtrando por Zona (Cave):");
            printResults(pokemonService.filterByZone("Cave"));

            System.out.println("\n3. Filtrando por Debilidad (Ground):");
            printResults(pokemonService.filterByWeaknesses("Ground"));

            System.out.println("\n--- BÚSQUEDA FINALIZADA ---");
        };
    }

    private void printResults(List<Pokemon> pokemons) {
        if (pokemons.isEmpty()) {
            System.out.println("  > No se encontraron Pokémon.");
            return;
        }
        for (Pokemon p : pokemons) {
            System.out.printf("[PKMN #%d] Nombre: %s | Tipo: %s%n",
                    p.getId(), p.getPokemonName(), p.getPokemonType());
        }
    }
}