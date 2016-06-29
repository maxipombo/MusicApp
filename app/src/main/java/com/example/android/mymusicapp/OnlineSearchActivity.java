package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OnlineSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_search);
    }
}


/*As far as I understand, online music might be retrieved from https://developers.soundcloud.com/
* Tutorial that I found (https://www.sitepoint.com/develop-music-streaming-android-app/) suggests using
* following libraries:
* Retrofit library which simplifies HTTP communication;
* Gson library that serializes and deserializes java objects into JSON. This should save a developer
* from creating a Track object;
* Picasso library to set the text of the track and its image.*/