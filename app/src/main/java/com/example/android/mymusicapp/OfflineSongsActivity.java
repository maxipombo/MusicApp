package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OfflineSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_songs);
    }
}


/*This activity will list all the songs found on the device. The ContentResolver class will be
responsible for retrieving tracks. MediaPlayer class will be involved in playing audio*/