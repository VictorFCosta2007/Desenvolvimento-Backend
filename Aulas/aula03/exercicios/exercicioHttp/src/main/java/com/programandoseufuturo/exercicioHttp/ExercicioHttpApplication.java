package com.programandoseufuturo.exercicioHttp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app")
@SpringBootApplication
public class ExercicioHttpApplication {

	private static List<Pokemon> pokedex = new ArrayList<>();

	@GetMapping("/pokemons")
	public List<Pokemon> getPokemons(){
		return pokedex;
	}

	@PostMapping
	public static String adicionarPokemon(@RequestBody Pokemon pokemon) {
		for(Pokemon pokemonNaLista : pokedex ) {
			if(pokemon.getId() == pokemonNaLista.getId()) {
				return "Pokemon já existe";
			} else if(pokemon.getNome().equalsIgnoreCase(pokemonNaLista.getNome())){
				return "Pokemon já existe";
			}
		}
		pokedex.add(pokemon);
		return String.format("Pokemon %s Incluído na pokedex", pokemon.getNome());
	}

	public static void main(String[] args) {
		SpringApplication.run(ExercicioHttpApplication.class, args);
		pokedex.add(new Pokemon(0, "Charmander"));
		pokedex.add(new Pokemon(1, "Squirtle"));
		pokedex.add(new Pokemon(2, "Bulbassaur"));
	}

}
