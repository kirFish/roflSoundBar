package com.example.temasoundbar;

import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String[] audioFileNames = {"blyat.m4a",
            "diemotherfucker.m4a","eeeeee.m4a","fuck.m4a",
            "fuckinganimal.m4a","howareyou.m4a","iwillfindyou.m4a",
            "lay.m4a","molotkompoebalu.m4a","nonono.m4a",
            "nuclearreactor.m4a","nudanuda.m4a","nusmotri.m4a",
            "ohfuck.m4a","ohfuck2.m4a","rebyat.m4a",
            "screeeeeam.m4a","sharaga.m4a","skatynaebanaya.m4a",
            "solisten.m4a","stupidcheater.m4a","surrender.m4a",
            "tablyatskiawaper.m4a","tayopto.m4a","thisisshitnotasolution.m4a",
            "tryrust.m4a","understood.m4a","whatthefuckmotherfucker.m4a",
            "yaposhel.m4a","yesyesyes.m4a","youbledina.m4a",
            "youcantdevide.m4a","youweretoldtogo.m4a","youweretoldtogo.m4a"};

    ImageButton[] temaButtons;
    TextView[]  temaLabels;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initElements(23);


    }


    private void initElements(int count) {
        temaButtons = new ImageButton[count];
        temaLabels = new TextView[count];

        for (int i = 0; i < count ; i++) {
            int[] currentId = getId(i);
            temaButtons[i] = (ImageButton) findViewById(currentId[0]);
            temaButtons[i].setClickable(true);
            temaButtons[i].setOnClickListener(new TemaButtonClicked(currentId[2]));
            temaLabels[i] = (TextView)findViewById(currentId[1]);
            temaLabels[i].setText(audioFileNames[i].replace(".m4a",""));

        }

    }


    //rewrite to something less stupid
    private int[] getId(int i) {
        switch(i){
            case 1:
                return new int[]{R.id.temaB2, R.id.tema2,R.raw.diemotherfucker};
            case 2:
                return new int[]{R.id.temaB3, R.id.tema3,R.raw.eeeeee};
            case 3:
                return new int[]{R.id.temaB4, R.id.tema4,R.raw.fuck};
            case 4:
                return new int[]{R.id.temaB5, R.id.tema5,R.raw.fuckinganimal};
            case 5:
                return new int[]{R.id.temaB6, R.id.tema6,R.raw.howareyou};
            case 6:
                return new int[]{R.id.temaB7, R.id.tema7,R.raw.iwillfindyou};
            case 7:
                return new int[]{R.id.temaB8, R.id.tema8,R.raw.lay};
            case 8:
                return new int[]{R.id.temaB9, R.id.tema9,R.raw.molotkompoebalu};
            case 9:
                return new int[]{R.id.temaB10, R.id.tema10,R.raw.nonono};
            case 10:
                return new int[]{R.id.temaB11, R.id.tema11,R.raw.nuclearreactor};
            case 11:
                return new int[]{R.id.temaB12, R.id.tema12,R.raw.nudanuda};
            case 12:
                return new int[]{R.id.temaB13, R.id.tema13,R.raw.nusmotri};
            case 13:
                return new int[]{R.id.temaB14, R.id.tema14,R.raw.ohfuck};
            case 14:
                return new int[]{R.id.temaB15, R.id.tema15,R.raw.ohfuck2};
            case 15:
                return new int[]{R.id.temaB16, R.id.tema16,R.raw.rebyat};
            case 16:
                return new int[]{R.id.temaB17, R.id.tema17,R.raw.screeeeeam};
            case 17:
                return new int[]{R.id.temaB18, R.id.tema18,R.raw.sharaga};
            case 18:
                return new int[]{R.id.temaB19, R.id.tema19,R.raw.skatynaebanaya};
            case 19:
                return new int[]{R.id.temaB20, R.id.tema20,R.raw.solisten};
            case 20:
                return new int[]{R.id.temaB21, R.id.tema21,R.raw.stupidcheater};
            case 21:
                return new int[]{R.id.temaB22, R.id.tema22,R.raw.surrender};
            case 22:
                return new int[]{R.id.temaB23, R.id.tema23,R.raw.tablyatskiawaper};
            default:
                return new int[]{R.id.temaB1, R.id.tema1,R.raw.blyat};
        }
    }


    class TemaButtonClicked implements View.OnClickListener {

        int mediaFileId;

        public TemaButtonClicked(int mediaFileId) {
            this.mediaFileId = mediaFileId;
        }

        @Override
        public void onClick(View v) {
            MediaPlayer mp = MediaPlayer.create(getApplicationContext(), mediaFileId);
            mp.start();

        }
    }
}
