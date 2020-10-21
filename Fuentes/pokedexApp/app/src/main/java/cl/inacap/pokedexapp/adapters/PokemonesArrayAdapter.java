package cl.inacap.pokedexapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

import cl.inacap.pokedexapp.R;
import cl.inacap.pokedexapp.dto.Pokemon;

public class PokemonesArrayAdapter extends ArrayAdapter<Pokemon> {
    private Activity activity;
    private List<Pokemon> pokemones;
    public PokemonesArrayAdapter(@NonNull Activity context, int resource, @NonNull List<Pokemon> objects) {
        super(context, resource, objects);
        this.activity = context;
        this.pokemones = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.activity.getLayoutInflater();

        View fila = inflater.inflate(R.layout.pokemones_list, null, true);

        TextView nombreTv = fila.findViewById(R.id.nombre_pok_lv);
        ImageView imgPok = fila.findViewById(R.id.img_pok_lv);
        TextView idTv = fila.findViewById(R.id.pok_id_lv);

        Pokemon actual = pokemones.get(position);

        nombreTv.setText(actual.getNombre());
        idTv.setText(actual.getId() + ".");
        Picasso.get().load(actual.getLogo()).resize(500,500).centerCrop().into(imgPok);
    return fila;
    }
}
