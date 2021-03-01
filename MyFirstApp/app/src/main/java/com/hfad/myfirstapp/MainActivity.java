package com.hfad.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends Activity {
    private CardHandler core = new CardHandler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(this, MyService.class));
    }

    public void onClickSwitchCard(View view) {
        stopService(new Intent(this, MyService.class));
        TextView brands = findViewById(R.id.promptView);
        Card card = core.switchCards();
        ConstraintLayout background = findViewById(R.id.background);
        TextView devBox = findViewById(R.id.devbox);
        background.setBackgroundColor(Color.parseColor(card.getbColor()));
        //updates devbox
        if(devBox.isShown()){
            devBox.setText(core.updateDevbox());
        }

        brands.setText(card.displayCard());
    }
}