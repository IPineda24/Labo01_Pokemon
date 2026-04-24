package org.example.pokemonlabo1.common.utils;

import org.example.pokemonlabo1.domain.entities.Pokemon;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PokemonList {
    private final List<Pokemon> pokemons;

    public PokemonList() {
        this.pokemons = new ArrayList<>();

        this.pokemons.add(Pokemon.builder().id(1L).pokemonName("Pikachu").pokemonType("Electric").weaknesses(Arrays.asList("Ground")).typeOfZones(Arrays.asList("Forest", "City")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(2L).pokemonName("Bulbasaur").pokemonType("Grass/Poison").weaknesses(Arrays.asList("Fire", "Ice", "Flying", "Psychic")).typeOfZones(Arrays.asList("Grassland", "Forest")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(3L).pokemonName("Charmander").pokemonType("Fire").weaknesses(Arrays.asList("Water", "Ground", "Rock")).typeOfZones(Arrays.asList("Mountain", "Cave")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(4L).pokemonName("Squirtle").pokemonType("Water").weaknesses(Arrays.asList("Electric", "Grass")).typeOfZones(Arrays.asList("Water", "Beach")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(5L).pokemonName("Jigglypuff").pokemonType("Normal/Fairy").weaknesses(Arrays.asList("Poison", "Steel")).typeOfZones(Arrays.asList("Forest", "City")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(6L).pokemonName("Meowth").pokemonType("Normal").weaknesses(Arrays.asList("Fighting")).typeOfZones(Arrays.asList("City", "Road")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(7L).pokemonName("Psyduck").pokemonType("Water").weaknesses(Arrays.asList("Electric", "Grass")).typeOfZones(Arrays.asList("Lake", "River")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(8L).pokemonName("Machop").pokemonType("Fighting").weaknesses(Arrays.asList("Flying", "Psychic", "Fairy")).typeOfZones(Arrays.asList("Mountain", "Cave")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(9L).pokemonName("Geodude").pokemonType("Rock/Ground").weaknesses(Arrays.asList("Water", "Grass", "Ice", "Fighting", "Ground", "Steel")).typeOfZones(Arrays.asList("Mountain", "Cave")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(10L).pokemonName("Magnemite").pokemonType("Electric/Steel").weaknesses(Arrays.asList("Fire", "Ground", "Fighting")).typeOfZones(Arrays.asList("Power Plant", "City")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(11L).pokemonName("Gastly").pokemonType("Ghost/Poison").weaknesses(Arrays.asList("Ghost", "Psychic", "Dark", "Ground")).typeOfZones(Arrays.asList("Graveyard", "Cave")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(12L).pokemonName("Eevee").pokemonType("Normal").weaknesses(Arrays.asList("Fighting")).typeOfZones(Arrays.asList("Forest", "City")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(13L).pokemonName("Snorlax").pokemonType("Normal").weaknesses(Arrays.asList("Fighting")).typeOfZones(Arrays.asList("Forest", "Mountain")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().id(14L).pokemonName("Chikorita").pokemonType("Grass").weaknesses(Arrays.asList("Fire", "Ice", "Flying", "Bug", "Poison")).typeOfZones(Arrays.asList("Grassland")).region("Johto").build());
        this.pokemons.add(Pokemon.builder().id(15L).pokemonName("Cyndaquil").pokemonType("Fire").weaknesses(Arrays.asList("Water", "Ground", "Rock")).typeOfZones(Arrays.asList("Volcano")).region("Johto").build());
        this.pokemons.add(Pokemon.builder().id(16L).pokemonName("Totodile").pokemonType("Water").weaknesses(Arrays.asList("Electric", "Grass")).typeOfZones(Arrays.asList("River", "Swamp")).region("Johto").build());
        this.pokemons.add(Pokemon.builder().id(17L).pokemonName("Togepi").pokemonType("Fairy").weaknesses(Arrays.asList("Poison", "Steel")).typeOfZones(Arrays.asList("Grassland")).region("Johto").build());
        this.pokemons.add(Pokemon.builder().id(18L).pokemonName("Mareep").pokemonType("Electric").weaknesses(Arrays.asList("Ground")).typeOfZones(Arrays.asList("Grassland")).region("Johto").build());
        this.pokemons.add(Pokemon.builder().id(19L).pokemonName("Sudowoodo").pokemonType("Rock").weaknesses(Arrays.asList("Water", "Grass", "Fighting", "Ground", "Steel")).typeOfZones(Arrays.asList("Forest", "Mountain")).region("Johto").build());
        this.pokemons.add(Pokemon.builder().id(20L).pokemonName("Treecko").pokemonType("Grass").weaknesses(Arrays.asList("Fire", "Ice", "Flying", "Bug", "Poison")).typeOfZones(Arrays.asList("Forest")).region("Hoenn").build());
        this.pokemons.add(Pokemon.builder().id(21L).pokemonName("Torchic").pokemonType("Fire").weaknesses(Arrays.asList("Water", "Ground", "Rock")).typeOfZones(Arrays.asList("Volcano")).region("Hoenn").build());
        this.pokemons.add(Pokemon.builder().id(22L).pokemonName("Mudkip").pokemonType("Water/Ground").weaknesses(Arrays.asList("Grass")).typeOfZones(Arrays.asList("Swamp", "Beach")).region("Hoenn").build());
        this.pokemons.add(Pokemon.builder().id(23L).pokemonName("Ralts").pokemonType("Psychic/Fairy").weaknesses(Arrays.asList("Poison", "Ghost", "Steel")).typeOfZones(Arrays.asList("Grassland")).region("Hoenn").build());
        this.pokemons.add(Pokemon.builder().id(24L).pokemonName("Aron").pokemonType("Steel/Rock").weaknesses(Arrays.asList("Water", "Ground", "Fighting")).typeOfZones(Arrays.asList("Cave", "Mountain")).region("Hoenn").build());
        this.pokemons.add(Pokemon.builder().id(25L).pokemonName("Flygon").pokemonType("Ground/Dragon").weaknesses(Arrays.asList("Ice", "Dragon", "Fairy")).typeOfZones(Arrays.asList("Desert", "Mountain")).region("Hoenn").build());
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}