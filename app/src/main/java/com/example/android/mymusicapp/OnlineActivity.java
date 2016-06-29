package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OnlineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);

        TextView online_search = (TextView) findViewById(R.id.online_search);
        online_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onlineSearchIntent = new Intent(OnlineActivity.this, OnlineSearchActivity.class);
                startActivity(onlineSearchIntent);
            }
        });

        TextView online_genre = (TextView) findViewById(R.id.online_genre);
        online_genre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onlineGenreIntent = new Intent(OnlineActivity.this, OnlineGenreActivity.class);
                startActivity(onlineGenreIntent);
            }
        });
    }
}
