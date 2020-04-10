package com.example.temasoundbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;


import com.example.temasoundbar.adapter.ButtonAdapter;
import com.example.temasoundbar.services.ConstantsWorker;


public class MainActivity extends AppCompatActivity {

    private RecyclerView buttonsList;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter buttonAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtonsList();

    }

    private void initButtonsList() {
        buttonsList = findViewById(R.id.buttonsList);

        buttonsList.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        buttonsList.setLayoutManager(layoutManager);


        buttonAdapter = new ButtonAdapter(ConstantsWorker.getIdArray(),ConstantsWorker.getAllButtonsNames(),MainActivity.this);
        buttonsList.setAdapter(buttonAdapter);
    }


    /*private void initElements(int count) {
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
*/


}