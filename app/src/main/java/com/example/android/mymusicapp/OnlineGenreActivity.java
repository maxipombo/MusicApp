package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class OnlineGenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_genre);

        TextView rock = (TextView) findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(OnlineGenreActivity.this, GenreRockActivity.class);
                startActivity(rockIntent);
            }
        });

        TextView pop = (TextView) findViewById(R.id.pop);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(OnlineGenreActivity.this, GenrePopActivity.class);
                startActivity(popIntent);
            }
        });

        TextView rap = (TextView) findViewById(R.id.rap);
        rap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(OnlineGenreActivity.this, GenreRapActivity.class);
                startActivity(rapIntent);
            }
        });

        TextView dance = (TextView) findViewById(R.id.dance);
        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent danceIntent = new Intent(OnlineGenreActivity.this, GenreDanceActivity.class);
                startActivity(danceIntent);
            }
        });

        TextView jazz = (TextView) findViewById(R.id.jazz);
        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jazzIntent = new Intent(OnlineGenreActivity.this, GenreJazzActivity.class);
                startActivity(jazzIntent);
            }
        });

        TextView metal = (TextView) findViewById(R.id.metal);
        metal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent metalIntent = new Intent(OnlineGenreActivity.this, GenreMetalActivity.class);
                startActivity(metalIntent);
            }
        });

        TextView instrumental = (TextView) findViewById(R.id.instrumental);
        instrumental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent instrIntent = new Intent(OnlineGenreActivity.this, GenreInstrumentalActivity.class);
                startActivity(instrIntent);
            }
        });
    }
}

/*Retrieving tracks from the cloud should be done the same way as in the online search except that
* here one of the search criteria is a genre.*/