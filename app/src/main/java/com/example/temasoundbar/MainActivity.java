package com.example.temasoundbar;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton blyat = findViewById(R.id.tema1);
        ImageButton taYopto = findViewById(R.id.tema2);

        final MediaPlayer blyatSound = MediaPlayer.create(getApplicationContext(), R.raw.blyat);
        final MediaPlayer taYoptoSound = MediaPlayer.create(getApplicationContext(), R.raw.yopto);

        blyat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                blyatSound.start();
            }
        });
        taYopto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                taYoptoSound.start();
            }
        });
    }
}
