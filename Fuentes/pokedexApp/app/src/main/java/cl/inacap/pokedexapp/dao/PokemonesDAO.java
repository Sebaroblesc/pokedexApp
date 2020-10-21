package cl.inacap.pokedexapp.dao;

import java.util.List;

import cl.inacap.pokedexapp.dto.Pokemon;

public interface PokemonesDAO {
    List<Pokemon> getAll();
    Pokemon add(Pokemon p);
}
