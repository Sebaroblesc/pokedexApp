package cl.inacap.pokedexapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import cl.inacap.pokedexapp.adapters.PokemonesArrayAdapter;
import cl.inacap.pokedexapp.dao.PokemonesDAO;
import cl.inacap.pokedexapp.dao.PokemonesDAOLista;
import cl.inacap.pokedexapp.dto.Pokemon;

public class MainActivity extends AppCompatActivity {
    private ListView pokemonesLv;
    private List<Pokemon> pokemones;
    private PokemonesArrayAdapter adaptador;
    private PokemonesDAO pokemonesDAO = PokemonesDAOLista.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        pokemones = pokemonesDAO.getAll();
        adaptador = new PokemonesArrayAdapter(this, R.layout.pokemones_list, pokemones);
        pokemonesLv = findViewById(R.id.pokemones_lv);
        pokemonesLv.setAdapter(adaptador);
        pokemonesLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(MainActivity.this, VerPokemonActivity.class);

            Pokemon pokActual = pokemones.get(position);
            intent.putExtra("pokemon", pokActual);

            startActivity(intent);

            }
        });
    }
}