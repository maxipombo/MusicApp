package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
    }
}

/*This activity will involve the same technique as RecentActivity. It will lists all the songs
marked as favorite. I suppose, this will involve a database which will contain favorite music.
The ContentResolver class will be responsible for retrieving tracks.
MediaPlayer class will be involved in playing audio*/