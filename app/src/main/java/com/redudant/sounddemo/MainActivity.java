package com.redudant.sounddemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //variable global
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if the variable is here continue the media player that pause
        mediaPlayer = MediaPlayer.create(this, R.raw.bluebird);

    }

    public void playAudio(View view) {

        mediaPlayer.start();
    }

    public void pauseAudio(View view) {
        mediaPlayer.pause(); //pause

        //mediaPlayer.stop(); //stop

    }
}
