package com.example.temasoundbar.services;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;


public class TemaOnCLickListener implements View.OnClickListener{

    int mediaFileId;
    Context context;

    public TemaOnCLickListener(int mediaFileId, Context context) {
        this.mediaFileId = mediaFileId;
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        MediaPlayer mp = MediaPlayer.create(context, mediaFileId);
        mp.start();

    }

}
