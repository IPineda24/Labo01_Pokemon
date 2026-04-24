package org.example.pokemonlabo1.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
private Long id;
private String pokemonName;
private String pokemonType;
private List<String> weaknesses;
private List<String> typeOfZones;
private String region;


}
