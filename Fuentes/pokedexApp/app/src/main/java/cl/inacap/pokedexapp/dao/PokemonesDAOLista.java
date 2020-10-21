package cl.inacap.pokedexapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import cl.inacap.pokedexapp.dto.Pokemon;

public class PokemonesDAOLista implements PokemonesDAO{
    private List<Pokemon> pokemones = new ArrayList<>();
    private static PokemonesDAOLista instancia;
    private PokemonesDAOLista(){
        Pokemon p = new Pokemon();
        p.setNombre("Pikachu");
        p.setId(1);
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec non mi id magna sodales cursus et ac diam. Praesent in magna venenatis, volutpat mauris et, semper enim. Phasellus eget erat tortor. Etiam efficitur orci sed magna bibendum lobortis. Etiam eget aliquet erat. ");
        p.setFoto("https://assets.stickpng.com/images/580b57fcd9996e24bc43c325.png");
        p.setTipo("Eléctrico");
        p.setLogo("https://img.rankedboost.com/wp-content/uploads/2019/11/Electric-Type-Pokemon-Sword-and-Shield.png");
        pokemones.add(p);
        p = new Pokemon();
        p.setNombre("Charmander");
        p.setId(2);
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec non mi id magna sodales cursus et ac diam. Praesent in magna venenatis, volutpat mauris et, semper enim. Phasellus eget erat tortor. Etiam efficitur orci sed magna bibendum lobortis. Etiam eget aliquet erat. ");
        p.setFoto("https://img.pngio.com/pikachu-pokemon-x-and-y-charmander-charizard-charmander-png-charmander-png-900_940.jpg");
        p.setTipo("Fuego");
        p.setLogo("https://www.flaticon.com/svg/static/icons/svg/785/785116.svg");
        pokemones.add(p);
        p = new Pokemon();
        p.setNombre("Squirtle");
        p.setId(3);
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec non mi id magna sodales cursus et ac diam. Praesent in magna venenatis, volutpat mauris et, semper enim. Phasellus eget erat tortor. Etiam efficitur orci sed magna bibendum lobortis. Etiam eget aliquet erat. ");
        p.setFoto("https://assets.stickpng.com/images/580b57fcd9996e24bc43c32a.png");
        p.setTipo("Agua");
        p.setLogo("https://www.flaticon.com/svg/static/icons/svg/3039/3039889.svg");
        pokemones.add(p);
        p = new Pokemon();
        p.setNombre("Bulbasaur");
        p.setId(4);
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec non mi id magna sodales cursus et ac diam. Praesent in magna venenatis, volutpat mauris et, semper enim. Phasellus eget erat tortor. Etiam efficitur orci sed magna bibendum lobortis. Etiam eget aliquet erat. ");
        p.setFoto("https://img2.freepng.es/20190516/hfu/kisspng-bulbasaur-squirtle-ivysaur-charmander-venusaur-file-1bulbasaur-ag-anime-png-bulbagarden-archi-5cde2f9cc60599.7660216015580650528111.jpg");
        p.setTipo("Planta");
        p.setLogo("https://www.flaticon.com/svg/static/icons/svg/892/892917.svg");
        pokemones.add(p);
    }

    public static PokemonesDAOLista getInstance(){
        if(instancia == null){
            instancia = new PokemonesDAOLista();
        }
        return instancia;
    }

    @Override

    public List<Pokemon> getAll() {
        return pokemones;
    }

    @Override
    public Pokemon add(Pokemon p) {
        return null;
    }
}
