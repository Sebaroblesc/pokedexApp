package cl.inacap.pokedexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import cl.inacap.pokedexapp.dto.Pokemon;

public class VerPokemonActivity extends AppCompatActivity {
    private TextView nombreTxt;
    private Toolbar toolbar;
    private ImageView imagenPok;
    private TextView descPok;
    private ImageView logoImg;
    private TextView idTxt;

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_pokemon);
        this.toolbar = findViewById(R.id.toolbar);
        this.setSupportActionBar(this.toolbar);
        this.nombreTxt = findViewById(R.id.nombre_view);
        this.imagenPok = findViewById(R.id.foto_view);
        this.logoImg = findViewById(R.id.tipo_view);
        this.descPok = findViewById(R.id.desc_view);
        this.idTxt = findViewById(R.id.id_view);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowHomeEnabled(true);
        if(getIntent() != null){
            Pokemon pokemon = (Pokemon) getIntent().getSerializableExtra("pokemon");
            this.nombreTxt.setText(pokemon.getNombre());
            this.idTxt.setText(pokemon.getId() + ".");
            this.descPok.setText(pokemon.getDescripcion());
            Picasso.get().load(pokemon.getFoto()).resize(500,500).centerCrop().into(this.imagenPok);
            Picasso.get().load(pokemon.getLogo()).resize(500,500).centerCrop().into(this.logoImg);
        }
    }
}