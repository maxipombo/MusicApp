package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OfflineSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_search);
    }
}


/*To perform a search, I will add a SearchView widget to the app bar. I'll have to create a
* searchable configuration and searchable activity. I will also need the ContentResolver class to
* retrieve tracks on the device. MediaPlayer class will be involved in playing audio*/