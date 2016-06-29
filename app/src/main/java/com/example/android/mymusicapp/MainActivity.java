package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView offline = (TextView) findViewById(R.id.offline_category);
        offline.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent offlineIntent = new Intent(MainActivity.this, OfflineActivity.class);
                startActivity(offlineIntent);
            }
        });

        TextView online = (TextView) findViewById(R.id.online_category);
        online.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onlineIntent = new Intent(MainActivity.this, OnlineActivity.class);
                startActivity(onlineIntent);
            }
        });

        TextView radio = (TextView) findViewById(R.id.radio_category);
        radio.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(MainActivity.this, RadioActivity.class);
                startActivity(radioIntent);
            }
        });

        TextView recent = (TextView) findViewById(R.id.recent_category);
        recent.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentIntent = new Intent(MainActivity.this, RecentActivity.class);
                startActivity(recentIntent);
            }
        });

        TextView favorites = (TextView) findViewById(R.id.favorites_category);
        favorites.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(favoritesIntent);
            }
        });
    }
}
