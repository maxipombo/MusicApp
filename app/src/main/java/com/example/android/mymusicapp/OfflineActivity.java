package com.example.android.mymusicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class OfflineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline);

        TextView offline_search = (TextView) findViewById(R.id.offline_search);
        offline_search.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent offlineSearchIntent = new Intent(OfflineActivity.this, OfflineSearchActivity.class);
                startActivity(offlineSearchIntent);
            }
        });

        TextView offline_albums = (TextView) findViewById(R.id.offline_albums);
        offline_albums.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent offlineAlbumsIntent = new Intent(OfflineActivity.this, OfflineAlbumsActivity.class);
                startActivity(offlineAlbumsIntent);
            }
        });

        TextView offline_songs = (TextView) findViewById(R.id.offline_songs);
        offline_songs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent offlineSongsIntent = new Intent(OfflineActivity.this, OfflineSongsActivity.class);
                startActivity(offlineSongsIntent);
            }
        });

    }
}
