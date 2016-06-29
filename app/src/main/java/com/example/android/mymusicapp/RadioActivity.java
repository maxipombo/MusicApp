package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
    }
}

 /*To stream radio, this class should contain public class MediaPlayer. onClickListener
 * method will be set on each TextView with the name of the radio. It will call MediaPlayer
 * that will stream music.*/