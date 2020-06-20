package com.example.exament3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.exament3.adapters.AnimeAdapter;
import com.example.exament3.models.Anime;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;
    private AnimeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rvAnimes);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new AnimeAdapter(dataSet());
        mRecyclerView.setAdapter(mAdapter);
    }

    private List<Anime> dataSet(){
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("Fullmetal Alchemist", "Tras perder a su madre, Alphonse y Edward Elric tratan de revivirla usando la alquimia humana.", "https://4.bp.blogspot.com/-LsemjnkLIbo/WS5_QJpNrlI/AAAAAAAAB3I/baaxLT_mrR8Vh9KJclqvWmjmiBbejuOdgCLcB/s1600/Fullmetal%2BAlchemist.png",false));
        animes.add(new Anime("Shigatsu wa Kimi no Uso", "Que significa Tu mentira en abril, es una serie de televisión animada japonesa que se transmitió por primera vez en 2014.","https://i1.pngguru.com/preview/282/84/835/shigatsu-wa-kimi-no-uso-v3-anime-icon-shigatsu-wa-kimi-no-uso-v3-png-icon.jpg",false));
        animes.add(new Anime("Toradora!","El título Toradora! deriva de los nombres de los dos protagonistas, Taiga Aisaka y Ryūji Takasu.","https://img1.ak.crunchyroll.com/i/spire2/0c40842ee6753a33e292ab258eb901171406587958_full.jpg",false));
        animes.add(new Anime("Noragami", "Yato es un dios menor que sueña con tener una gran cantidad de seguidores que lo adoren y recen plegarias por él.","https://ramenparados.com/wp-content/uploads/2017/09/Noragami-Aragoto_SP_SP_2560x1440-1000x600.jpg",true));
        animes.add(new Anime("Love Is War","Este anime se centra en dos jóvenes estudiantes Miyuki Shirogane y Kaguya Shinomiya","https://m.media-amazon.com/images/I/51gWy63prxL.jpg",false));
        animes.add(new Anime("KonoSuba!","Es una serie de novelas ligeras japonesas escritas por Natsume Akatsuki e ilustradas por Kurone Mishima.", "https://4.bp.blogspot.com/-yrZmlUVr_FY/XJe7vxNj7mI/AAAAAAAALMI/4s55GoqCNBsiYlU7nHAR5KPfHhVvKWTywCLcBGAs/s1600/konosuba-anime-pelicula.jpg",false));
        animes.add(new Anime("Dragon Ball","Sigue las aventuras de Son Gokū desde su infancia hasta su edad adulta","https://revistaelcrisol.com/wp-content/uploads/2015/06/dragon-ball-super-descrip1.jpg",false));
        animes.add(new Anime("Pokemon", "Narra la historia de Ash Ketchum, un joven entrenador Pokémon de Pueblo Paleta","https://i.blogs.es/1a9605/pokemon-anime/1366_2000.jpeg",false));
        animes.add(new Anime("Attack On Titan","También conocida en países de habla hispana como Ataque a los titanes y Ataque de los titanes.","https://m.media-amazon.com/images/M/MV5BMTY5ODk1NzUyMl5BMl5BanBnXkFtZTgwMjUyNzEyMTE@._V1_UY1200_CR85,0,630,1200_AL_.jpg",false));
        animes.add(new Anime("Black Clover","En un mundo en el que la magia lo es todo, Asta y Yuno son dos niños que encuentran abandonados el mismo día en una iglesia.","https://3.bp.blogspot.com/-QJyuonXRe90/W46k4iGAuBI/AAAAAAAAGcU/ZOKFBv_-3so63XEwJVr0ydCFmgF32hK6gCLcBGAs/s1600/black-clover-anime.jpg",false));

        return animes;
    }
}