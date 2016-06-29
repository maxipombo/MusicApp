package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RecentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent);
    }
}

/*This activity lists all the songs listened recently, both online and offline. As far as I understand,
I will need to create a database where I'll put all the songs that are listened to on the device.
I suppose, there will be a counter for each song, which will allow to distinguish songs that were
listened to recently. The ContentResolver class will be responsible for retrieving tracks.
MediaPlayer class will be involved in playing audio*/