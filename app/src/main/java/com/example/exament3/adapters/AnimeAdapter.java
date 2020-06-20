package com.example.exament3.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exament3.R;
import com.example.exament3.models.Anime;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>{

    //static boolean activo = false;

    private List<Anime> mData;
    public AnimeAdapter(List<Anime> data) {
        mData = data;
    }

    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.item_anime, parent,false);

        return new AnimeViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int position) {
        TextView tvNombre = holder.mView.findViewById(R.id.tvNombre);
        TextView tvDescripcion = holder.mView.findViewById(R.id.tvDescripcion);
        ImageView ivAlbum = holder.mView.findViewById(R.id.ivAnime);
        final ImageView ivEstrella = holder.mView.findViewById(R.id.ivEstrella);

        final Anime animes = mData.get(position);

        tvNombre.setText(animes.nombre);
        tvDescripcion.setText(animes.descripcion);
        Picasso.get().load(animes.imagen).into(ivAlbum);

        ivEstrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!animes.favorito){
                    ivEstrella.setImageResource(R.drawable.imageedit_1_3028793316);
                    animes.favorito = true;
                }
                else {
                    ivEstrella.setImageResource(R.drawable.imageedit_6_6683905058);
                    animes.favorito = false;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder {
        public View mView;
        public Context context;
        public AnimeViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            mView = itemView;
            this.context = context;
        }
    }
}
